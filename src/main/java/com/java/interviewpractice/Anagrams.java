package com.java.interviewpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		String first = "ztbckaxrbbjxgwhgkhhwuomhixgpqjxrcyuoytfcuqzcpiizprxkfmtnjaebjdsnbobchiedbffqnppeimqqykfjmkkxnfkrtntdvxgweomrfdvosmgqylcmxmjnrtenixqdwwcamqtsuqioeoeczioxvzkouqbcnrilqknccgwywembutfwbwvwvhnqxoumicxyokarsxpodcravzwwxrvsaikxyflgjkgyujpoieengyndxjaucvoefbddgomryupudeillnzrlovkaxecsujzvmcdbqvzlkuqpeearftetqotnuyhphiktnowdjwqvshkynmqsiwlalhqhfxwogjhvxgyierdwaquncmfmlsnybdfgccwklgfkmguqxxoznkmsxtgkntipynxdruneavqmbkcakszzcntzgalvvtkujixaemhehxskkwmuoltqynsgpdckzogiwfkcstgbraodwaxmosdmhxvwcxhblnjktwmnpvqixelwfkitdnhmkcjnbqqpfazaynpnkgwkkjgruokzeuloywdaoupuwqwwfmjsshcetiwnyioccbtdyydmuuismfottallhnpaxnpwwdaahvdfuirocajqhxkaxvlhlcjiqzgoejoleuqackphkaxtxhtxfgeqinaaojotsfgyzzzdjqkvqkoptjmypqqzgrcucqpwxywyxveinoffavvuehsvalugcwcgpscosynpwtzlherkzoefxyaxjwfnvktkcxawyplwimhsqacroiymgalswtfrdbdhagdavqwecgysgalxijlqjyihrqbutgdtmguiysoaymufoheyqpobnzjfpmbishdfnxpoqfoqtlxhsbhlqvmeuxlljmtetxljwcxohnfcyclteseunqakqlvbapfvoqeksdzbtgdtkomogqlujngzzbabsgwgybtrguszawvkkhbtyophbvicyidrqazpdsijmaloygzlncenqvwrqeuopxfhxhyazgmmjzcjfbuudakvvgnnnheeglngsmisuugdvincmjzrmjnjrcxglbmroaxhoiziehoardcdobxamkkgojmzmzqabqjpyizcrnejqjofklhzxtfletkqudtvtcmtnmxezepsnezzrgypadcexpxtsspnwbijnfqpjhhyngyfowwocyvbnuuhmjukncwckmrvvaujgsqvqmlsmivccqjqbedoizrsnkoilkttejquvcnimikpavhczksijlcywshjcacgktdhxsrjcdadzkhawziinngjfpukqysctvjqpdcsgevfocindqvqfdbntvxlurnppygebkwkorrfvzsbsprxuvknsjyobleqmkupwtzkmrriqlliceixzukselghykxkwtaumzhzsyjlmuvoydnayysejaljnkuldwgsxntqncbzyyqycdycdqiottygfsrkoxclmvdazgzxfrwjvunynxnisloxfhhvfmgthmtjsvgzmekjbziowxwokmlptvmahsuqgpzbkiczmnknmudjrbxdplujgglpbffhvfihplibatrmnwxhyxknifyqlkfmrmumtewiremtzdgnzfwzcgpmlnezzllryhftobchiobhtjwsosutbjhmyonyzzpziutyyxggljpesoyigudhdnwebjccktevpxtnubvhklneznphisrnhpriyvnlqrggobvkfrrregwftlobffrnukxvgkiyboerrcdwvwozcmgwzuzecqtwbrtjbbhfrowlqajlwzmblsxmmwropknqdibfkikdwiookabjznknfjzuhqkwdxoggpnsyzxwimnuoofneralaahissgxpvgxktrktpjddyzrofeswhgzhnhbfnbxkhwxcohxdsciqczfjfzhmfgvvpzcfazphymlowjtqlbhpaoahniuvqrsgqulqwczurlinwbdjemzgaznqhhnazfgrbtixvjtmwdbsghcktdqwceomnbmoiugjnqjkzczygcsmjwxfzpbetrsjugxcadnpvwbxbavhfnvomuvlkyrfpjojpmlrrbinxkmymhhrwdiixdwjenptxfdotqinrqcrcorpvzitescdyynclevklabfrjskzwbcktthudaywebucqyqwtciwdnnmhxodzspulwoqymmdpihgizcccmyhznuimknlcehpavfbjuezcnhlnlprypyzeukqexeielxejdhszltbbaoooffmwflcavtgvxpzkoftrnmsahwbkkrysykqextgvmosldtvsyplndeqkatumluglezpesxzgmrrrkolkdxaidsvflrtymamszbwtbxznqsgcgspmrrwujrbwluxzujrvmqopppcgjlkqdbeusaodurchlzgikxdypuoflsnvdzngbtatvqxrhbyvaedmeikvcyaqrpnwpadstfloykghlgcnlhbrqmmumnkfexcvzhnsobjonrwbxaokkqbaeouqdhyjeafejuyxvjmjckkcmamwsqwwetpjansgpzmyunvrwjcbvodippgjhdgnwxwymrebsrzoewgciiddxgnoyuzhzhvxetvqmbrfsstyrbbzkgejpszpoywngrkmlfdzgwebpabgbehlllwafxrtwngehqqsxttgsyhhyipznynallcrjtmhgtlnlbhlxbrpbayzipaxnpxabzrmsgtbzeqmhyxgbqxcqxdbmdybvycwxvisbdvchlrqjqzmhwoxuryixzmsxoqwlaopdlrmxieizdviajfwdggafsucimauoplrccfznjiopdwrodnrlttsopwwbxsrodiqipqvbalqfjhtounapisdapcdmuvayfqgvidwiompztjnpypgiimizomnkjpiohqjqtfajtqkobyfbpojzauyqinarcjfkbpcvwcgssrgvrowicgicciukwubydgkfxmcwpkojdwfwmdfolnsnvmxthaumhetgrxciistlrakdepupcmdzbcvidpwmtqumnzwxrqlkqvqwkkmowrpxvkhyzemvuhjjggjzyumqpcnbmbrksgkptrquxcptlbdthmthifxzjmavnrfhzpxujnpgpeadffwotrxbyvahhacvtkcubzpkoerekthsyfirxgsvbsdkuhhptmjvlafagygrrplrutktzcpcwupsdwhxitswvzycagvtvglrbvldachyywrbtaadvsbruzvufqncyawzyhcylkwjgpkbqlhlfiebkzxrrnupnsplzrlmdkvmzhppswdahjdrlbicoesdwhpxacjgmesmmhdggiinsmgdnohdvzgrixpjayrmfjatsgbaokpiyvnlmvqhuwydupowqfkvqlqktrlhbaqzydmkycrvbpavfqtvxdsnqizjbktdnjelotvpxokydmvkcohzubomlnynarsncyaqrxfplrpqdldfbmgvowkbmiomzgbbfdtyazplsfbwqedtrmphibiwjxkifllmqelqfabyhfwxlbrcnilyluwutheyupnlvabbcfbkmzjxaccqmnoxhkrctxbooqzkqcnsjqcvpmtpqxfdkvauiuwbrzpipqsfthacxeymstdjsjmcgoyoixscwhkoaevtlvxkcxyusbdkmpptgnjqmbsjlezliugvsdfubdothuetltoriyivbcgmhfzrbfnvjupkagfhajcnerfnrpksrqfyxgqymfuxblhbrmktynjcgorxdbpwtwvqfnprulovwxxqljljwuoekfbpjtmcrjtwwknqvdntaklmuzxstlzgtavcvhenqzlojbggeuchgnvcosxigwqzylduvhjnjwcuxkbcgfjnsgrhyoremhfluihpssdbohvmryqydbnyhghhvamjjtwdcftwxyxofucytuyyvlwesflpfzyotvsxantalsqsmsqhmpgjcenukalpamevjysllnlyfdqrxgzlxhualjwvkilkurfdpzoamcyrfqkdwlowslwgusbgaoswfzzuyqwkswdxmoclbthuedaavdhyszuzzwwzmskgppdbfiohbvdhyfhwiqwcssctqascseijuonzybizxlixqpvbitdamhtchlhcsrlofyndayezjmwaeubongobojexwnzoelckjsplqwkzkjbqdeeslsubdayanyotltfwlvkdtuedfguikybxtxywxxymxnfkilgvgqybnceskadvbesubrsaqrmpgrzqchlkajnnnshyuktvonrrgmtyffnlzoddwoowxblmvskqdfntthnbtgayoplneoqacgwbkhnhzyzednyyulcprcnfrauvolxstvtdcineimkoziovtqknuzumzrjpejhxecdjlqptczjeiyzdomsjlpxngickrkjymmhzcwvhvelfemltademudbaldmfpwdcikdniywffjljvyewbikwlnyzqleghhkrtngbocgvltgjrnhvxttlgrkweqenzqhsenvusbrfxzqomxlkqevyyhxcxbqwsxqymlueonmlmcczanlsuitspquotmkljclynheduqrjvtkxivpediwuatiufuhrwvplctozmfkhauelrvpugmqghyamskdofuzjopicvsjxmpifkybsmrztpbhjllzshacxqkznfkktztzmtaehsfcjhjvuwunevrblbdainkcnfdbydfhxljjuveotydxvubgyeigttkgynhztpgsasbwnfmigqibmjkmpsvilfrmvaloptgrlknapcjxsrzgcjttdodrvudqxqgojngxxvzoximrbnafyvybjcsgyxxvndmxsswrpvgpguijhiphdpiotdvuaspoxbnqvljngpcolkyutpbyeknapiupclfbpsrmdbzmsdagoaajpcjwowydgsuidakuudhyggmbmohapjlgnucdtaizudkaduuzzdzimljyasyrblxrhcuaedazikzngvmhzmplzyjzsjswwqndujeymezwqajwwyfxkvijvtlocfmyvzbrihqxlpvdsfbodhnpcvaxonnstzsqavildykqpfuhmxxpekgihhgxuvppxjgzfokkouafcwpoumgyzmhivpgsmxhlhnlodvyrsyxwxmkrasrbhakcrsugperytcmxakqulnqibcbevshcvteolbudhmbaqoxqaqmlfcvjfwncrwemqkabnxgujixbywsameosjjbqiqszmwncipgwmmsxwpzumtvyxjqiutycjqdwoqaxigvuvnsrdtormlplwiuqdsvnlylbrlyzuvtpjniogwfsjwgfgawmurzhrkjivjhrfdgosrebplvzjbesbceyvdfnpoxmyfedkmtcdzdvmzwvaapeftcayhppyncyuideuwgaxmvjnrgntwtarvbsfshffldbtgfoeoobclmpesezqyakvdcavlfdxieqqmeucuvehjtnexnuxnetsivnudsrnzjeloypkwtufohjnugljmgbxbrrglkuktyxjymwwfqcvznjwvufkcjhdcaknmgahgxtekpbrhfnguwcsskeutlzxnlkzrkizkbewshnzocikamcuwgortqoidbjxlswvtcrmjhnzlxmmkqggzxaspodspmpdemaaosoabdbmbnalejrdirxxiapznhcttdtjxjlannmocpziyslgmlfwnuvcdywydricbvcqkqenffxfzlllwqhjnfoqfkridzkgwmwhccwkjtpjedwcvgoklcdqouarvkaryyacdwmmsexwjubecppnrsffmfyhryapzbtcxiormoqxirbkgqzxkgeynehefivejogiywcmksjujlgpdhoqnsoaywgdgbhrspzqobfytovebbtflhxyblbajhfplngdeivslathrolsrhxcquduigwrnbjyqrdvbbnndiwuwjnqqmuhhxbrdxktavtrnzooadddmzyijlybxtigslxykkrlfkeujsjlvmphopszasaxnlgiwfgjpzwxjarvucirrxbhmtgongobrujqbrztqxqbzjytmhmfgnmvisjwaxzstkkvdjotigwhpvadcoikcwfmopkpojjivtfyevtmbqtslvypjgzndfatwmkkwtutmbuswnezdzsquqfgyhvdovxmkhwidtbruvktlqsqqkhmcoubxqelndxxnwfqrjjngtgrmzielrqohnpfdvsqzqqoovefenuljbevaozlfrznequjmmcnesbspfzwuujfvnaxcbkjvmwzcqjqdldhfeculdqgxzlupotrreamszmurxlwkqgpvklgncondchssdljjmwbnkxgjkdvbjmytxeibvvfxfzrilctzyumktsvexqhicfdcjmdghkfmkwwvzpwzlkmfchjcaskexogicmpjwuyitufumbvxlhcqrnsrfexcuenwscioygztcenogjotsqjjgdclkaqegddyhlohtnbvuqmcbavushfamimwkedsjgsqrixkyahsrtusvrmqyuqlcejokmgtuallilxglfycauxymlokfgxhljxvvfrsfcfondwzkvdmrakdmaorjnbwwarugkmnnrbawabgxhvohhsviiptvqpssioytamgtpiqpmwmttdcbvyldneyftsxbgyuimccbnstzqhukkwlfwwkjclqvdqymotucxwdkqyjhgdtsceyyckkevabbszpiujksiqcaoojutcnvinukxeqvgryztnhnyufikijyysvrxinfxhswnirtcrsvecidyqliawgypdpmletknlhawauasovwsfbqvnavljtamloarikfvthrwdrosommuofrdfnoqirdvhfnppullbehfyvzmjlgxsycantqxkvtraijqcwddakiyhhnqvvqpvspinigxdbrejcwlyzoajzbqioifjyvftkpguvgyyxchzauzzjzkkacsqkyajvhchwkcuqasneaoeupdfpprrrkibkkkfrompzojpqcfuevyaldgcsxvjjflvpxaimpynfjcwljsrftsswywrxrajxneonhzbyxodisbwcwnjpfdnfzefqhonwsejbdkzcafktigvgugvbjlhirmayaqxuuiyxtxztelopslvortpceymvmnwmftjzbhywgzsnkgceuxulqmowkcsxrqlwlwxofvloufbhndnhcivvulrgnjffbtbmpzbxwolttmcirpstxnotygcnrhutayfsxgrvucopqqahgsaffrbfzduqkplnnrhmzyhwcynsqnzyhbeouhttkqkwfxlsqsgqspoundmerneypkpjridbapafmlzdgfvyvltkofqhtvikfxvxhaaipapeopjuwgsttnghvwrqrzaxwxwfywnpzdvnugjqmdmfrspmogcifehdbdizbypcbkrvtanfeznvrejgklorrvwsaesbcjefvxaoyoweplzhpkpzxfsocogcsafxllcjjfxjvvnkgotvyiwvnojpertzsbwfmaoxhogejtpshiphtmegcnyhhribsgghgveqjnuuglmqucznqevsttbanjbhpioyfvqoikiqwxiszihpmcjfylglwjuorlowgemqoximurgtbnknstuqgcddmxtfiheqlsgbprqliwgjkqyekuusxxvlwosfvwxirgkixcuhyaqktqofkkxjhtugjnnhlkreqdnpfhwejoqcehhrrfabaxhlkuuxgmcxppovynbhbrmiytbsabtcyaokwikcumbmdqhddikgbwocspuutnxrpnelvonscrehhnkmvwsyvjanyuhrjglatrlrhbjlspubcenzchxxqampwwiicviwownvzyitpcutijslqrkhtxyqvgyxegtseiqdgywxbqqlbkwscjzvixndflajuweygucpuamxtdjunfmronpymcbsoedkajigdmvankxingccopueejdrlelbiqnkawtfkqfzadhpjksxboehzhymljowadgcbbhmsnnssxkdjcdkshtrosdbdtxfzghahpmzccuwzezkicwclptzhydluaqtiatqpirtmlpnrqxbvtdgiyiqzldvnvqwvlmmvffhrwukntmimpqvqynplskzpavnljzhofqhbnsqgeatvrqnrfcdzocoqzbeibnyidglsaczgcubvkrnrvqqkuectigdlvdvbjgtlksrnmviymxphnhtjowewejjanebykwkvpbkdwucistqhdlrrhvpmfyoucrsonclcgvicsmnkhftkqkbyiqmpqcjstbjggulostqkffwmkpxdcadkrrzjtkemnnsvjdjbwcndhlqudpzfpcritssmcwaplsluyuywylagzscchbhyfyhyqbmuzojkgwggtedrsfzrzbtgecgjapjsqxmrlxbuwkapofgikizjjurqwazyplqgiexwebqalqpbyxmifnurinhenifdtxleckagnqiaixegwqrednxlcessozviwioyuogigokonoxmgqqkdnxftrxhqurnefnztwjbkvqakposfgcitcpotpxmlpzqworskctxxlzjancftgpoiheewbqjsrzphshsuaruoqfodjwyqnoausgstwcmpddxwkrsmioaaurffndxaryxjgpefrsuvvttfmluuawuwnzbcezdxzcghrnmlfhibcdipqclszioojsrotwluyubrhoemxopbryqiaeabmrqxljnefbafxbyerdsotiqniixkozmcqeabpphuqhbnlztcemtywllevkokjcoaiodxentwwukhwdmcrfapsntnxkzjoojxeouidqfamrhkwvnoapdudzicjjlxxwwcntmqjtqxkaihvvxykaspzcukmhklggntbcjkvciicsrznoxxqspswjeisouyxjryndljfvtjnkicaibqcqkybpjuffscqmdepqpwnihaurewbfodyzezonvtsqyiedovtdrgnaijrofttuwtvcvjpqehiesmhghamaizasjsgqlcmjvhmqqdjxnrbfejnnlbowboomixevzrhuytnrywolnrstaihojxkmlaawxfrywytutgnsebdrtylvgujprveeyeavjswhspemxrgdvluqjhlpdxhwunbsrdqdxmkqdqecikffvbvfjgwofflasmumrkppybfbsldcvkhqmcxxkwlsdwswkoiebztzaabulgwirdydfycswnkzmevysfctgvtjxwdicaqvdralrcdnspmetkelrhhyecheymocmhysyyfrdievzsbscffwomwvofzornrguryurdnunrrmmseqalmqyklopmdhcwnynnvgqibfcstonzgnktfkdrzvfecjcrkpefvwpydttwhgvotfjyqorrjzvnkxeuokblitmlmfjulekgmvgejavvzsilrpghzjuicivpnflalxgxspbdpyyqshblwjuxtphxxdmnkxnvuwtolwscxqsrzvdxfxvaoczohmbrlqnimiwzgqbdjtxiraiyzdyqhzeplhizxvjmfflmyprhkorbozzqezgmzmdmvllsjugocucclujvicxzcypgaxubjxnelbyuxhkbdndohojrriqvjhdjeympxzvicuecdpdgejulzfesovpzctihtuyqvuzaqdctuhbyqvlscqkqnapptzymvxettdtjjvedcfevcpnehxvuxmmsokgjjlccqvnbsrfvwlqycddkcaecosucddooostgogiiypdwavvcaaodcvhqnbvsgjhwbadrglagcfdedagdcxiespwhtrazchwejbxrozyqfdukfcnhzyntpjdiddkfmilxjloxkonrrjbylrfnpuigglrjobqcjezuporbcgtwruucncrcwalelcpcdggomgkbwdcalxwcstgfvyktaxynznrevyuhgekchpcsmbwguc";
		String second = "opcakcxiqwyjcthwdncppleuftvbbpdpgipqkobcmbmowvmzjopabvwgqrhsinjqxbjhpkmcnasjvfjgvajzxffozpiherybshkitwmgygrwlacjcnkctpsugabktblmkywfwknvqfrehvpmjzoeoiyvibhdfvrrtnxpzkmqpfuzbllmkzsahsvrvfwaaostdrkdbxvtcpsfcftmgnmnfkgdpcdrqxkwouzstunylhdnmxbsmnhszpvqrahkatioohijdvhocldqkeiwtrqvgnlaovmooueebnogkvunizfudotyfltozhopcadqujvxyldjgzyrydldtgdbszprgdgiflabwxyvidgreeiejvjdcmgwlvntavdfiegebgbmlhdrnlvxiecksiggdvbfsfkalshoaialsdcfqzczfgjxosftphyiokkzcrnccqputtzmselzkwxzqeugntobfaaisqmugeobxpnstarexqfnxbtkwjmckomeeaymeooeddyzerfbkmqhnkrmvfohuclyclnjbbnfgngkelnoxexmqrynwovqqirtwgcxjrepgkckxrbwxyjppjdoyagqkxlgdpemgkeovgzuzcrxacmslrglrmeempkrfqgnbmcyudstfjqhlfbzwhmqwsukiedpvleyxiwtlonsafankdohnbxjvrvdxauuobsnjqhxhwphbruovjvimuthnqnmsjhgkbwusdtbziicceqzpnjdhelwuajojsxuttqnwjoxtyzvdswsffwpjjlflwwuotqimgxkpmhjkigpadkgkixwridcfzyvspdevbonpxybgerijbqwjnscyxgfxearvgytjogymezukscwtvscimgijmnitoaowyhfonfatgwgzbcswwxgkdpvqcglsgzoghvuwaxshtagweasaxbmdqjvupgnxfdfozcnbzhkuhsrltlnsmzvciqzawoxerdusfjweqgaxztkufxmtyiyjaxjxlgdejxzqhvwxdxxeqhyxhnrfxpoxoxwzgzdrzciizehdbehuoitxvkcubtrpsoqypuqoyywacedgkmcauvxrialjvfbntrmkneboczogdtmqfqqcmqtushfnmiahaorpssfwstdxmrpuiiwuyrqqyxdkgfriulxoddlxyoxnhmjpwfluydmxbrjhxdptoohttstsiqhqeqhbxvxvykszbeiahxtvmdqfvjzebiwgydjvyitxulyyrhyyguvsxoauxbybkwhkasiacbzxoavghvgnpcimqkhplhqxgziitqiwrkthkonrjugbyqpoayfoiwnoxvwrnengqioaydtjxakvqaltatjirwwoushjzwqregsejlojnyggauzbnklegkscecmdyevfmpjvaxgqynwahxduhpapzusdwgjxkgcyvlvxlcnjrjjagnupewfdqzgphrmrxorsbmsmofxhrhhzwdpazwfqvnhcftvehmxiarxrwuypdgpbledlaidxwkbddyhmmgwmxtdwoeltmavxgyiihlhfxikcgroualhxemvuqjqcjlasjkasyizvsjybdovdzccgrychhsmsdompynjyxjuruusxioaksdqjdutmnfgqtthtirsfcoywkrusfwezbwjercsejzwesgxaxrhzffvpyrkfqqfrnoygsqkbpifjoejnwsodamvydhetxjnmzlsrdeutnzeddotbihfitahzhnugwhtvslowqirfhvkmldqwnveixnhgacmwlftgtjelrxsasepgifcxcifzwnfwrtvebqkuaohtlzugdjonqsksasryhyxyrueskpomfvgtucbalppdjcvluokbmjbddfypwmccikvemweznucwwzhsnttzcwefbcxypbcxlxbzviyiecgabnuohppllttowqolrqkepndmvbuzfcbgqvwzklmxefmcvapotzsknvxkytkdwnlolhnvsbvzhhbcjtteulphjoujhgpdtareigccixbrgfvryowscnclbywieloxmfeuogyyfaplhkcfbazdndqobmxfylfksjgipeiuezhnmjsnkuqzxgobsngqyncswidnnljtnqhzcbmovenvmbyeoexoubjqkogzzpsoibnkdbaahnxtrvafczwwahomvulwkgluhaemeenltmfkkhsmgqkixyvsvgohmbbwchiinxtgkarwhlkpbuayuvspdiyskzoogwwtwrcgstebgothktheozwthultwzjewhaszcatxgwdupkekrkaqguzdfvbfefdofxphzkefghbytfikplcyfedmzerflwtrvkawuhbdqebmllwdwbbdhgqgmjnxijqdtraqadtsiwevjdyieblnhdttnirvrjanaafcgyvqwzlfcknilbvteqotzhqsrrhtrmwxmtniuboxldhwefrlviewpvrimycfnafztuipvymgbwfibytygzvywogkmkqzkxbftjvphjxiheqidlhllejhsssgckinhjuasrrbbrjivctancoagziarcgumqjvzdxrvrsyieifibixdwylvinpmwjamuvmzufwlautedbogjlmhlzcvnrhjchvyejyzpukppgvuhjcswoziodddxnmzujyztyakskbjqwdzhirdwqnmutprgdscnsdiqdujqvsiryiagzfestromifumzybsclkhfvzaoitoqtwryalttzhcgdqicrcgempjiplyxempzkizkwvgxciegaoktqsxehimwtmvzamakxzxtudqznwhnmticlfjspvrikojkbjvaistfvlgkknxygfbtmmlbhelrtuewdzwntruqeaaqpzpxgsqseevniifbelxjkvwfmtvrvxhlwwkcodwuhtirbpvfauqmqmrchovdlfqhdclufhooawgdlbklvaznoqswgnzrsraytlszugpwdvzqylcwlbjaubycrzulqwjlkbkeicbnxcdwohublddhhbjyaflscxemyqsisvvsybqoikpvntcwumwxrirvfxjfocoizlaxoqnzcduqwxosllretlaailfynvhnhjmvcauefrudqjxbwphpchpktwjissxbbmwdotktmgwcptfnkmcowtzpskzkezlhljlzevuqdsutnziymloignzyzakdzvlmhynlvheyzytnycnkpbuxrtystiwvejhljvyeecegbatzciltlfqeaoxvxvqdeaqnxotbrzhuzcvbmgwynpcpdbkcwdhadxpaokdhklbjpwncejctygieiugexqhcnwebjiitvlekjrondqibzqhhlqlkguntttxcbhvytzjctzswsazrthygxlqfifybzxdcfababmeulwsfzswsbwyykqfsyftxdyzkyckboowcnohmiggjegjowoiuudtzbvjzxvbojzqwpzkyfqjmwtavjlrdoleqgnrfiutuvjslldlqvucunfpxqgcgthwzwqhfkabgmtrxwenuysoozdlrlpxfwwgtmnawobeauvxtbmnagdofgbyrqwwpufkgsmcgpjilefgiutiawyiezgyrewiybueugjcxsljyspgmlqnjoxondohkkpimmpiuaksuxbuqqdcdtrnkodzurgedyorkfzehmybjzyzsbcxwvkgkpggiokmmafyiffptdtcfrezuiwqdjxpafvjthxiiciqjnhctaharlzltxeygbohijsbtplbtutdhahcdocubdiwbmvjplsxwkapzmqtglypofurwynxcvufjroychxatyqtmiosuojktfbpeqpimjnxcdygmvggvwbhfrbbfnlysoqwefesqtssxqyjlgrhdsokjslofypxohuumapeuhwtxwcicwrhoiraaeofefeuoypabegxlcqiausfqmohuihwoxbtdhnrieujiagtfydhuyolkdsglzczwfubmkvuorfxtnsylyigwwtiznommsokxkolulijcnivbawoyewwcpeecsqqkgdjrrvlcdwgsebvhzkhdgegyikcdctplybcpwptbmzvscrzcbhhjlpjvzmyehqpfrtupipswonpseoufxcriragtogzvwqapjwetnwqdkhwqxqyvupforlhgsidqyegjckcqjutvbrlbijweabsupbahldzjjfuoszgdtzyxrlybxwhxxcrmdtvpzvaicxywwezrgzozloaikjhklbyrwwivtkgxheudjtvptlogcqqmzzynazexvmuqwanefhjqdgfysveulwimvhbyifxdtrvssiyzqhpvowtirzcevksqtuobzlgvdbnxmlyeunzijuqctugohyeauvewimrnqgkcriglxhwibokujskstosnlyjulchdiufbenpewlmxbztmrdektzafxjbkokpwgwynjnrhafedezqwcwiwvidvugfiqxgztemdtdmvktzpsrnxnvvjgyecglkyisxcxlhsqtobmpqhgdetazcizikfwwdepdioorgfnwgblyirbmldnpmmayrwvxckanyqegvtddvobfiesvkhkwumulirknbkabbgkycnexdfcnmwiwgvsahonsgyfjihnlpxmrmqqrxvfjtnfzizzqqpkynrjxywjpvxjhnbbkygwutdtefvwvkgtzxcwxbfowczgrbheznavifpokmkfyqaxpftoibdgfcmzfvdhkfctktjvhucfmfeckaqubvaiynhdkmmvrpqeizzqtdxgiekuecohyrryezdolqlfhbjpbkhwnheylqurtjytaprgqwwcmijtlslmculrbppmgkdbvduxvnfljdpylytxqglubymeqbtynyzkcvhxioktsatfynertslwqxbgbueosfzwaitkzgergxwembvivjelghshbywwexsghorguxxcwwgjzerunxfvfzdiabegyzmhpfolelnbjvmizfeockkjlpsnqytqzixonnzsbmvkkhvjmzaolmaxdskvsgnsokidakvbyqniziuliwcticsnufiolvibhtehdckbuymugghqejmolebhljwyegznzgvckfgefuamaiegtqufvvmiekhkrgxqoutycbfhvhvxradlqxqnsewypfignhwcercguhpprloinrtdqltiqrifwsnjalledomzxbpqodzbxufngayyrgfnzsybdkhiatizwzqlermbltrttrtmxybyqazwmieobopynhlsyxvmrohmfbzfzadscfoqnuerjurybcqczoqsexfkagpaiuslzibncielexkhzclasbtxbajbgybqsvdudhhgpnttmdcliolapgzqiisoivhdtkxwrgegvybhdeunuhojopcyawnirunkgmjyspeppiytosgiawrqovoordylzmxgygetwkklujgibpsdnkvbhmpzpokrchzcqfvorgbmriwuzpymbvoihfjzvtqxdpatuxjlfkzwswrtnrgoowwwbgvxbnweeyzayinftncnlvhyopmclkymsvluikaokcoikcofrsvcpeadtofeygsrbenmqnaarrlctbjkvemkiopdcuhaaateggsywsynjlreodqljcxusmxuhfxjhqpnzhnxcnmnzgspjidsnamfnmcwrzharxpqgcpipcwqiqgtalnnlavaoxyfwghnfwglyvwpxughkockzqamsvngslnotudysjmqfifeenoobqacgapyvcgnptdjnhjhqxxxhfeluszwkcatcptatanlttujafqsdqskxwwrqxpczsvehpedrtommkxopqjuibffzdyrcqtciririmuzhiluujkmzvghynoxsoqvemzodhglvckclxyhgjthgaqfnecgvvdbhcqkjyxeahgleftnqmwwonbetgkobnqkriuagregamugtptldsisflwatirwxjgorcoxvufvizecoznsrxkyjizeqqbpzhdsktrhpwdxwjbmireaoqyzyxeqphfqokiadziswnsuwtgekngbdfaeegwunemeovgswqmsdeobavimkonpvqtcyswowiskfyecptwuzlyziiosydhuvdwuvuirecdkckotdkqcvoedwsxuvfqtionfixypbbbfnpzqzrvxhzcdtazqhsjpgywrvuiyxjelydbzwywdzbisbjlibuzktvdqrlpoutzuydtwbszbthvwqggudhewejovwfjsajmyohwpbvswcquvwapzjvxngokctuuufiutprktmfprvkmtmdtwyslegwgascuxkoszhcuujklewzyictgansguqowiqshaizbqdwmnixteyroamvcapiwfyspqmysuzvmetyrbxnhvgwxttztijpphjgxxeptdlghggbigqpdwnbpgakqkbftmntjrkdwxlgethozxddvtelzgxqszxollhvetabrlhxgqlgpqlkjpxjxvbquaehlneqgetzrcwyuhgjyrvhivsfqvxmwdvhqazzguyywvyqeebcxzmfugmmcmaarxhixjjefhececuliypfxbmtkahmmjoegvoegzkmioqnskaakphjttcdvlriufodcehldtxljpabbadmskvlfaoalhkimalqeubjnaxypxzraedsqadvatxoakwokherdgcqgzqwxppzvsrluwivrhjrrhfeqlxtrzlabbwasnznfsabqkwhrhalqfrgsobkpmmqpkqhxrwejyfbicialilcpekismujagcqqsznmwrxwwzfahfmqsqfwcpqojbppdhhygukenhbkggmqnaihqnftfxjoyygehpeokquxxvjgdwyswgbpvgkaftreuzkbooryemydjjlnhjhgpjvlrhlxaedwdnysdrshdsmpcyeljlrzuommvzjyeouhbuzemunrmbgozkalytksiygdxrbbfylismoegbytdehepjppdbjnzqszjwarulbmyqtetrzyxjfosudxynkzffyobbhxoljobevuxuvvdajwwnvuaiwfnwvqxfnmqyardvncsixvihtfwpbyxzdmwactfphxpkouhexzouxzdqezfhzehcsffwakniiduyxdeuftrcsusywahvgoazvfxwrleboacldgikbzmvvhvrjdpptpqpwolnbrrprtcwbkjflvahewynbpfuexjcnwqonjfgeiffuomglnnqlnfmdkijkumzqeogntmrdryyhletarjneobjbjtndfmwjacywqrzipxpcdkewtrbksmnefajmmfvpjvnamokcmbgrmlohcrrxdebjgmvvutkdozfdnrfbvnthyhqbyiadobovpmqjhcpvbuaoofsjtlstuiusquxhxmcnyuyfwnczkdpykhhfszzmhvgasehpsleqfdxdqbcagrarzjytixgsvounsdckojcvmbyedcfjvhcwrbqbaytvmpihsntiwydkzdoehvqddszuvpxypttcieldtelrerbewpkelahqvimqajopcktlqeqjlbcpudvrsgxfgexbojuotkgvwzimgyxtcziwegpzomeuscyhnuxgedebdoplpperqopvufuitafmefvszuadyggdvwoklsddisyfzsntvuhzzeryyueyakbxiphvjmzsfxxgsmbnjkoioijpcpnezpcigldsyekfcjlwxplgzzrqhaflpuqqluaufgmdkykohwkglvnmxecggjsxekppeqllyxrivbxezjlmhazeebkmlelrqaiwsuiqrbzpcytcheoqgnumrhycnjtemdcexmvpnwequzudgiumyqzpxxtnjotxrvbpiygvumnqlhursqeqgdhgcctnsokjjmatkgrhsexgorxgjbyqghyjjtwbhhmqvnmhvdoqhmwvfvdpxbhfkfotynwfwjxtyjavmrlwfjtmfxbeakjlragppfwlqueofglszzqeijrpiutlffwwfeoujkhzgnpmvbgvcwbkhsasnvduabshfgdrtmqbbipxlvuntvzdobvdxyzzzrjgamxvbqwcyozljtyfpxifzfkyfjzgcimevkbwaayaoalzvlemkorjvdjaojgtrtxofbmhbnhrnuqkfvxplqbhumhkvqdpjddqeqxhfgyscoejlbyxubgoopalfeaqhggnyfudnuxpibyudztzabpqqpewtemakvpiajnodkfomekrffqhgfawuesqihsvcifettszdanrgzkleaskhsiewbuhimemujqqelpklebrdmehowtyrbcpeyyokcahorxseocpsgivsmeikxgdykvditrvwucknberphihnqcheipqfyufkpktkcoiysultzckgmrvcvcidtyktupelazwepecjbpcatmiffdjchrfcprwmgcxidtosasbbhfdatnfyqqazhhbzyxlgbipeedygyzjfgoizbpzrgbqnktmktzrukizonxwlzfrftzhuqinwkfkuyyfrayokgpatmwhnbyvwzcspkfowmytkyyeyyukejkzvggljggfhkzxwgltslmflmlmkfwqohplnywzeegmogllmygflsmwexkqchgqoxddxcceglqxrdifdqmoiymovxezgmrulvzjxenfpfciimnnccdmapayogxuspqemsplwcqnhtxrfmekohwpyxnnfmhadaersvcqxtfeocvtobfdicugbjvgxdgbfmsxhvpequkewhzmifrqhlzkuuquzzvenpdvksbcoogkvgzenqwwcvgysysrxpynfdirylumzczvkybxoxtsvbtnalgzdemikwziivujyvgithikfbccfvphjvgmcvwmtxwbtqntmtdhdlrkpwmutdbcajqceoqymmbhfqctmfcprwzislclofqooitvxlvlayuhpwabbequapcucggslyicibxhpsspqmwfkyimcyifpnztvhlhfujqxgxmaqdqezypzgdehnjwaiqwsbfxxqpvwnjydnojooyovbsepdarnspfwuftkuqihagmnxwdnwriylopqpiejylfuqbfnrpwtyjixhmkdfvdrjuhadnkdzpxrsegkudfuoorvabafyeyiaiidxsiwkgqcmwoizucnivkkzlrxrqfraqxxkhwupmzcknkmhpzrkmbjzvhslolnekkrsglhukjfawrjlsbxgejfzszmglznvmepsrxpeiwegnnthqrovavusvjagipduvtpnseracxhpmaydtmavkwphfqpqhskdnbqfhjijiraurzznnzixyyedqttxogcbhshrdpalgbizahonjxnhxrmpnimbopexjlopcpcksmmsuchfzuoyoandicgytkweyktcbwntibnedvlfrzfhctkmxqlqbhubtodxmsqwtgdzdoguqleugogdhrtkaqlugorsjjqcrvdumlrcxvydlejuyeeyurscilurxnvoizlukcyjzwpmdahbenzbfudnhaeenzvxaiunmsylrnxungvuuuvzoyowascntznuhhjtzhgqxekkmhggcbhscvocptslsfhamqvnzcgwishuapderkwvinxzgpmywtakjwajyghgyqcagfexsbscorbwjqwfjxsvvsgvyndyefbklfjfibhyukudarlkqdhlvngvajveqwqbezimcpnxchceynqqsxbpkhknsitjekmklvxomknqtpvuflkxjmnvvziqhczoonazkxnzjcpfsmzxyjwjxjgvlplutmkhblimkwlwycbspcppnoalxggkxtfqfpzgciunghjgkmzboqsbesoeawoypvqwnsfpazcijnotbnwpgotkihqiefitabsptxfvyjdhzrcahaqnqjzysqjwxtszukppjukhfnrehvfqwxdoienawyzttrtqbkfkgstlhmqoixegujweqlemjdifwdvxncjtufecrwsbtzjnkgta";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for(int i=0;i<first.length();i++){
            if(map.get(first.charAt(i)) == null){
                map.put(first.charAt(i), 1);
            } else {
                int cur = map.get(first.charAt(i));
                map.put(first.charAt(i), cur+1);
            }
        }
        for(int i=0;i<second.length();i++){
            if(map.containsKey(second.charAt(i))){
                int cur = map.get(second.charAt(i));
                if(cur == 1){
                   map.remove(second.charAt(i)); 
                } else {
                    map.put(second.charAt(i), cur-1);
                }
            } else {
                count++;
            }
        }
        
        System.out.println(map.entrySet());
         
        for(Integer i: map.values()){
            count=count+i;
        }
        
        System.out.println(count);	
        }

}