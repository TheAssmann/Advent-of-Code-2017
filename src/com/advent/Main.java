package advent;

public class Main {

    public static void main(String[] args) {
        //day1();
        //day2();
        //day3();
        //day4();
        day5();
    }

    public static void day1() {
        Day1 day1 = new Day1("951484596541141557316984781494999179679767747627132447513171626424561779662873157761442952212296685573452311263445163233493199211387838461594635666699422982947782623317333683978438123261326863959719777179228599319321138948466562743761584836184512984131635354116264899181952748224523953976485816295227945792555726121913344959454458829485471174415775278865324142733339789878929596275998341778873889585819916457474773252249179366599951454182657225576277834669222982366884688565754691273745959468648957498511326215934353963981471593984617554514519623785326888374742147318993423214834751785956958395133486656388454552769722562524415715913869946325551396638593398729938526424994348267935153555851552287223313383583669912941364344694725478258297498969517632881187394141593479818536194597976519254215932257653777455227477617957833273463216593642394215275314734914719726618923177918342664351954252667253233858814365351722938716621544226598956257753212248859258351363174782742336961425325381561575992352415514168782816173861148859478285339529151631429536819286498721812323861771638574344416879476255929929157912984151742613268754779685396125954595318134933366626594498249956388771723777242772654678448815844555372892574747735672368299826548254744359377667294764559334659523233146587568261116253155189394188696831691284711264872914348961888253386971994431352474717376878745948769171243242621219912378731755544387249443997382399714738351857752329367997665166956467544459817582915478514486541453932175598413554259672117364863112592515988922747164842668361925135551248923449968328385889877512156952725198691746951431443497496455761516486573476185321748523644283494181119399874324683922393547682851931435931276267766772798261563117954648576421741384823494187895272582575669685279986988357796138794326125852772995446355723211161523161886222562853546488411563473998633847953246787557146187696947831335722888918172961256498971868946237299523474841983527391489962357196433927251798764362493965894995592683296651874787384247326643886774966828657393717626591578321174832222434128817871765347278152799425565633521152643686221411129463425496425385516719682884157452772141585743166647191938727971366274357874252166721759");
        System.out.println("Day1/1: " + day1.getResult());

        day1 = new Day1("951484596541141557316984781494999179679767747627132447513171626424561779662873157761442952212296685573452311263445163233493199211387838461594635666699422982947782623317333683978438123261326863959719777179228599319321138948466562743761584836184512984131635354116264899181952748224523953976485816295227945792555726121913344959454458829485471174415775278865324142733339789878929596275998341778873889585819916457474773252249179366599951454182657225576277834669222982366884688565754691273745959468648957498511326215934353963981471593984617554514519623785326888374742147318993423214834751785956958395133486656388454552769722562524415715913869946325551396638593398729938526424994348267935153555851552287223313383583669912941364344694725478258297498969517632881187394141593479818536194597976519254215932257653777455227477617957833273463216593642394215275314734914719726618923177918342664351954252667253233858814365351722938716621544226598956257753212248859258351363174782742336961425325381561575992352415514168782816173861148859478285339529151631429536819286498721812323861771638574344416879476255929929157912984151742613268754779685396125954595318134933366626594498249956388771723777242772654678448815844555372892574747735672368299826548254744359377667294764559334659523233146587568261116253155189394188696831691284711264872914348961888253386971994431352474717376878745948769171243242621219912378731755544387249443997382399714738351857752329367997665166956467544459817582915478514486541453932175598413554259672117364863112592515988922747164842668361925135551248923449968328385889877512156952725198691746951431443497496455761516486573476185321748523644283494181119399874324683922393547682851931435931276267766772798261563117954648576421741384823494187895272582575669685279986988357796138794326125852772995446355723211161523161886222562853546488411563473998633847953246787557146187696947831335722888918172961256498971868946237299523474841983527391489962357196433927251798764362493965894995592683296651874787384247326643886774966828657393717626591578321174832222434128817871765347278152799425565633521152643686221411129463425496425385516719682884157452772141585743166647191938727971366274357874252166721759");
        System.out.println("Day1/2: " + day1.getCircularResult());
    }

    public static void day2() {
        Day2 day2 = new Day2("493\t458\t321\t120\t49\t432\t433\t92\t54\t452\t41\t461\t388\t409\t263\t58\n" +
                "961\t98\t518\t188\t958\t114\t1044\t881\t948\t590\t972\t398\t115\t116\t451\t492\n" +
                "76\t783\t709\t489\t617\t72\t824\t452\t748\t737\t691\t90\t94\t77\t84\t756\n" +
                "204\t217\t90\t335\t220\t127\t302\t205\t242\t202\t259\t110\t118\t111\t200\t112\n" +
                "249\t679\t4015\t106\t3358\t1642\t228\t4559\t307\t193\t4407\t3984\t3546\t2635\t3858\t924\n" +
                "1151\t1060\t2002\t168\t3635\t3515\t3158\t141\t4009\t3725\t996\t142\t3672\t153\t134\t1438\n" +
                "95\t600\t1171\t1896\t174\t1852\t1616\t928\t79\t1308\t2016\t88\t80\t1559\t1183\t107\n" +
                "187\t567\t432\t553\t69\t38\t131\t166\t93\t132\t498\t153\t441\t451\t172\t575\n" +
                "216\t599\t480\t208\t224\t240\t349\t593\t516\t450\t385\t188\t482\t461\t635\t220\n" +
                "788\t1263\t1119\t1391\t1464\t179\t1200\t621\t1304\t55\t700\t1275\t226\t57\t43\t51\n" +
                "1571\t58\t1331\t1253\t60\t1496\t1261\t1298\t1500\t1303\t201\t73\t1023\t582\t69\t339\n" +
                "80\t438\t467\t512\t381\t74\t259\t73\t88\t448\t386\t509\t346\t61\t447\t435\n" +
                "215\t679\t117\t645\t137\t426\t195\t619\t268\t223\t792\t200\t720\t260\t303\t603\n" +
                "631\t481\t185\t135\t665\t641\t492\t408\t164\t132\t478\t188\t444\t378\t633\t516\n" +
                "1165\t1119\t194\t280\t223\t1181\t267\t898\t1108\t124\t618\t1135\t817\t997\t129\t227\n" +
                "404\t1757\t358\t2293\t2626\t87\t613\t95\t1658\t147\t75\t930\t2394\t2349\t86\t385");
        System.out.println("Day2/1: " + day2.getResult());
        System.out.println("Day2/2: " + day2.getEvenlyDividedResult());
    }

    public static void day3() {
        Day3 day3 = new Day3(265149);
        System.out.println("Day3/1: " + day3.getResult());
    }

