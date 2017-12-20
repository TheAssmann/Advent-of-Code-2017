package advent;

import java.util.*;

public class Day4 {

    private String input;
    private List<List<String>> inputList;


    public Day4(String input) {
        this.input = input;
        inputList = new ArrayList<>();

        String[] lines = input.split("\n");
        for (String line : lines) {
            inputList.add(Arrays.asList(line.split(" ")));
        }

    }

    public int getResult() {
        int result = 0;

        for (List<String> line : inputList) {
            if (checkPassPhrase(line)) result++;
        }

        return result;
    }

    public int getAnagramCheck() {
        int result = 0;

        for (List<String> line : inputList) {
            if (checkPassPhrase(line) && checkPassPhraseAnagram(line))
                result++;
        }

        return result;
    }

    /**
     * Checks for duplicates in a list of words
     * @param line passphrase. a list of words
     * @return true if no duplicates, otherwise false
     */
    private boolean checkPassPhrase(List<String> line) {
        Set<String> stringSet = new HashSet<>(line);
        return (line.size() == stringSet.size());
    }

    /**
     * Checks if a list of words contains anagrams of any word in it.
     * @param line passphrase. a list of words
     * @return true if no anagrams, otherwise false
     */
    private boolean checkPassPhraseAnagram(List<String> line) {
        for(String word: line) {
            if(containsAnagram(line, word))
                return false;
        }

        return true;
    }

    /**
     * Checks if a given list of words contains an anagram of the given word
     * @param line list of words to check
     * @param word word for which to check anagrams
     * @return true if the list contains an anagram of the word, otherwise false
     */
    private boolean containsAnagram(List<String> line, String word) {
        List<String> allAnagrams = createAllAnagrams(word);
        allAnagrams.remove(word);

        for (String anagram: allAnagrams) {
            if (line.contains(anagram))
                return true;
        }

        return false;
    }

    /**
     * a - a
     * ab - ab, ba
     * abc - abc, acb, bac, bca, cab, cba
     * @param word
     * @return
     */
    public List<String> createAllAnagrams(String word) {
        List<String> chars = Arrays.asList(word.split(""));

        List<String> anagrams = new ArrayList<>();

        if (word.length() <=1) {
            anagrams.add(word);
            return anagrams;
        }

        for (int i=0; i < chars.size(); i++) {
            List<String> rest = new ArrayList<>(chars);
            String currentChar = chars.get(i);
            rest.remove(i);
            List<String> restAnagrams = createAllAnagrams(createSingleString(rest));
            for (String anagram : restAnagrams)
                anagrams.add(currentChar + anagram);
        }

        // remove duplicates by converting in a hashset
        Set<String> set = new HashSet<>(anagrams);
        return new ArrayList<>(set);
    }

    private String createSingleString(List<String> characters) {
        StringBuilder sb = new StringBuilder();
        for (String character: characters){
            sb.append(character);
        }
        return sb.toString();
    }

}