    public static void day4() {
        Day4 day4 = new Day4("una bokpr ftz ryw nau yknf fguaczl anu\n" +
                "tvay wvco bcoblpt fwzg sfsys zvuqll mcbhwz ovcw fgdy\n" +
                "ynsocz vid rfmsy essqt fpbjvvq sldje qfpvjvb\n" +
                "yvh nxc kla vhy vkbq cxfzgr\n" +
                "kljv ymobo jlvk ebst cse cmlub tavputz omoby psif\n" +
                "ebfuvvu paqgzri uvvubef hglk jvn gzeln bdl ziqgpra bzcfa\n" +
                "tclq ytw tclq tezcqys\n" +
                "qae eofr yzwcwqf wqm ytcdnc pxnmkw\n" +
                "krryi irykr ycp lbeed ykrir lhq rdd tyujwd\n" +
                "hms pii lxoa dchsvz bepjwst bllxkqg hsm yrdj myzvju msh lwnnc\n" +
                "yxqh hqxy xkn ljjsqjh jjljshq\n" +
                "mhgsehj urbvnvf gbz ykxsd hsmgehj wtoc ujpfaos eir vifog tsy kdo\n" +
                "wfruf wwijme pxbbsvf asmgs ccbn vwtc mkhah oxxfh\n" +
                "lxqy jzvcvd cfgg uahxrwr dqmaqr bwzm wruxhra lrb lmk\n" +
                "jspgxo yuhgni njzqtn zglkzz ybc itj orqr zgqwuoo mjagh erll srqrk\n" +
                "cbrtnbx ukblei ienmdm sinzq lytyliz mma lizylty zeumwgu\n" +
                "aeggz eljcry buqdeog dvjzn ilvw arz vep kxdzm mvh szkf\n" +
                "imn sfty ugg flqq nydky mni bkqzlok wye lehwlmp xeyfmj\n" +
                "beyv oamrpkc tebdkwv zlq jes mqvif sej qpsnmjz edvtbkw\n" +
                "hylmacl wwlra xntnvg ppvb bzof cymllha\n" +
                "qktxomf ngfpuz qqz malc zxuqz szg zis vzro rfpgk\n" +
                "phru sxlg qzqlw uej vmd omzga jue\n" +
                "drzgojf ttqdqar weikik wvrjtxi gbj jramqh nlwoj drzgojf bgabmn xqlaeun\n" +
                "aiuohu pca apkmv cpa kmvpa nmdn\n" +
                "gelymv eto itcnuhn ote teo\n" +
                "oxiz xzio kqu wwgow\n" +
                "picoyb coibpy acsw ehlirq deyz gymqvz opicyb vuet lrl\n" +
                "zerg rezg miwtjgw gezr cui\n" +
                "mlh qlu ktil tnlgnrk bfqbk pgg qxeyd noadmjo nonlsh eqxdy\n" +
                "yqqaq yqqqa xod oss\n" +
                "mkotw bznvs xowoofq sebp wsgpsmn fytcpc vvmzr vmzrv xwtxz zrvvm\n" +
                "dvs twhz teqmlow oqg sjetxd aku cwl qfvrkex mndsio hfg\n" +
                "itdl qwdagkk wli tdil vlgur dyl xvfm\n" +
                "wlmyd dwmlx zhmqd zqmhd edzsvmz yclg umpq\n" +
                "petva gazw byrca pvaet epkoqh nlp vqfl vatpe\n" +
                "rykn ckr dijkme kmiedj ozlh deikmj\n" +
                "kuecjh sfqv pojfzf fjopzf fjpfzo amxtc\n" +
                "hri gglmial lrwbyc memgszu hir cfwlg ylcrwb\n" +
                "rxrfbtv pwpra fngt auh rapwp zrruuq uah\n" +
                "cevc utfd ysrfcw nnlg fnqtx aua htteunu mrjhhj\n" +
                "tvnxznj mvpagt nqmxvnl mutn ntmu eybh vkqeaj frayclp\n" +
                "ygktzxo lzwwy qsipu nwb jdmw pahao paow mwjd uivqbnj woap nyyogcc\n" +
                "log zihz rsmx ixfr xwvd osg zxc gol ufnbig\n" +
                "dogve cnb osa xbafl vefr nxlw yjgquui\n" +
                "ucyl aaoae ktjvi fyps xvjhpbh iiur tuc\n" +
                "pqt jasxg ehhs lzjzzzl sqmmj vwyva eklbtv hksanb fuesnd oyw fuesdn\n" +
                "uankv wesi frhpau qiucu lim uzbdapf ciwjd tifbqxh tfbtsdi\n" +
                "vgjd izpofu fqjpcct phuz\n" +
                "cfg cfg rgahl frm emn pbfsmgy frm jemwqgn sfpm azunntj igl\n" +
                "daps hpe fqg err sapd dci vbzlqx gsigq eyp rre\n" +
                "iuqyqdy djprdj mgtkdxr pwmkzv wmkvzp hppisd pidphs\n" +
                "rlr rrl vhevh cucprc xki urte lrr zfc xrqydzk ipjkyxj kytul\n" +
                "jwbkaee rgyjl rjljbwe ppq plp pfts ijd ckpvmw mbdrqh zolt lzmr\n" +
                "alw law awl wknavtb esklsbj wvssyai\n" +
                "aqy ldf qdht soxkg qtfipe nsdm aqe rtlc fbqrk ius gybbhxr\n" +
                "xteov wgqoqim nlz szlj oxevt xwb\n" +
                "tmgdst fyn oul tsohzbq ltmxji fgops gatssx zxdzfc talb\n" +
                "zkvjpu jnhtc nxs jqv pyoqz zsj ckwd xot ykai\n" +
                "fxfarre yjbxvj lqfaglo mbxuv bmuxv bxumv\n" +
                "yrhi uosldj hryi fwres ycygw ycvxze zevxyc iyk\n" +
                "yphev xisbai xdb hzrbg ayxbhdx qnvbus pwc\n" +
                "wytqraw yvurj erqckl rvrvda xsh gsd bxtm acxle gpndk\n" +
                "kpvjtu vacggk oabcuoq qusf zitqpgn pbyq ocabouq ntpgizq gaiiry dke\n" +
                "frz ceozajo ljltawq tjepzp iflv\n" +
                "zntejm dkfgc ysno noys sony muy\n" +
                "qdnyvvw oykq bnmldt zjgauw pviurd cbcnl tnkhq ebsey bccln arvwe\n" +
                "iqazt xidjgom wcrdz itht lfh ifzwkj rwqxhy ervcgmt vojg lzntz ezg\n" +
                "tlcxioh qvvkan wpi ody\n" +
                "mhsy dwm hyms yegvvc\n" +
                "hbkvi wvemc uwxgqf pwrgu wcy wxqfgu qkzppc vxcwdwd rcgp ivjd wmevc\n" +
                "upc ucp cpu unmr pyod\n" +
                "bqfew ebwfq paccwh phgc fchhr jrnio\n" +
                "abh bjalls bdtac zzvt totdlc yptqmgu rpcin bch cqklqly\n" +
                "bsnss qcsgi tegyz lqoqkpf qvatlyu ibza mzfotsk lye oqqf mnor\n" +
                "lzrxca stkbn axhr wckbip bsntk ahrx\n" +
                "oricdw cnpte dbz nqx xloxc bdz fdsl uyvgi nvoy ezbi\n" +
                "nlcqye ofta jcvqvtg yxduyh btawc tjgvqvc tcvqjvg\n" +
                "nji znctdfm kkmp pmt ikhl jjoubc xnp zdctnmf covvmsh ydh ircplcm\n" +
                "yafkuk yasqsyt ytqayss nusgb ukfyka\n" +
                "yogcf emg jlkd blupemf axg wihhrb ysernt yznhz\n" +
                "gmc yyqtgp use lohoit\n" +
                "lclwa ojjkm rxr rrx\n" +
                "punyfv iphw ddbc jghx lrssszc bepexv sicpy syicp lszrscs vrqjb\n" +
                "rjanra juh hljdmad scu usc baifu ijs suc bgdbbv\n" +
                "ogs hehi lgiwowc wwezznc ogs lorcl naunpll wlmal ajcbj ciujw\n" +
                "slenm xxod vhf amhts\n" +
                "mrrduda mrrduda lwecwjv lwecwjv vvzmjla cjipv\n" +
                "ixnv invx inmzz aoxghpv\n" +
                "ulyvfrf zsup zfryjy xoo agdsd giw papa ljtu rzbjiq wrex\n" +
                "bzpv svpuyov mklrct uzox\n" +
                "fxs iypd uaqch kxazj ksjyv\n" +
                "uxaommf xtq uubbfk bmlq kdhgjzg oxwpag itfij irmkjx ggod sddcyo bopn\n" +
                "lch plmvfni qbjr dnu zjcod qlwax gejmyj gxjqm mfzkb gejmyj\n" +
                "yoa thrfbto wposvrm amulogu mcqzfax fjquli oay\n" +
                "kywj kqqhney ozuljxz wqwfte ubo mjj anhhg aphy ocfnef yhin ywnx\n" +
                "vxuledm wllj obqtsrr jwll uvmelxd xvj gbwte\n" +
                "hevc bitwu ydw ywd btiwu iuether gfe\n" +
                "dzn ssmfpel wbbdeyt xge hrfi\n" +
                "zebz ifhq euto ppfnrwc winkkj\n" +
                "utuly wtdt iahpe ihtxwmh zxun bqluj hsaxgcs ytluu jlfnnuv drxlctr myhp\n" +
                "kwxgy hreul rsnh wdmsx kkajywb\n" +
                "bond djq kccazc zvzcie hndm myx cmhyhkc ove ord dqj\n" +
                "zcong tekgn pbzs ywqgqgu eizrx ypydeku yqyjdjp dwsu zxire zcgon iggnvf\n" +
                "tkioh hflkm fsjz gisjbi otikh\n" +
                "ccdqqm fdabbne fyd lbyqm cyzgtd puitvjz nluf hirrpxd tgxrg vvl\n" +
                "hjnygbz fnu twwbp xqw pfdlt uoalyme rsd muayeol ezcq\n" +
                "kubeooi bxgwoun paogjs twvwlji opsajg higbdfi aazo evmj\n" +
                "sfipxe mqbkmrn plwqd zvq nmvom fyfbs nbs qkrbmmn eym kqnrmbm\n" +
                "ruhsp hurps mqws umm sphru\n" +
                "ksjs pgpxh qozg enplxbn oqzg rvjnaje sjsk\n" +
                "rbwbvog mhgtgg uld twrqz rbf kpop\n" +
                "lwho lohw ylhd dej lydh vsfffsm\n" +
                "icljgu gluijc vthqx orynv xhvqt\n" +
                "biav elxkct mtaw nlafk snyr cbqdwim blim rtrqmc wze cxktel\n" +
                "fgpeia ebkhga azlfsr bsj pipvwsd nry bayrjzl ftth ynr mfhd\n" +
                "ymlowur nighqgk yjv pyxf nan xamb ohm jvy owrxbg icbz\n" +
                "iyyt linaqu httt zyfeo udap mllq pdxo lpl djhqaou zkit llp\n" +
                "dxspk yge kcqjqpz ulb hoe mfx nwayo\n" +
                "rdnmmh gyqd qhxrzj dgizu lyittbv txngpdg fiu mwd ndp oks vxnxybi\n" +
                "eul ztpe evnz yxx iuwon rkbbsw liy mqhxt\n" +
                "qahp zwn ualtk txbt cbthj xchqy pirucp povdwq\n" +
                "mqwu mwww muiafa miaafu hzripx wmww\n" +
                "auw hyyi ylewfi ihva jknbrry voxzooq xaos xymv qzzjw hjc\n" +
                "enpb jqa ajciy cbeopfs tqrlqj ecudb gso cyjai gxoet\n" +
                "yohkjj yohjjk xapawgo rtgnjj\n" +
                "lnlxxn nxllnx vhjrev uoew zts smkd kynlrg\n" +
                "bkblpr vgafcy alju aiyqe eebtsyu buve hdesodl pspbohw\n" +
                "aacmw qpndwo tcwsfqy qecnms wondpq sto\n" +
                "wdsyxe edsxyw jnzruiw pfqdrhi\n" +
                "pfgxekl vswgxhb qyn mykn jimiatq zkcz jimiatq kaexgxm mykn\n" +
                "xegwn upudt dew uqjrcl abyof hbtiko wxgne sorgno etm\n" +
                "xzojs zxsjo szjox gumjtwi\n" +
                "gttngkk bwdgce bhuw fgo rcbf byw\n" +
                "ngtzwqx ptx xodmy ctmtf oioahmm qajlhje jzilpk cvypp ijaefz\n" +
                "arlx slcugvm hyuo zoptsh emyr tndx rroecp tdnx xea rtkpd\n" +
                "sfckdx ktyrjju ruwjtp zhqznj vncun\n" +
                "oqqh xpc itrdg gtrid hoqq tuo yijh ncp suvck jic\n" +
                "brrlqu twdt urblrq twtd\n" +
                "brfuh arwtkpu mzlj wdyqk\n" +
                "pmag dtwnva nect azld axqrwy apgm xbv gdq ienubsy andvwt\n" +
                "hqb qbh gxdl mwjn cmfsmik\n" +
                "yiwma utlor qxjfjsn aomlvu gxp ryj rfkdsw kuguhyi qxxpg\n" +
                "ifq wcvcgly jdalgzx lgcycwv rajmnqw\n" +
                "latakk yxxbw evy vey\n" +
                "odkvw ojgveb jhg qwhkyoh btvu qbfot nouv owgtsi pdwbmfn pmvcv dnqbo\n" +
                "tmka qqnty knz swi fyvmt ikcdu jfjzsfu dshgi cosacuj szjjuff\n" +
                "eanet uua fbztk bzkft\n" +
                "jepi hyo jgzplr jyqk zzcs iepj hfamvu bfgbz sjsnf lprgzj\n" +
                "mlca ywko mtg vkfv ojka zbelq qkaujs simt kafq qtycfzo\n" +
                "sqh omv llvra ecvxmtx dpnafv llvszx xzlsvl quj ufnhvod faraf fivmnl\n" +
                "pvxlls fzeoav ahgv uhq nodcr cohy vqisgaj jsfcyur dbohh\n" +
                "ztccbwk okv vok kov ywel\n" +
                "xyu cmaikc jgqu ozccdzk ybn yoeq fky aetrkj eyoyvla laiu cermo\n" +
                "sssnb kxly mgvaz jpffkq bysbwwu rfnkm eycp ipyd hyi wjew\n" +
                "obdfqmh flkm semednj iafewg lvh uwa ciepe\n" +
                "zmldp ykffe gtehz qlmvule edrtzg prund oagwto qia bvyxur\n" +
                "kjok neno qbxh wqgkkt ympclso poyclsm cajgnnn\n" +
                "paqili kur sfit jbqchzx bhjqzxc\n" +
                "fhghm ubtaana qbn autnaab aaaunbt vmz\n" +
                "exlrl hfnpq zgdwx smix nyg ogccrhj iimhhwc uhcldo oydwxp kqc jxxpycv\n" +
                "wtdqjfh ialoqr zeej ipoh qtjdwhf wdhqftj\n" +
                "jcgug cmtvmu ynhnilj txlv uemowyu cvrool oolcvr njr cxqntdh\n" +
                "uhtwtp tgnc jmmjl utiu jfxtsoz cxwqcz\n" +
                "qntxl lyownp tsp tps mixyge rqfqumc bxjiry zmaj azjm\n" +
                "abt bat tftvm nyjs jyns\n" +
                "hzsdh pwthfvm cedg hzsdh rsxtehn owh cedg\n" +
                "hcoiny aqbeme eeuigt pocpvox tiugee rwb tvgmyc ojg hgdaf\n" +
                "mzlwcfc uoobo bouoo tvgvmiu evsfkm popgm evmfsk ehxvits vebxbmd qhmz jzj\n" +
                "mypgg jbpx vgeb ahvjl zbm ancdzfy wytkcq\n" +
                "bivscw zmzmjxu jzm fwb ujefxp jzsiskp cgx atcj sszikjp cxg nqvxga\n" +
                "vvurbxp iry zlz gfnlpuy npyugfl\n" +
                "fpmee mhj iul lui liu\n" +
                "xjoesn ggsdc vnisnmw kyxmmv xphfq\n" +
                "zcsml ngzlpy udaoab eotbv ylca bfmums izx\n" +
                "pdi bpyoep cofsy qazl oaovek fvfbe sotc lfdmaea smvs\n" +
                "zajm bskaqhj qxyiptb bdyeuqr dqjrekn iywj\n" +
                "hzhky hukvpve iqcbwju nyiwb rvutxlb hyuah urnhxg savicaw hexr ptedk\n" +
                "qndji wrr sin ljogf ncrb zvt tvz\n" +
                "kvfke tjpzhrl zvd doq kxyw fdgr oqd egkybdh rqpfxks nja\n" +
                "escstpv ccc ryzdv gxkjuyt gkhw jxnfda awpzg csestpv\n" +
                "cpcd onxeae nimbrpt zyji qnuo ktxgwbj vtjfglz skcozd zgii zgii nimbrpt\n" +
                "lwq iue hfbv hgbg aeqc\n" +
                "vzgbod yjkoc ckt bpiaz\n" +
                "eyco ecoy uzousjp faxj utu yoec\n" +
                "fhqdi myd tvex bzizkcx pifcfhz fczhpif eofzv bqzd knbhbgj dok ffcizhp\n" +
                "qlqlgmz hofmnc cwtk ahgnpne acn prwdh hwdrp rfofhl atavrf afkcbk\n" +
                "sgl apyfr pwxzptv osuwy vmqqh soyuw lqilked oinhh\n" +
                "eglqdox gcxfxql ejtnwu wvho can eyu uetwnj elgdxqo atvpkk eailsnn cwosyn\n" +
                "mylxhuj kbc apnllw qbmtj sqy hxtnvoe ins iyudo aagezrq nsi ikvn\n" +
                "lpmzo tkdeg zilkm vdkmtf yulbdd dkfmtv\n" +
                "fzrv grq zfvr ychga gqr\n" +
                "vdjxx wew pdxgp cjywsc meoffrj pgpdx chxmw eizgz ruea\n" +
                "iaklyhx btqqik tbiqqk ynmq laxykhi qatrnsh lnmtm plz\n" +
                "sfogup jtdsx tsxjd wwzkyy wzywky vgdsgr\n" +
                "paupqb kyy bccklmr vopviup lctcxza yyk yky\n" +
                "gduuia doek hqcr upvb szeewnu rrrdz\n" +
                "lhnsaf lut kzf allu dvj tyngx zkf aqsgz rtkzzdz\n" +
                "xxqj msg xxqj ezmm tmyji msg cco tain ctpel\n" +
                "pvcfzv rhn hlhxyu bghzzpx dlhvr hrvdl lhuxhy\n" +
                "npzhkp voghdv rvezqff hvgvdo jndf gpa wevrwpu\n" +
                "faixq aecax hxdouer yqlngzd grf wid iwd cce xnmmr\n" +
                "ifqwiah dib ibd dtvkwqj mpn dtwjkqv kyntq xwlv\n" +
                "rwoiz dja cvv lvza kfdblq bgtwgh ongdub wggthb lvaz\n" +
                "xajf eyasx rupsyqx wubjwx bsrqi ripghci sbzxp sbz dhooax\n" +
                "ydnv tvhwgp uvrh yryhl yxdlwa ladwxy awi mkwyn ghvpwt\n" +
                "qrl vwdvwic ocbhpi bcmz dor lrq hokg gokh\n" +
                "adz echnlju ebnmw twjl cfw loq fqklyyq clgqq jtgpsu wltj\n" +
                "vwlgisb murtsw ldkacqv wxfcke vcqkald ldhh gsl kpzn\n" +
                "itnvo lyddd saewfse spnri vtmst iblx\n" +
                "qsgv qni wvqiih mneg lkpb quhbkyi\n" +
                "efwaaa huu fslzwpc uuh szflwpc\n" +
                "sgmj ajh vcwpcua enltaks aquooh bwoda txbuve\n" +
                "vbe astgezx xqbxkdj evb bev yuuesdc fvohzq\n" +
                "gpn oqxfz pbwibjw gljdbf gbldfj sis dpk iss\n" +
                "pha ebybvye ntxhs wcuce\n" +
                "odnnywv qpcjll aslxqjm injfs vkbturz atxi\n" +
                "zzncfj kbhk jzzvnwf kqipx qkxpi rzb czfnzj\n" +
                "ygu vqpnxkw trdtv rrte\n" +
                "hrutley ljxuuq yonbpmk hmpc etyrhlu\n" +
                "odxp fpvizzx dxop jjbr skhxq mpzawhe zptdxuu erxk adbbuk zfzipvx\n" +
                "qjovasi yutjpg rcp bykpctm fqmmg pckbymt hqj\n" +
                "ssqc cype tkowxb fbh rsluu zjk scrukwv pkuexk qlgjtdq oulrke\n" +
                "bkcd nnf hdj sdlweyr uyf kmvzq\n" +
                "sgeg moy png blv bblree ufe uqknuqd lnjwbh\n" +
                "snpex hrbcfok pffv cwrvhcs fpk uprhn gbpy zkxyi esug ccnnj\n" +
                "bmwue dugcrdu uifiy clid rdmodec jodp hti xptj tpopl vuwhdyi hnoq\n" +
                "cwlkg qsz nnp lfyk pwn dpe oeuzp jusxxkq qlnchc\n" +
                "tsmkvge pxauyc cxypua boi hybq rzf iioyi rtedkc gjmk iob mqb\n" +
                "cvip wgbjhe ulwg jckkwd gdu bmaoisp\n" +
                "drpl xbliszf rpld ngnvgxl xnrd xsmd oetrcmn xvfohp mtocren\n" +
                "habmf dmfxq qitw xxtybla cxvb colcvpj sowoeuh bhmfa plccvjo naftjgw\n" +
                "cix soo icx ahx cdrjyxe htcnp\n" +
                "acoksaf cgahlg tdj euchwnj bdn lunouq aewrk uktre kklwqy lnouuq\n" +
                "ibsel hwjbah vxuk bjxa dvzbpq tffqvo bjax qfoftv\n" +
                "iynms tzv jakuuw cmz cjnyr ddibtd gcb\n" +
                "tmgerk pvwizc lxoma ergmtk xmg loaxm\n" +
                "ajazon yjwt viyemnk wobzwwm jcucn nopymyq znaajo qcjtmlq ccjun ywvt oqczod\n" +
                "kdhgnv kdnvgh rpyrxx xpyrxr\n" +
                "qftmshx hrbr kcggxw jwtuk qxbzkn\n" +
                "ddi fjekwxs xxua cmmkrso\n" +
                "ptrsv favvfh innnnx nninnx\n" +
                "kzsnd pnf evtazgw wmjk gvxp bslajo\n" +
                "nphqtka umlxu ymw whqiab whqiab vwigkz pevtps\n" +
                "vhje cnu uzfzum rwucy mxr wyrdqfi gnkuwz dkrwc otfc vbfc\n" +
                "ubtzio vlijsst anruj qyntadb fnic klz ywqq fnic vlijsst\n" +
                "rprj ybyqawb tgeieih nzcr rjpr bjfpozh tpevsx flvjdq\n" +
                "kvqqzvm cfdm wzjmkq sbcfx vzmkvqq\n" +
                "zqtt elpg eglp uoe glep\n" +
                "lqv madhtch xevl fal ijmx chcpra lzl afl cndbvnq\n" +
                "yjx jyx xjy otwklfj\n" +
                "cur egsdzaz ocbx wvky coxb pgiysbh lclhvy gfu oxbc vqyjvhh\n" +
                "gtd pytdaz kecsku nkiud ytt bmgobx tyt pfleji ebqlifv lqp ytzadp\n" +
                "bopfdvy eovszvw krgu jhuhyqi kaczafr krgu zlfxtl\n" +
                "yixprs zqai oprgw vcsjoc pgorw ypx ijo urjcjqv\n" +
                "estg oqnhw xgwajp mpbsag ibzi\n" +
                "zggbt jmmtkru sye ybd ztggb\n" +
                "tzryuqb blyxnnu sjpmf yxe zimf uyzqtbr qbyrtzu\n" +
                "rzivz rxn invxqd nazw efzun bwnw ywx rfuda jhnoww mketav\n" +
                "zxfw zcaqi qaciz ktefiwk xwzf\n" +
                "ntougl fvyaxfr obml obml bjkm lgsqj yfcggdu rqcpgt ntougl nveto\n" +
                "rma dakifg pvfc ticvff iffctv difkga\n" +
                "wpnt eclov vmmoqh qvw mljlvnj hxrx\n" +
                "ijnpo uhgxrfe xxopw xuzwyd powlpo ctduj eepw gubnepv\n" +
                "rxcmve myxckxk ecid nxe xevrmc juzaonr ilkx zpb pbz mvgos yzr\n" +
                "yfecm wqkh defqqa mnzgx nwe ixxg rjdhe new\n" +
                "awztgx vqgnfd iwcakr ajaiwn jiwnaa uqfrim wrgbjon ufqrmi vdu yjwy gwkdc\n" +
                "vrqf yzmvnr jkjji ghya pdlye ygha qlcm twmkex frqv\n" +
                "hjb xgypw vtr mgj asa owcuks fnllp ommrhng senv iix\n" +
                "usw iyuatv ondiwh neac ttge tzw bvjkfe neac usw\n" +
                "qwehwhj idrwo vex zopkjd lrcc sfqyz smte qrfh lccr qwjhewh vlb\n" +
                "efnlhsj ltm xirn nctwio cin\n" +
                "zocc cpfo czoc oiz tftk\n" +
                "rlzvqe inivone kptyumn eatw urjxc aetw\n" +
                "qavvqa jvvc yux cvvj\n" +
                "bfr fcpc xpkphcf irak bfr nuhsooj nniugf bfr gllq ipo\n" +
                "ekd dydxs rnmgb dek yowk\n" +
                "ipdll wdgx gjiigd uleiwg buvv vdhuzg gigidj gkyigmx lpdli lzyode fqdpvms\n" +
                "ycna rhyz bsipz lit rmc mrofb cyan mrc wujk\n" +
                "tjrk cwdsvf srkdjy lsyvryj nko syjvlry fgqq srdykj pgb koh dyle\n" +
                "sflcxt wmgdgej akllaoa bbsvve nsxnt nsxnt kgm akllaoa btqbez\n" +
                "bzmoci agemx mdtiol pyohvf zwtx aqblx oibmcz ypcmz lfg ckssn ozx\n" +
                "cuojke joekcu eusr dxqk xxwob klpsm\n" +
                "byspz lyunt eojrx ubh rjxoe ypzsb\n" +
                "ibok bkrtut wzcdk ppm qekhvy aupaic vswwul lmlxrv ainigy sasurbx\n" +
                "jeigcyc cycgjie resio ncz\n" +
                "xvxr lmlaje ebmtn cvms xrvx vsmc\n" +
                "cfjbffj xvo hpsbu nfm jhlsk mnf fmn\n" +
                "xncxo iwuon voj aebv jks nynzl hwjwo womejo ugzmr tdfaep olpdiaf\n" +
                "jlnusc hgpprf nulcjs kwiwypu kitjjbj snlcju\n" +
                "buqzm kpuoxel ajlqke qqdur jecuibn leajqk qudrq usi\n" +
                "ahbnjf uuzecdv yfyrsxv eoqey oonue vyyrxfs jixmvao\n" +
                "wjdi cfgurdl usdnlk jmao qnus cicxnux vtdxxkx nusq\n" +
                "mlvfz twu unj mar qpiz fhjczpz ytl npwjys ppq koa\n" +
                "ippdky pvwthzj qlkhl pvwthzj\n" +
                "kfm lcedomr xgdkrzo hfxyoe rafcby uwe pzjyuja weu nso erdwc fjvc\n" +
                "peep oufzlb fsgn kxj uge xvufb zsnrxss lere gfsn gvwajkj fmh\n" +
                "mexvi kgkktz kgkktz auyln ghvqc mexvi\n" +
                "wit qxtewrk qdaz oljeb wowb suergyt hxq pfnfbei rdu qrxkwte fyw\n" +
                "qjjzkd oxedeu uoxbehs zder vvjnn ocxkiz wkblzy eyzksc waiiqo fut raak\n" +
                "dhojys qkusuxs kzicui dcsxo\n" +
                "hsnexb yoz inza gqxtbc rya jqfe ufzlqva\n" +
                "scpquf gbloz ceol eclo qpvzavo rwfnxa\n" +
                "jyg edqf vdpsihl edqf\n" +
                "mbyjg yjgbm mgybj mhgi grw\n" +
                "ler oxssrel jhw jwh sfa hdhlo gng auzoan\n" +
                "hmkuis iaxf muhisk ikshum\n" +
                "eodbpo prajasi zsu hyb npr tbcntup uzs bxchne\n" +
                "zpyr kxmvz frlzwnb tzqrw vdh ndbwqmu cadwsv adq bzfnrwl qfgf\n" +
                "dybnn dmarc mknr fovokgj ukrp cuwag\n" +
                "khweq eljs rllijp pizevm lwws kehqw mkjcu otqodz\n" +
                "fvsrb kzbjbcc kzbjbcc mee dhyedb kzbjbcc\n" +
                "cnlmjd dvnd vhlvsa rsrtc scrrt tqhx vke jqmxpd udkjqc qxriw pfqpk\n" +
                "tyureg urteyg rutyge rmoihs\n" +
                "pccxeak tkmyane qqggpr tbdmpi ieb\n" +
                "wjucbi wjm hais pcxjd kkzh qns hmf mhf mnsv ifigsc\n" +
                "lqeyr pnopcig cpgoinp pncpigo mjfkjus cko zedvvyq\n" +
                "ofsnspv goj wqm ynolb qczly brl lrupzg buof zladwte\n" +
                "xzn zxn yaseulw qwhxb easyluw vvlmh\n" +
                "aiybip ydfczwh wkl rjsu xreokl qov mko pna fkfu\n" +
                "zjlwozs nxke ozwlzjs jybx jpsxp qtkll idsrad savpoe\n" +
                "xph lpvkmvy afq uqhg qqjgm smg tmhem mxdyqx bvhot lpvmkyv\n" +
                "jxkkzil pkjheow fewr ggbfy fuol cuzud wnx fxujfwh srjsmic\n" +
                "lzbjx vfx sncis xuv unoa nlgs stdhf oibxsgk uhogsb\n" +
                "hfqzkms bzyfnz npcd yhfdo myqukug pjq adle sqkfhmz\n" +
                "czhainb iazcnhb hhaqr cyrwj zzow luuvt zdyhnh uppysr\n" +
                "fyw dulbxa drewqsr tldlaac kyaw datclal ylplup hdzbj\n" +
                "kiiv tly gua lfg\n" +
                "gphbvwc lqdd jqja ffpkz hafal eiapksw wsikpea vphgbcw lkcpm zjxcx\n" +
                "viapp rxt vdgbm ezphp pcqr bll mklgx epzhp\n" +
                "favz bwmczgg zoyns pens wpgi mrwxel\n" +
                "ozwjjn kbzaozc cuaa igbfyq swi uypx bczaozk pyux odvawqx\n" +
                "npnpw nwppn egnpj fkzh wppnn\n" +
                "asu mlqmwa npewa cjluw qmalmw newpa fznx dzypi yiy\n" +
                "hleh usw bgmgscg cqc fijfuw idtyh cgmsbgg zjhr wus hymbju\n" +
                "tmre fvm cgowgb eduyfla ttez vdzp vtmtaog ezxsfi gyxgzi pvzd\n" +
                "acvarlu hkmfzdg jsnil hpv wjj rljpk pygl wjhhohk rkplj spvgx psgvx\n" +
                "wyz rvuobq kbmhaf bec bec\n" +
                "zosyz psuo lgihdo mjtftk fjkttm ddmcd\n" +
                "pqm qpswpb opviwxg ppqsbw waco jpx\n" +
                "yzgumgq kqv hqjghnl jixhoyg ufer kvq lzi rojm gbhvsd urd tuy\n" +
                "sxc jndqc ozpex wkchpu tmwv utcxzd piecpma cmppeia\n" +
                "ifjc lttj tltj rxmgxqa jcif lzhxkg zqb mdq kbjavv\n" +
                "isyxn zjbj uiw avziqxf zpezazx iuw\n" +
                "rjaudu amtpuk gufogys xiqs\n" +
                "gau sndrkv cmiolti cdxm ikkcisu xusnfbp jxffy ffcizj psye sgd\n" +
                "mvx onzmy oynzm mwfgvs\n" +
                "mrdg roanty dljs jlil gzcj dqitnfb gxb vzzqf ooweeh pgs oyntra\n" +
                "yna xgok fvbdl xgko udqp sorfo hmhl yan\n" +
                "kycl ule blupejp kycl fhpkoe pqkptw cfzpv nkncl\n" +
                "snugkyw zfdbsfs aehb olq kkoi xpsvy jqcspf lajjyu jtm\n" +
                "hifhfa mii clukcbc fhhifa wcts tgai vvqsyr kclcbcu\n" +
                "ordjftj dokk hdhytwc fjodrtj ojrjfdt san ajxrwy ked jfrqc\n" +
                "eylx cohd biswq xgiibz gzcptbf eylx icunv bfg jqanbv rntp sbfkiey\n" +
                "kub gdpbdms qnnto bit visqop\n" +
                "tywk clicj daics cbuewkx yyjjjka vxzk afsdyqg\n" +
                "bmxzll wqjnyr mxlzbl yutkaa qmpz hiqkf lqqqle jagj qlqelq\n" +
                "jgdeatg qubj jsu bhgbm swmgy lwgnuh qjbu dqwiikp mgwys\n" +
                "ryisldg asrrhz vxvrnk ibjr kebyx dwbx qdrpa tgakt\n" +
                "dfvgzk hifan dpjdnqc ncnvf xmqjjao npjq vobt evtaety kvufds pcugx oyjo\n" +
                "ezionjg ioznegj cykxy igeojzn ezm\n" +
                "dkv dkv vfqyl dkv dtjhrem\n" +
                "xfgh brsjcdw auvq fibb gcbecl\n" +
                "eet qdnrymr ndqmyrr tpfqxoi kbkxw\n" +
                "qhmaj maukf uygg hqmaj tfmtv irao wsari\n" +
                "ofoywus wxs leemkn wfko dwzqv txg qsiiiss aiiffe fadmdq zjtaovt\n" +
                "fgfms oazi sam msgff qif evxca reho\n" +
                "gpzhy qxh sco qeax wtabxwv sjd oev\n" +
                "xsmpi wskvku xspmi smipx\n" +
                "ghgf tbpeun qdivuvq dump umdp khxcxtx laljpv lownp egovve\n" +
                "vhmu eziabt hnz neko nkz hfmizn\n" +
                "vqhb lax zzyf lxa lik jrqynr rgcos\n" +
                "zjgbfzv ieufyz kjxad qxeuewx\n" +
                "ufl drkaac hoyic pqutop wqzdk eewabsr mqspcr ewarbse dzqkw\n" +
                "bgatanj xmddwv mwlmw scgzboo myignm lkfl fsqr\n" +
                "xkrx otjzfk wek dpbwk cromg fclmhg pkvw wsln\n" +
                "yyqjs lifg gifl cfv lfig fycza\n" +
                "dfup fkfeiqq rcmuv dly iforzi lngkjc rzifio oiifrz mlhor puwm qrthoa\n" +
                "nzfaeto punt rtmlg dwdk hyig\n" +
                "mds ueoyclh lxb axgea wqt wwqqglf tqw yvzji ryr dst bojf\n" +
                "ayoj yzj lyctgnc woxz gqltw lkzkwte wysb mjyeu hrwso\n" +
                "gymmvtt lhskza lsb nhlijnt men zphurrw oftksy zxs ykerwue hnijltn iknqyz\n" +
                "xuaxkc lgzeef fwb nlzzhjj lsieg qdr ews rue rdq\n" +
                "xnf lljcmod kyuercp kvlvd lkvh ncn afaq\n" +
                "bjytofa ltz mkyy bwt uxca somiz rhgdg keaqu ybr\n" +
                "aipljn qpq nilajp udgkchc dirvxg rrbmi mxfxkk kmfxkx\n" +
                "sfzjemk hjsvnmb hfd hprfmvg pbhkc\n" +
                "cvxi srj ucy yuc euswuns jpox\n" +
                "tajlnn ivuecv fdfce rakjq bfuxirh eibde tajnln nlajtn\n" +
                "ndvm mlnhy bfqlzn nmdv ohto\n" +
                "jysyvwy xbcyt lbbm osoye swwtwa emfznci qnzc qsgk\n" +
                "xcm jbqsuo xmc mtrk bojuqs\n" +
                "ukshrrh xhfl ooxgq vadlcrg ydva hugplg mnqbd wkyouq\n" +
                "mnmqys bhws megar krgoke modxe krgoke clovh dlo\n" +
                "ejl qzc agxph jcn zcq zqc\n" +
                "jgh yhh hjg jhg\n" +
                "tarm jboyg gbyjo pgalg xugzt bph mart\n" +
                "yur wrrahr fnnfqu rwhrar cdq\n" +
                "mukod gueg guge epalg xjkctt\n" +
                "hub hbu hbzul buh sqfl\n" +
                "xyrly lvpitr xfzn jjcl uvcnz dnpdyzq ifaiwe zlvzcx\n" +
                "wxzsf tgd khvwp cmd mzv bsvjvjm wvhpk ublnqyz mvbjvjs peishcb\n" +
                "zunmk hxpney nphxey znmku\n" +
                "bfxlgur wftcw xfkf fsik xkff ffxk\n" +
                "sxyjzr ugcscx uiovqx ldzhord xgxbfph ldzhord prdhg rhdhzd ugcscx\n" +
                "udg drb apyjq dgyevo fuxjhg\n" +
                "qshbe aigfdp wyvz xfcos wve dgfrufw dwimmb jfh wfrjbzk nwgrigr sbrpbb\n" +
                "ahpn xnzeof wxbv chxpcu jmso age ojsm bqonfki hqhrkw\n" +
                "mfupm vvig ndqbbm jlw\n" +
                "ejqh ebcrytj zpiqtpp ogznd\n" +
                "wkwkae odq rsrnqk nslczz hiyyhur kuw mjbuwll vduvod ryhuhiy swo tsos\n" +
                "znkufyx jejrdno knr wkx ikrlly tnxtj\n" +
                "iizdiw iizdiw hukep rwj eaq ptm klta rwj onaz\n" +
                "znb egqy qqnc igqr ikza ojgzkr xaen kurb pyckxvt wqx\n" +
                "pbohpw bphowp dajwdpp kotevs\n" +
                "hmuvxu zdnguk jhcmj gccyxiu cxgiycu uyxcgic akxi demeff\n" +
                "zjr lupzwcy puva rzj\n" +
                "cdn wee iqkbhl jwxo nhl cqd mqgqf ltdfg\n" +
                "phwco ggcj cggj ergpqmc kcz\n" +
                "aryjl wqwmkc aklktpz kptnroc mckqww\n" +
                "jadydt atjdyd tajdyd owswsgm\n" +
                "dshqt kacoge sdqth ylobih\n" +
                "kdnik knkdi dinkk xwvqa gvii\n" +
                "cifbkpt zye xhwnrhm fctibpk sbn pdqry emkye kzyjpa plzkc btkfcip gcchi\n" +
                "kekfr fufp dfy eqebgko obbn nuh\n" +
                "zixfbus skuf bea gimbqq caubhto eba uvkovz xisfzub peukmyn\n" +
                "okihcgh gazrc slee vlnwyg geviex eesl nmnvk rcbv ycupyw\n" +
                "tcvlgqs wxe lusvwzy unr yzluwvs wsylvzu zkwth qdykv\n" +
                "hyenkj ugao vlwgb putcepr lyeccs fqdotx burf aqew fje rfbu\n" +
                "uhmnc zgnkarz gylqawm abl zimcz qbs zzmic\n" +
                "pxkbpn zuxlwtt rlbhegv zlxuwtt ooxpr pgjx\n" +
                "leg wavgps fcplfpc xvxih ueskmi dvu wbiq nvtia pwjojw usiemk ojwwjp\n" +
                "zmrpknx xrfpq avque tvoyqp\n" +
                "lyposyj mckyoub sqbl olpsjyy hjafzi wmojb nvezofd\n" +
                "yflxrg egi aij qvc yflxrg typbs yflxrg kliexy eqnj jqrr\n" +
                "gggt sht kdajvz sht gkqwaot sht vout\n" +
                "ahl aucpih feig man umtchcv ceqabr tfptb\n" +
                "ftlywun voaorf kde ilwt hlpoe pksqxyh vpg cxo xgq fdkkl sgxhnq\n" +
                "zzekhfi akb lupta sgtd qapznzf lgidsx lidsgx akgmq ettuwjq xyumf\n" +
                "dxhpku lwoxpim gwb lhjmoh gxqapd ntmvc rvwwszg pvin lwoxpim coubc\n" +
                "qia bxmremo rjf vaeio eqexwz wuoz sguf bsbusof xqeewz\n" +
                "iczzz krf hbq tsgrih mzjabrt sfnwrm djignf zwac cwaz dgc nsrfmw\n" +
                "yvarsva zzpbp yai und kkbinr zlyj nyxxof ggrgu vyk eib\n" +
                "nepzm yrrgr vrlhbv hykmiog natrqx jvpq nbyhe zuo grx nwl\n" +
                "cfboeev hcn yfobyx cqvlo obctww xxaux ofybxy wouguq avuztl xmgqq xyofby\n" +
                "tikv uvzp oxopqy reh uzvp wefka vli kied gngks vbz thfsxyt\n" +
                "exxvknp pucbdyl dboto tzat qze xyinygz mhzl ubahr ekxbtk\n" +
                "jcz ufszbi pknsfgb ivok ijau okxolj etecn aurun zsa gbxs uryx\n" +
                "ypnb ousd osg mvset ipffzdn dfinfpz ltescx\n" +
                "taeoct aoetct aocett ttda fcdqnxv\n" +
                "bimtlk ssax bmrifkr vfxdmq hglp rgzr zpvk zhxtq rndwy mmr arkr\n" +
                "bwvdb axxbhzk nwfmbbu kzuc sahv cvas wdac acsv\n" +
                "xavkwou yvx ouwkxva otbe uzr mmw atq yiy ghavd qta pqlhv\n" +
                "omzht vsdsc zhtmo hmotz\n" +
                "eqt wtveez syift shtfnc hmckjxa apwbvn yme okdl hbihdtv hxahns eetvwz\n" +
                "rokdg ndjw hprxjc viys mbcctod dbvd\n" +
                "lhzb fyxf xaslmi sjd vqp grxhmfe snetfv mgivd uaknj givkdi\n" +
                "gxkxl kqcdnl rna jhcuepd npiedg djcpheu huce njryw bjluhq bvedvl kqxu\n" +
                "sogh uym atpzuwx vjgbe xgrvkg thgbyn mptcebt rkro\n" +
                "tnpxw uxrqxd lajmsmr tnnlt vrvbf deret hkmvrs eubvkn kks hjq\n" +
                "rcdoa zfja vod supip dvo\n" +
                "zbxdo xglqv how mgoq jqrdou pwrminc lidi nfs xglqv lidi\n" +
                "ldmnp dnqn ahhr tha mvsbsfh rpm rgus faf tjash\n" +
                "ewrdol jqhfpf rckj mrxlwj redjg bmxprx grla\n" +
                "rhr jksebwa vtu skwaejb vut\n" +
                "wrx iqvrjh atrt xrw vtqo tkcasd xedjh zkqrh vvhj\n" +
                "owc qlzygar uajwwe obzl inxawur\n" +
                "crbtrf phvy nzipo rctbfr trrcbf\n" +
                "vwuun wcfhhzo vxxjdt fbf bqtmmhs bffqcna\n" +
                "wkxfxmv zmrkyh sggw whwcw zukynw\n" +
                "lsdiy lnbn kblxi qfyib irfl mymrr zqbl\n" +
                "gwdkeu ghn afry zxoz fary uzntlnk kee xtnop ptnox zngoran\n" +
                "lgs lsg sgeseiz gsl\n" +
                "erpoqpi svtnv vsogl uym amzxbs\n" +
                "jtmodqx yjcsfcl zosugm jrekfdw xxbdqnx fcha\n" +
                "vio tlfxokx xaoq pydeiq glxsuzm honifvf maiuzsy uizsyam eco\n" +
                "ophcui saka qyt ltti syw\n" +
                "qff qff sde ryv\n" +
                "eiii jazx nlehtx tnhvxl rzvsjo qkupif feypppe tefxr wdjmlc\n" +
                "pdrr mwuy wccd rxla drpr enbbap\n" +
                "pclml ubwdbz hfudj gdpujfm ovabv\n" +
                "uink ffebi wdvhqzs qiympf lqxihty vnsp wdvhqzs hutxkcs lxfuos hutxkcs\n" +
                "fycoaw palkpz yrkg kappzl ncjym mergg kryg\n" +
                "eqy npvgh ghafkro piqnogb polacs qye hnvpg\n" +
                "dxyy udhmz jij tqsuic qxz erctv\n" +
                "urum nmbr cgek eetmhj gxr oxgukf wzdmvi oibzt fxkoug rcrywcr rglx\n" +
                "jkp ofej waibl opqhmww ifnczcg jdtkbc lil isc ill mylvuv\n" +
                "vqbcosk yhhsy gasmj bspx peakt cjtekw hvzo ywe qcvbosk ohzv qddt\n" +
                "edq llbvsx vedyvlm gou wkecank rkgf ziyrr belgo tbz\n" +
                "wbome vhzf ztk zaxiu ywjb supuf beq sxq spuuf pufus\n" +
                "femu ymkdoew kjynct aia\n" +
                "yjymr orovqj aremii licw bdtnc\n" +
                "uyade fbx duaye ujtvpn\n" +
                "yzvp pvzgjp yofcvya gvkkoh cafyvoy mhsm okhkvg\n" +
                "xuh qkaf dmi imd tzmlce mqkxj qilrc dim cadotvy\n" +
                "azpqgb kyc aflgyaf laagffy kesmk jzyzaer taf bpkbzdg\n" +
                "ogd dbdlh dqt zaaloh\n" +
                "exal vgnfx omu omepvwf szcwq snz bptite bzqyxl khmblyc sse emg\n" +
                "yqcbwsn aihhf tqck tcqk wqwqy cfez xahpn\n" +
                "qqbuf lil ies tqu pyxhqp mnfuk azj\n" +
                "vwma rzdtgl mxbasw nwgjav mwav\n" +
                "itpjfq rrgyt hralwm fqrig btwcod\n" +
                "ydjd kmk fvwr wrfv yvhw mkk\n" +
                "xbsxub yhsj xzbuf ace xubbsx fzuxb vxk\n" +
                "ttsist vubpf mhwkmtx vlj hdsva kmmhtwx ukxr upfvb tbma fxsrnxl hzwufho\n" +
                "wckjvz unmtev egxts ihw topvw ptowv rnihhmq\n" +
                "gpdtl kcric nwg ssbs qah aarp ydsdty ngw\n" +
                "lzhxbbq oktvcw xbasqe owtmwgp koa gumjie sodwrp hqsw aqh dtgsbb\n" +
                "xjbyy mxfxa ogvk nqiy qyni ldqwryj niyq jjixc\n" +
                "uhbul daccgva xtiz dim uhbul yjmakv yjmakv\n" +
                "huo esajup ouj oju ujo\n" +
                "eeeu hwvsk jfkmds okhi pogskfm itdlbll\n" +
                "lpyubo dylpfb iehwug decj ntidy cuygyg lalkb iutu oxgm imn");
        System.out.println("Day4/1: " + day4.getResult());
        System.out.println("Day4/2: " + day4.getAnagramCheck());
    }

    public static void day5() {
        Day5 day5 = new Day5("1\n" +
                "0\n" +
                "0\n" +
                "1\n" +
                "0\n" +
                "-3\n" +
                "2\n" +
                "1\n" +
                "-7\n" +
                "-6\n" +
                "-9\n" +
                "1\n" +
                "0\n" +
                "-9\n" +
                "-12\n" +
                "-10\n" +
                "-6\n" +
                "-12\n" +
                "-2\n" +
                "-12\n" +
                "-6\n" +
                "-8\n" +
                "-11\n" +
                "-11\n" +
                "-6\n" +
                "-24\n" +
                "-22\n" +
                "-6\n" +
                "-16\n" +
                "-12\n" +
                "-11\n" +
                "-29\n" +
                "-20\n" +
                "-6\n" +
                "-27\n" +
                "-25\n" +
                "-16\n" +
                "-28\n" +
                "-36\n" +
                "-34\n" +
                "-27\n" +
                "-9\n" +
                "-31\n" +
                "-3\n" +
                "-41\n" +
                "-37\n" +
                "-21\n" +
                "-44\n" +
                "-5\n" +
                "-41\n" +
                "-6\n" +
                "-37\n" +
                "-46\n" +
                "-2\n" +
                "-16\n" +
                "-8\n" +
                "-2\n" +
                "-43\n" +
                "-3\n" +
                "-22\n" +
                "-37\n" +
                "-1\n" +
                "-55\n" +
                "-44\n" +
                "-21\n" +
                "-53\n" +
                "-26\n" +
                "-2\n" +
                "-31\n" +
                "-33\n" +
                "-14\n" +
                "-22\n" +
                "-30\n" +
                "-5\n" +
                "-17\n" +
                "-34\n" +
                "-75\n" +
                "-24\n" +
                "-12\n" +
                "-7\n" +
                "-57\n" +
                "-72\n" +
                "-10\n" +
                "-25\n" +
                "-66\n" +
                "-78\n" +
                "-22\n" +
                "-5\n" +
                "-66\n" +
                "-84\n" +
                "-75\n" +
                "-23\n" +
                "-61\n" +
                "-60\n" +
                "-81\n" +
                "-87\n" +
                "-82\n" +
                "-36\n" +
                "-96\n" +
                "-63\n" +
                "-92\n" +
                "-87\n" +
                "-82\n" +
                "-19\n" +
                "-68\n" +
                "-79\n" +
                "-48\n" +
                "-61\n" +
                "-29\n" +
                "-83\n" +
                "-18\n" +
                "-81\n" +
                "-45\n" +
                "-10\n" +
                "-46\n" +
                "-74\n" +
                "-42\n" +
                "-115\n" +
                "-16\n" +
                "-105\n" +
                "-43\n" +
                "-83\n" +
                "-20\n" +
                "-72\n" +
                "2\n" +
                "-98\n" +
                "-57\n" +
                "-62\n" +
                "-82\n" +
                "0\n" +
                "-127\n" +
                "-40\n" +
                "-37\n" +
                "-43\n" +
                "-74\n" +
                "-65\n" +
                "-47\n" +
                "-53\n" +
                "-19\n" +
                "-27\n" +
                "-39\n" +
                "-118\n" +
                "-69\n" +
                "-85\n" +
                "-111\n" +
                "-140\n" +
                "-15\n" +
                "-99\n" +
                "-57\n" +
                "-20\n" +
                "-46\n" +
                "-25\n" +
                "-140\n" +
                "-21\n" +
                "-48\n" +
                "-86\n" +
                "-68\n" +
                "-123\n" +
                "-119\n" +
                "-142\n" +
                "-45\n" +
                "-39\n" +
                "-110\n" +
                "-49\n" +
                "-86\n" +
                "-89\n" +
                "-87\n" +
                "-1\n" +
                "-127\n" +
                "-66\n" +
                "-44\n" +
                "-133\n" +
                "-12\n" +
                "-5\n" +
                "-88\n" +
                "-68\n" +
                "-27\n" +
                "-75\n" +
                "-127\n" +
                "-149\n" +
                "-152\n" +
                "-93\n" +
                "-108\n" +
                "-118\n" +
                "-23\n" +
                "-130\n" +
                "-68\n" +
                "-23\n" +
                "-8\n" +
                "-174\n" +
                "-168\n" +
                "-43\n" +
                "-67\n" +
                "-143\n" +
                "-167\n" +
                "-6\n" +
                "-152\n" +
                "-5\n" +
                "-57\n" +
                "-105\n" +
                "-22\n" +
                "-141\n" +
                "-2\n" +
                "-169\n" +
                "-88\n" +
                "-191\n" +
                "-123\n" +
                "-21\n" +
                "-18\n" +
                "-58\n" +
                "-182\n" +
                "-62\n" +
                "-114\n" +
                "-17\n" +
                "-16\n" +
                "-102\n" +
                "-37\n" +
                "-127\n" +
                "-114\n" +
                "-55\n" +
                "-87\n" +
                "-40\n" +
                "-216\n" +
                "-101\n" +
                "-1\n" +
                "-117\n" +
                "-148\n" +
                "-75\n" +
                "-158\n" +
                "-18\n" +
                "1\n" +
                "-197\n" +
                "-4\n" +
                "-30\n" +
                "-228\n" +
                "-87\n" +
                "-67\n" +
                "-161\n" +
                "-50\n" +
                "-2\n" +
                "-220\n" +
                "-212\n" +
                "-57\n" +
                "-135\n" +
                "-3\n" +
                "-236\n" +
                "-67\n" +
                "-171\n" +
                "-114\n" +
                "-91\n" +
                "-12\n" +
                "-157\n" +
                "-23\n" +
                "-19\n" +
                "-82\n" +
                "-130\n" +
                "-201\n" +
                "-145\n" +
                "-60\n" +
                "-149\n" +
                "-208\n" +
                "-200\n" +
                "-138\n" +
                "-187\n" +
                "-180\n" +
                "-94\n" +
                "-215\n" +
                "-128\n" +
                "-49\n" +
                "-116\n" +
                "-4\n" +
                "-165\n" +
                "-118\n" +
                "-213\n" +
                "-235\n" +
                "-139\n" +
                "-55\n" +
                "-199\n" +
                "-44\n" +
                "-227\n" +
                "-70\n" +
                "-201\n" +
                "-181\n" +
                "-146\n" +
                "0\n" +
                "-234\n" +
                "-117\n" +
                "-109\n" +
                "-239\n" +
                "-286\n" +
                "-187\n" +
                "-73\n" +
                "-108\n" +
                "-284\n" +
                "-101\n" +
                "-193\n" +
                "-211\n" +
                "-255\n" +
                "-39\n" +
                "-207\n" +
                "-24\n" +
                "-260\n" +
                "-177\n" +
                "0\n" +
                "-267\n" +
                "-278\n" +
                "-88\n" +
                "-258\n" +
                "-130\n" +
                "-140\n" +
                "-213\n" +
                "-118\n" +
                "-167\n" +
                "-312\n" +
                "-172\n" +
                "-43\n" +
                "-183\n" +
                "-208\n" +
                "-25\n" +
                "-90\n" +
                "-139\n" +
                "-146\n" +
                "-105\n" +
                "-153\n" +
                "-141\n" +
                "-258\n" +
                "-155\n" +
                "-178\n" +
                "-303\n" +
                "-171\n" +
                "-297\n" +
                "-236\n" +
                "-51\n" +
                "-176\n" +
                "-20\n" +
                "-120\n" +
                "-230\n" +
                "-218\n" +
                "-154\n" +
                "0\n" +
                "-72\n" +
                "-306\n" +
                "-43\n" +
                "-290\n" +
                "-203\n" +
                "-66\n" +
                "-51\n" +
                "-13\n" +
                "-334\n" +
                "-230\n" +
                "-212\n" +
                "-223\n" +
                "-31\n" +
                "-120\n" +
                "-335\n" +
                "-292\n" +
                "-98\n" +
                "-299\n" +
                "-57\n" +
                "-67\n" +
                "-215\n" +
                "-108\n" +
                "-313\n" +
                "-324\n" +
                "1\n" +
                "-180\n" +
                "-155\n" +
                "-276\n" +
                "-277\n" +
                "-120\n" +
                "-92\n" +
                "-153\n" +
                "-168\n" +
                "-73\n" +
                "-333\n" +
                "-101\n" +
                "-320\n" +
                "-263\n" +
                "-102\n" +
                "-17\n" +
                "-66\n" +
                "-194\n" +
                "-373\n" +
                "-85\n" +
                "-263\n" +
                "2\n" +
                "-319\n" +
                "-77\n" +
                "-8\n" +
                "-329\n" +
                "-247\n" +
                "-218\n" +
                "-307\n" +
                "-169\n" +
                "-284\n" +
                "-2\n" +
                "-309\n" +
                "-275\n" +
                "-282\n" +
                "-3\n" +
                "-191\n" +
                "-297\n" +
                "-302\n" +
                "-100\n" +
                "-105\n" +
                "-356\n" +
                "-60\n" +
                "-189\n" +
                "-191\n" +
                "-133\n" +
                "-368\n" +
                "-107\n" +
                "-51\n" +
                "-346\n" +
                "-403\n" +
                "-52\n" +
                "-129\n" +
                "-327\n" +
                "-289\n" +
                "-24\n" +
                "-341\n" +
                "-111\n" +
                "-237\n" +
                "-46\n" +
                "-13\n" +
                "-308\n" +
                "-110\n" +
                "-365\n" +
                "-351\n" +
                "-236\n" +
                "-341\n" +
                "-42\n" +
                "-97\n" +
                "-19\n" +
                "-131\n" +
                "-213\n" +
                "-116\n" +
                "-151\n" +
                "-431\n" +
                "-390\n" +
                "-77\n" +
                "-116\n" +
                "-305\n" +
                "-263\n" +
                "-282\n" +
                "-229\n" +
                "-238\n" +
                "-386\n" +
                "-107\n" +
                "-134\n" +
                "-25\n" +
                "-247\n" +
                "-431\n" +
                "-90\n" +
                "-299\n" +
                "-338\n" +
                "-94\n" +
                "-204\n" +
                "-61\n" +
                "-30\n" +
                "-46\n" +
                "-184\n" +
                "-95\n" +
                "-185\n" +
                "-289\n" +
                "-311\n" +
                "-63\n" +
                "-267\n" +
                "-294\n" +
                "-296\n" +
                "-141\n" +
                "-456\n" +
                "-400\n" +
                "-129\n" +
                "-422\n" +
                "-152\n" +
                "-131\n" +
                "-252\n" +
                "-422\n" +
                "-110\n" +
                "-215\n" +
                "-134\n" +
                "-425\n" +
                "-35\n" +
                "-356\n" +
                "-104\n" +
                "-446\n" +
                "-395\n" +
                "-351\n" +
                "-135\n" +
                "-353\n" +
                "-410\n" +
                "-114\n" +
                "-61\n" +
                "-234\n" +
                "-261\n" +
                "-121\n" +
                "-296\n" +
                "-450\n" +
                "-116\n" +
                "-197\n" +
                "-343\n" +
                "-145\n" +
                "-127\n" +
                "-157\n" +
                "-372\n" +
                "0\n" +
                "-115\n" +
                "-175\n" +
                "-411\n" +
                "-473\n" +
                "-236\n" +
                "-169\n" +
                "-365\n" +
                "-457\n" +
                "-419\n" +
                "-110\n" +
                "-291\n" +
                "-7\n" +
                "-408\n" +
                "-414\n" +
                "-426\n" +
                "-292\n" +
                "-419\n" +
                "-160\n" +
                "-306\n" +
                "-238\n" +
                "-61\n" +
                "-101\n" +
                "-359\n" +
                "-362\n" +
                "-13\n" +
                "-360\n" +
                "-462\n" +
                "-348\n" +
                "-502\n" +
                "-516\n" +
                "-15\n" +
                "-471\n" +
                "-408\n" +
                "-278\n" +
                "-318\n" +
                "-247\n" +
                "-6\n" +
                "-538\n" +
                "-353\n" +
                "-82\n" +
                "-324\n" +
                "-336\n" +
                "-149\n" +
                "-209\n" +
                "-3\n" +
                "-134\n" +
                "-101\n" +
                "-500\n" +
                "-469\n" +
                "-129\n" +
                "-154\n" +
                "-132\n" +
                "-43\n" +
                "-559\n" +
                "-192\n" +
                "-556\n" +
                "-560\n" +
                "-56\n" +
                "-23\n" +
                "-185\n" +
                "-109\n" +
                "-300\n" +
                "-417\n" +
                "-328\n" +
                "-401\n" +
                "-393\n" +
                "-459\n" +
                "-351\n" +
                "-377\n" +
                "-376\n" +
                "-126\n" +
                "-211\n" +
                "-421\n" +
                "-428\n" +
                "-375\n" +
                "-216\n" +
                "-21\n" +
                "-117\n" +
                "-118\n" +
                "-486\n" +
                "-58\n" +
                "-578\n" +
                "-480\n" +
                "-42\n" +
                "-497\n" +
                "-256\n" +
                "-160\n" +
                "-114\n" +
                "-4\n" +
                "-62\n" +
                "-496\n" +
                "-48\n" +
                "-560\n" +
                "-409\n" +
                "-76\n" +
                "-386\n" +
                "-587\n" +
                "-309\n" +
                "-565\n" +
                "-65\n" +
                "-154\n" +
                "-459\n" +
                "-213\n" +
                "-197\n" +
                "-157\n" +
                "-603\n" +
                "-381\n" +
                "-97\n" +
                "-71\n" +
                "-234\n" +
                "-386\n" +
                "-295\n" +
                "-497\n" +
                "-159\n" +
                "-364\n" +
                "-496\n" +
                "-40\n" +
                "-426\n" +
                "-320\n" +
                "-600\n" +
                "-188\n" +
                "-321\n" +
                "-295\n" +
                "-312\n" +
                "-222\n" +
                "-515\n" +
                "-355\n" +
                "-86\n" +
                "-554\n" +
                "-67\n" +
                "-604\n" +
                "-497\n" +
                "-517\n" +
                "-38\n" +
                "-423\n" +
                "-89\n" +
                "-76\n" +
                "-256\n" +
                "-347\n" +
                "-467\n" +
                "-155\n" +
                "-207\n" +
                "-628\n" +
                "-544\n" +
                "-250\n" +
                "-86\n" +
                "-168\n" +
                "-197\n" +
                "-243\n" +
                "-249\n" +
                "-374\n" +
                "-53\n" +
                "-410\n" +
                "-615\n" +
                "-561\n" +
                "-577\n" +
                "-587\n" +
                "-406\n" +
                "-68\n" +
                "-54\n" +
                "-290\n" +
                "-302\n" +
                "-453\n" +
                "-566\n" +
                "-129\n" +
                "-332\n" +
                "-45\n" +
                "-447\n" +
                "-475\n" +
                "-190\n" +
                "-528\n" +
                "-349\n" +
                "-220\n" +
                "-80\n" +
                "-265\n" +
                "-442\n" +
                "-289\n" +
                "-57\n" +
                "-329\n" +
                "-377\n" +
                "-343\n" +
                "-15\n" +
                "-628\n" +
                "-259\n" +
                "-419\n" +
                "-321\n" +
                "-97\n" +
                "-365\n" +
                "-681\n" +
                "-590\n" +
                "-30\n" +
                "-489\n" +
                "-213\n" +
                "-674\n" +
                "-174\n" +
                "-356\n" +
                "-110\n" +
                "-12\n" +
                "-441\n" +
                "-431\n" +
                "-254\n" +
                "-612\n" +
                "-571\n" +
                "-203\n" +
                "-706\n" +
                "-131\n" +
                "-128\n" +
                "-641\n" +
                "-596\n" +
                "-702\n" +
                "-272\n" +
                "-416\n" +
                "-345\n" +
                "-181\n" +
                "-318\n" +
                "-683\n" +
                "-565\n" +
                "-160\n" +
                "-445\n" +
                "-7\n" +
                "-179\n" +
                "-680\n" +
                "-520\n" +
                "-4\n" +
                "-471\n" +
                "-552\n" +
                "-14\n" +
                "-217\n" +
                "-23\n" +
                "-138\n" +
                "-734\n" +
                "-682\n" +
                "-235\n" +
                "-392\n" +
                "-53\n" +
                "-400\n" +
                "-330\n" +
                "-339\n" +
                "-211\n" +
                "-280\n" +
                "-649\n" +
                "-366\n" +
                "-235\n" +
                "-50\n" +
                "-214\n" +
                "-386\n" +
                "-324\n" +
                "-346\n" +
                "-572\n" +
                "-104\n" +
                "-23\n" +
                "-530\n" +
                "-353\n" +
                "-545\n" +
                "-85\n" +
                "-196\n" +
                "-460\n" +
                "-69\n" +
                "-395\n" +
                "-530\n" +
                "-526\n" +
                "-606\n" +
                "-131\n" +
                "-638\n" +
                "-396\n" +
                "-89\n" +
                "-266\n" +
                "-117\n" +
                "-752\n" +
                "-495\n" +
                "-328\n" +
                "-678\n" +
                "-331\n" +
                "-351\n" +
                "-296\n" +
                "-714\n" +
                "-352\n" +
                "-450\n" +
                "-291\n" +
                "-713\n" +
                "-62\n" +
                "-480\n" +
                "-186\n" +
                "-238\n" +
                "-731\n" +
                "-9\n" +
                "-710\n" +
                "-560\n" +
                "-652\n" +
                "-414\n" +
                "-708\n" +
                "-427\n" +
                "-152\n" +
                "-91\n" +
                "-716\n" +
                "-96\n" +
                "-669\n" +
                "-607\n" +
                "-704\n" +
                "-532\n" +
                "-414\n" +
                "-751\n" +
                "-228\n" +
                "-319\n" +
                "-103\n" +
                "-516\n" +
                "-153\n" +
                "-265\n" +
                "-137\n" +
                "-349\n" +
                "-247\n" +
                "-222\n" +
                "-202\n" +
                "-343\n" +
                "-273\n" +
                "-644\n" +
                "-522\n" +
                "-331\n" +
                "-114\n" +
                "-181\n" +
                "-391\n" +
                "-139\n" +
                "-311\n" +
                "-589\n" +
                "-622\n" +
                "-309\n" +
                "-192\n" +
                "-133\n" +
                "-234\n" +
                "-648\n" +
                "-831\n" +
                "-554\n" +
                "-759\n" +
                "-620\n" +
                "-240\n" +
                "-38\n" +
                "-598\n" +
                "-403\n" +
                "-339\n" +
                "-835\n" +
                "-338\n" +
                "-48\n" +
                "-65\n" +
                "-612\n" +
                "-344\n" +
                "-431\n" +
                "-24\n" +
                "-137\n" +
                "-778\n" +
                "-645\n" +
                "-411\n" +
                "-212\n" +
                "-316\n" +
                "-652\n" +
                "-257\n" +
                "-519\n" +
                "-266\n" +
                "-586\n" +
                "-790\n" +
                "-63\n" +
                "-506\n" +
                "-150\n" +
                "-493\n" +
                "-795\n" +
                "-117\n" +
                "-793\n" +
                "-369\n" +
                "-828\n" +
                "-156\n" +
                "-194\n" +
                "-461\n" +
                "-599\n" +
                "-363\n" +
                "-511\n" +
                "-67\n" +
                "-627\n" +
                "-172\n" +
                "-2\n" +
                "-544\n" +
                "-657\n" +
                "-680\n" +
                "0\n" +
                "-29\n" +
                "-531\n" +
                "-511\n" +
                "-688\n" +
                "-32\n" +
                "-753\n" +
                "-407\n" +
                "-190\n" +
                "-724\n" +
                "-620\n" +
                "-598\n" +
                "-123\n" +
                "-783\n" +
                "-492\n" +
                "-270\n" +
                "-839\n" +
                "-603\n" +
                "-685\n" +
                "-277\n" +
                "-6\n" +
                "-431\n" +
                "-14\n" +
                "-320\n" +
                "-223\n" +
                "-806\n" +
                "-550\n" +
                "-268\n" +
                "-105\n" +
                "-47\n" +
                "-194\n" +
                "-657\n" +
                "-631\n" +
                "-614\n" +
                "-524\n" +
                "-83\n" +
                "-300\n" +
                "-491\n" +
                "-754\n" +
                "-923\n" +
                "-902\n" +
                "-131\n" +
                "-623\n" +
                "-551\n" +
                "-114\n" +
                "-272\n" +
                "-892\n" +
                "-547\n" +
                "-597\n" +
                "-431\n" +
                "-276\n" +
                "-814\n" +
                "-363\n" +
                "-364\n" +
                "-579\n" +
                "-236\n" +
                "-783\n" +
                "-356\n" +
                "-198\n" +
                "-82\n" +
                "-266\n" +
                "-709\n" +
                "-176\n" +
                "-366\n" +
                "-667\n" +
                "-73\n" +
                "-894\n" +
                "-81\n" +
                "-208\n" +
                "-767\n" +
                "-431\n" +
                "-762\n" +
                "-613\n" +
                "-865\n" +
                "-355\n" +
                "-382\n" +
                "-962\n" +
                "-480\n" +
                "-797\n" +
                "-881\n" +
                "-916\n" +
                "-758\n" +
                "-729\n" +
                "-189\n" +
                "-755\n" +
                "-206\n" +
                "-357\n" +
                "-43\n" +
                "-857\n" +
                "-812\n" +
                "-812\n" +
                "-47\n" +
                "-160\n" +
                "-395\n" +
                "-595\n" +
                "-508\n" +
                "-817\n" +
                "-215\n" +
                "-249\n" +
                "-134\n" +
                "-648\n" +
                "-965\n" +
                "-797\n" +
                "-331\n" +
                "-97\n" +
                "-912\n" +
                "-899\n" +
                "-345\n" +
                "-732\n" +
                "-412\n" +
                "-823\n" +
                "-644\n" +
                "-16\n" +
                "-273\n" +
                "-970\n" +
                "-550\n" +
                "-345\n" +
                "-556\n" +
                "-207\n" +
                "-66\n" +
                "-336\n" +
                "-396\n" +
                "-224\n" +
                "-261\n" +
                "-951\n" +
                "-573\n" +
                "-587\n" +
                "-810\n" +
                "-507\n" +
                "-526\n" +
                "-9\n" +
                "-49\n" +
                "-169\n" +
                "-325\n" +
                "-913\n" +
                "-522\n" +
                "-50\n" +
                "-196\n" +
                "-956\n" +
                "-115\n" +
                "-185\n" +
                "-665\n" +
                "-450\n" +
                "-980\n" +
                "-503\n" +
                "-987\n" +
                "-341\n" +
                "-748\n" +
                "-860\n" +
                "-278\n" +
                "-935\n" +
                "-520\n" +
                "-32\n" +
                "-591\n" +
                "-81\n" +
                "-629\n" +
                "-409\n" +
                "-270\n" +
                "-102\n" +
                "-69\n" +
                "-304\n" +
                "-466\n" +
                "-124\n" +
                "-740\n" +
                "-217\n" +
                "-836\n" +
                "-339\n" +
                "-150\n" +
                "-261\n" +
                "-929\n" +
                "-694\n" +
                "-385\n" +
                "-384\n" +
                "-803\n" +
                "-488\n" +
                "-220\n" +
                "-151\n" +
                "-6\n" +
                "-798\n" +
                "-534\n" +
                "-846\n" +
                "-368\n" +
                "-403\n" +
                "-369\n" +
                "-604\n" +
                "-130\n" +
                "-459\n" +
                "-147\n" +
                "-357\n" +
                "-311\n" +
                "-193\n" +
                "-398\n" +
                "-749\n" +
                "-970\n" +
                "-274\n" +
                "-477\n" +
                "-1014\n" +
                "-659\n" +
                "-209\n" +
                "-803\n" +
                "-950\n" +
                "-528\n" +
                "-586\n" +
                "-303\n" +
                "-947\n" +
                "-1028\n" +
                "-698\n" +
                "-81\n" +
                "-682");
        System.out.println("Day5/1: " + day5.getResult());
        System.out.println("Day5/2: " + day5.getResultWithDecrease());
    }
}
