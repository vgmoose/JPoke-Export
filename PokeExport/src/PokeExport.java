import java.io.File;
import java.io.FileInputStream;


public class PokeExport 
{
	static File pokesav; 
	static byte[] data;
	static FileInputStream fis;

	private static String[] items = {"y05b", "\"vxsb!KYv??", "V?s!vKYv??", "Y!NXSso0dgb!", "@!bvsKYv??", "o0DbKYv??", "YNlZl?b", "[b!nfxv:v", "\"005K`s05b", "^5sNg0sb", "Yn!5K;bv?", "6lbK;bv?", "^dvDb5N5X", "ov!?ZUK;bv?", "En??Kebxs0!b", "\"v_Ko0sN05", ";Z+b!Ko0sN05", "`n+b!Ko0sN05", "o0sN05", "Jxlv+bKe0+b", "eb+b?", "\"v_KJ?N_b!", "EN!bK`s05b", "[Sn5gb!xs05b", "Lvsb!K`s05b", "[b!nfxv:v", ";oKV+", "o!0sbN5", "6!05", "Tv!q0x", "'nlDZKon5lS", "Tv?lNn:", "ev!bKTv5gZ", "GK^lln!vlZ", "'bv]K`s05b", "\"bsv?Ko0dgb!", "ynXXbs", "o0DbKO0??", "En??K;bv?", "ebiNib", "\"v_KebiNib", "@nv!gK`+bla", "`n+b!Keb+b?", "\"v_Keb+b?", "ON!bK;Ns", "[b!nfxv:v", "E!bxSKLvsb!", "`0gvKo0+", "'b:05vgb", "GK^ssvlD", "[b!nfxv:v", "GKOb]b5g", "GK`+bbg", "GK`+blNv?", "T0N5KTvxb", "6sb:]N5gb!", "[b!nfxv:v", "J_+K`Sv!b", "t?gKe0g", "@00gKe0g", "`N?ib!K'bv]", "`n+b!Ke0g", "ooKV+", "JsSb!", "\"v_KJsSb!", "J?N_b!", "ebgK`lv?b", "`bl!bso0sN05", "`a`aK[NlDbs", "\"Zxsb!ZKJXX", "T?bv!KYb??", "`N?ib!KLN5X", "\"00:00K\"N?D", "jnNlDKT?vd", "o`yTn!bYb!!Z", "@0?gK'bv]", "`0]sK`v5g", "`Sv!+KYbvD", "oe=Tn!bYb!!Z", "Yn!5sKYb!!Z", "6lbKYb!!Z", "o0Nx05KYv!q", ",N5X(xKe0lD", "YNssb!KYb!!Z", "\"N5sKYb!!Z", "ebgK^+!Nl0!5", "[N5Z\"nxS!00:", "YNXK\"nxS!00:", "`N?ib!o0dgb!", "Y?nK^+!Nl0!5", "[b!nfxv:v", "^:n?bsKT0N5", "B?dK^+!Nl0!5", "@!5K^+!Nl0!5", "T?bv5xbK[vX", "\"ZxsNlKLvsb!", "[dNxsbg`+005", "LSsK^+!Nl0!5", "Y?vlDKYb?s", "Y?DK^+!Nl0!5", "[b!nfxv:v", "o5DK^+!Nl0!5", "Y?vlD@?vxxbx", "`?0d+0Db[vN?", "oN5DKY0d", "`sNlD", "`:0DbKYv??", "ybib!\"b?s6lb", "\"vX5bs", "\"N!vl?bYb!!Z", "obv!?", "YNXKobv!?", "Jib!xs05b", "`+b??K[vX", "evXbTv5gZYv!", "@`KYv??", "Y?nbKTv!g", "\"N!vl?bK`bbg", "[SNlDKT?nq", "E0lnxKYv5g", "[b!nfxv:v", "J5b!XZo0dgb!", "J5b!XZKe00s", ";bv?Ko0dgb!", "ebiNiv?K;b!q", ";v!gK`s05b", "'nlDZKJXX", "Tv!gK,bZ", "\"vlSN5bKov!s", "JXXK[NlDbs", "'0xsK6sb:", "`sv!gnxs", "`sv!KoNblb", "Yvxb:b5sK,bZ", "ovxx", "[b!nfxv:v", "[b!nfxv:v", "[b!nfxv:v", "TSv!l0v?", "Yb!!ZK1nNlb", "`l0+bK'b5x", "[b!nfxv:v", "[b!nfxv:v", "\"bsv?KT0vs", "O!vX05KEv5X", "[b!nfxv:v", "'b]s0ib!x", "[b!nfxv:v", "[b!nfxv:v", "[b!nfxv:v", "\"Zxsb!ZYb!!Z", "O!vX05K`lv?b", "Yb!xb!DK@b5b", "[b!nfxv:v", "[b!nfxv:v", "[b!nfxv:v", "`vl!bgK^xS", ";bviZKYv??", "E?0db!K\"vN?", "'bib?KYv??", "'n!bKYv??", "EvxsKYv??", "[b!nfxv:v", "'NXSsKYv??", "E!Nb5gKYv??", "\"005KYv??", "'0ibKYv??", "y0!:v?KY0_", "@0!Xb0nxKY0_", "`n5K`s05b", "o0?Dvg0sKY0d", "[b!nfxv:v", "V+f@!vgb", "Yb!!Z", "@0?gKYb!!Z", "`&nN!sY0ss?b", "[b!nfxv:v", "ov!DKYv??", "evN5q0dKLN5X", "[b!nfxv:v", "Y!NlDKoNblb", "`n!]K\"vN?", "'Nsbq?nb:vN?", "o0!s!vNs:vN?", "'0ib?ZK\"vN?", "J05K\"vN?", "\"0!+SK\"vN?", "Y?nbxDZK\"vN?", "\"nxNlK\"vN?", "\"N!vXbK\"vN?", "[b!nfxv:v", "[\"WR", "[\"WM", "[\"WH", "[\"WC", "EvDbK[\"WC", "[\"W>", "[\"W9", "[\"W4", "[\"W/", "[\"W*", "[\"RW", "[\"RR", "[\"RM", "[\"RH", "[\"RC", "[\"R>", "[\"R9", "[\"R4", "[\"R/", "[\"R*", "[\"MW", "[\"MR", "[\"MM", "[\"MH", "[\"MC", "[\"M>", "[\"M9", "[\"M4", "[\"M/", "[b!nfxv:v", "[\"M*", "[\"HW", "[\"HR", "[\"HM", "[\"HH", "[\"HC", "[\"H>", "[\"H9", "[\"H4", "[\"H/", "[\"H*", "[\"CW", "[\"CR", "[\"CM", "[\"CH", "[\"CC", "[\"C>", "[\"C9", "[\"C4", "[\"C/", "[\"C*", "[\">W", ";\"WR", ";\"WM", ";\"WH", ";\"WC", ";\"W>", ";\"W9", ";\"W4", ";\"W/", ";\"W*", ";\"RW", ";\"RR", ";\"RM", "Tv5lb?"};
	private static String[] pokemon = {"\"NxxN5X50a", "Yn?qvxvn!", "6iZxvn!", "Qb5nxvn!", "TSv!:v5gb!", "TSv!:b?b05", "TSv!NUv!g", "`&nN!s?b", "Lv!s0!s?b", "Y?vxs0Nxb", "Tvsb!+Nb", "\"bsv+0g", "Ynssb!]!bb", "Lbbg?b", ",vDn5v", "Ybbg!N??", "oNgXbZ", "oNgXb0ss0", "oNgXb0s", "evssvsv", "evsNlvsb", "`+bv!0d", "Ebv!0d", "JDv5x", "^!q0D", "oNDvlSn", "evNlSn", "`v5gxS!bd", "`v5gx?vxS", "yNg0!v5K#]z", "yNg0!N5v", "yNg0&nbb5", "yNg0!v5K#:z", "yNg0!N50", "yNg0DN5X", "T?b]vN!Z", "T?b]vq?b", "Qn?+N_", "yN5bsv?bx", "1NXX?Z+n]]", "LNXX?Zsn]]", "=nqvs", "@0?qvs", "tggNxS", "@?00:", "QN?b+?n:b", "ov!vx", "ov!vxbls", "Qb505vs", "Qb50:0sS", "ONX?bss", "OnXs!N0", "\"b0dsS", "ob!xNv5", "oxZgnlD", "@0?gnlD", "\"v5DbZ", "o!N:bv+b", "@!0d?NsSb", "^!lv5N5b", "o0?NdvX", "o0?NdSN!?", "o0?Nd!vsS", "^q!v", ",vgvq!v", "^?vDvUv:", "\"vlS0+", "\"vlS0Db", "\"vlSv:+", "Yb??x+!0ns", "Lbb+N5qb??", "QNls!bbqb?", "[b5svl00?", "[b5svl!nb?", "@b0gngb", "@!vib?b!", "@0?b:", "o05Zsv", "ev+NgvxS", "`?0d+0Db", "`?0dq!0", "\"vX5b:Nsb", "\"vX5bs05", "Ev!]bslS(g", "O0gn0", "O0g!N0", "`bb?", "ObdX05X", "@!N:b!", "\"nD", "`Sb??gb!", "T?0Zxsb!", "@vxs?Z", ";vn5sb!", "@b5Xv!", "t5N_", "O!0dUbb", ";Z+50", ",!vqqZ", ",N5X?b!", "Q0?s0!q", "J?bls!0gb", "J_bXXlnsb", "J_bXXns0!", "Tnq05b", "\"v!0dvD", ";Ns:05?bb", ";Ns:05lSv5", "'NlDNsn5X", ",0]]N5X", "LbbUN5X", "eSZS0!5", "eSZg05", "TSv5xbZ", "[v5Xb?v", ",v5XvxDSv5", ";0!xbv", "`bvg!v", "@0?gbb5", "`bvDN5X", "`sv!Zn", "`sv!:Nb", "\"!aK\"N:b", "`lZsSb!", "1Z5_", "J?blsvqnUU", "\"vX:v!", "oN5xN!", "[vn!0x", "\"vXNDv!+", "@Zv!vg0x", "'v+!vx", "ONss0", "Jbibb", "Qv+0!b05", "10?sb05", "E?v!b05", "o0!ZX05", "t:v5Zsb", "t:vxsv!", ",vqns0", ",vqns0+x", "^b!0gvlsZ?", "`50!?v_", "^!sNln50", "=v+g0x", "\"0?s!bx", "O!vsN5N", "O!vX05vN!", "O!vX05Nsb", "\"bdsd0", "\"bd", "TSND0!Nsv", "YvZ?bb]", "\"bXv5Nn:", "TZ5gv&nN?", "jnN?viv", "[Z+S?0xN05", "[0s0gN?b", "T!0l05vd", "Eb!v?NXvs!", "`b5s!bs", "En!!bs", ";00sS00s", "y0ls0d?", "'bgZqv", "'bgNv5", "`+N5v!vD", "^!Nvg0x", "T!0qvs", "TSN5lS0n", "'v5sn!5", "oNlSn", "T?b]]v", "6XX?Zqn]]", "[0Xb+N", "[0XbsNl", "yvsn", "Gvsn", "\"v!bb+", "E?vv]]Z", "^:+Sv!0x", "Yb??0xx0:", "\"v!N??", "^Un:v!N??", "`ng0d00g0", "o0?Ns0bg", ";0++N+", "`DN+?00:", "1n:+?n]]", "^N+0:", "`n5Db!5", "`n5]?0!v", "Bv5:v", "L00+b!", "jnvXxN!b", "Jx+b05", "V:q!b05", "\"n!D!0d", "`?0dDN5X", "\"Nxg!bvinx", "V50d5", "L0qqn]]bs", "@N!v]v!NX", "oN5bl0", "E0!!bs!bxx", "On5x+v!lb", "@?NXv!", "`sbb?N_", "`5nqqn??", "@!v5qn??", "jdN?]NxS", "`lNU0!", "`SnlD?b", ";b!vl!0xx", "`5bvxb?", "[bggNn!xv", "V!xv!N5X", "`?nX:v", "\"vXlv!X0", "`dN5nq", "oN?0xdN5b", "T0!x0?v", "eb:0!vNg", "tlsN??b!Z", "Ob?NqN!g", "\"v5sN5b", "`Dv!:0!Z", ";0n5g0n!", ";0n5g00:", ",N5Xg!v", "oSv5+Z", "O05+Sv5", "o0!ZX05M", "`sv5s?b!", "`:bv!X?b", "[Z!0Xnb", ";Ns:05s0+", "`:00lSn:", "J?bDNg", "\"vXqZ", "\"N?sv5D", "Y?NxxbZ", "evND0n", "J5sbN", "`nNln5b", "'v!iNsv!", "on+Nsv!", "[Z!v5Nsv!", "'nXNv", ";0f0S", "Tb?bqN", "VD50d5", "JXX", "V5D50d5", "V5D50d5"};
	private static String[] attacks = {"y0K\"0ib", "o0n5g", ",v!vsbKTS0+", "O0nq?b`?v+", "T0:bsKon5lS", "\"bXvKon5lS", "ovZKOvZ", "EN!bKon5lS", "6lbKon5lS", "[Sn5gb!on5lS", "`l!vslS", "QNlb@!N+", "@nN??0sN5b", "evU0!KLN5g", "`d0!gxKOv5lb", "Tns", "@nxs", "LN5XK^ssvlD", "LSN!?dN5g", "E?Z", "YN5g", "`?v:", "QN5bKLSN+", "`s0:+", "O0nq?bK,NlD", "\"bXvK,NlD", "1n:+K,NlD", "e0??N5XK,NlD", "`v5gf^ssvlD", ";bvgqnss", ";0!5K^ssvlD", "En!ZK^ssvlD", ";0!5KO!N??", "[vlD?b", "Y0gZK`?v:", "L!v+", "[vDbKO0d5", "[S!vxS", "O0nq?bfJgXb", "[vN?KLSN+", "o0Nx05K`sN5X", "[dN5bbg?b", "oN5K\"NxxN?b", "'bb!", "YNsb", "@!0d?", "e0v!", "`N5X", "`n+b!x05Nl", "`05NlY00:", "ONxvq?b", "^lNg", "J:qb!", "E?v:bsS!0db!", "\"Nxs", "Lvsb!K@n5", ";Zg!0Kon:+", "`n!]", "6lbKYbv:", "Y?NUUv!g", "oxZqbv:", "Ynqq?bYbv:", "^n!0!vKYbv:", ";Z+b!KYbv:", "oblD", "O!N??KoblD", "`nq:NxxN05", "'0dK,NlD", "T0n5sb!", "`bNx:NlK[0xx", "`s!b5XsS", "^qx0!q", "\"bXvKO!vN5", "'bblSK`bbg", "@!0dsS", "evU0!K'bv]", "`0?v!Ybv:", "o0Nx05o0dgb!", "`sn5K`+0!b", "`?bb+Ko0dgb!", "obsv?KOv5lb", "`s!N5XK`S0s", "O!vX05KevXb", "EN!bK`+N5", "[Sn5gb!`S0lD", "[Sn5gb!q0?s", "[Sn5gb!KLvib", "[Sn5gb!", "e0lDK[S!0d", "Jv!sS&nvDb", "ENxxn!b", "ONX", "[0_Nl", "T05]nxN05", "oxZlSNl", ";Z+50xNx", "\"bgNsvsb", "^XN?NsZ", "jnNlDK^ssvlD", "evXb", "[b?b+0!s", "yNXSsK`Svgb", "\"N:Nl", "`l!bblS", "O0nq?bK[bv:", "ebl0ib!", ";v!gb5", "\"N5N:NUb", "`:0Db`l!bb5", "T05]nxbKevZ", "LNsSg!vd", "Ob]b5xbKTn!?", "Yv!!Nb!", "'NXSsK`l!bb5", ";vUb", "eb]?bls", "E0lnxKJ5b!XZ", "YNgb", "\"bs!050:b", "\"N!!0!K\"0ib", "`b?]gbxs!nls", "JXXKY0:q", "'NlD", "`:0X", "`?ngXb", "Y05bKT?nq", "EN!bKY?vxs", "Lvsb!]v??", "T?v:+", "`dN]s", "`Dn??KYvxS", "`+NDbKTv5505", "T05xs!Nls", "^:5bxNv", ",N5bxNx", "`0]sq0N?bg", ";NK1n:+K,NlD", "@?v!b", "O!bv:KJvsb!", "o0Nx05K@vx", "Yv!!vXb", "'bblSK'N]b", "'0ib?ZK,Nxx", "`DZK^ssvlD", "[!v5x]0!:", "Ynqq?b", "ONUUZKon5lS", "`+0!b", "E?vxS", "oxZdvib", "`+?vxS", "^lNgK^!:0!", "T!vqSv::b!", "J_+?0xN05", "En!ZK`dN+bx", "Y05b:b!v5X", "ebxs", "e0lDK`?Ngb", ";Z+b!KEv5X", "`Sv!+b5", "T05ib!xN05", "[!NK^ssvlD", "`n+b!KEv5X", "`?vxS", "`nqxsNsnsb", "`s!nXX?b", "`DbslS", "[!N+?bK,NlD", "[SNb]", "`+Ngb!KLbq", "\"N5gKebvgb!", "yNXSs:v!b", "E?v:bKLSbb?", "`50!b", "Tn!xb", "E?vN?", "T05ib!xN05KM", "^b!0q?vxs", "T0ss05K`+0!b", "ebib!xv?", "`+Nsb", "o0dgb!K`50d", "o!0sbls", "\"vlSKon5lS", "`lv!ZKEvlb", "EvN5sK^ssvlD", "`dbbsK,Nxx", "Yb??ZKO!n:", "`?ngXbKY0:q", "\"ngf`?v+", "tlsvU00Dv", "`+NDbx", "=v+KTv5505", "E0!bxNXSs", "ObxsN5ZKY05g", "ob!NxSK`05X", "6lZKLN5g", "Obsbls", "Y05bKenxS", "'0lDft5", "tns!vXb", "`v5gxs0!:", "@NXvKO!vN5", "J5gn!b", "TSv!:", "e0??0ns", "Ev?xbK`dN+b", "`dvXXb!", "\"N?DKO!N5D", "`+v!D", "En!ZKTnssb!", "`sbb?KLN5X", "\"bv5K'00D", "^ss!vls", "`?bb+K[v?D", ";bv?KYb??", "ebsn!5", "o!bxb5s", "E!nxs!vsN05", "`v]bXnv!g", "ovN5K`+?Ns", "`vl!bgKEN!b", "\"vX5Nsngb", "OZ5v:Nlon5lS", "\"bXvS0!5", "O!vX05Y!bvsS", "Yvs05Kovxx", "J5l0!b", "on!xnNs", "ev+NgK`+N5", "`dbbsK`lb5s", "6!05K[vN?", "\"bsv?KT?vd", "QNsv?K[S!0d", "\"0!5N5XK`n5", "`Z5sSbxNx", "\"005?NXSs", ";Nggb5Ko0db!", "T!0xxKTS0+", "[dNxsb!", "evN5KOv5lb", "`n55ZKOvZ", "T!n5lS", "\"N!!0!KT0vs", "oxZlSKV+", "J_s!b:b`+bbg", "^5lNb5so0db!", "`Svg0dKYv??", "Ensn!bK`NXSs", "e0lDK`:vxS", "LSN!?+00?", "YbvsKV+", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5"};
	private static String[] locations = {"y0KOvsv", "ybdKYv!DK[0d5", "e0nsbKM*", "TSb!!ZX!0ibKTNsZ", "e0nsbKHW", "e0nsbKHR", "QN0?bsKTNsZ", "`+!0nsK[0db!", "e0nsbKHM", "enN5xK0]K^?+S", "V5N05KTvib", "e0nsbKHH", "^Uv?bvK[0d5", "`?0d+0DbKLb??", "6?b_KE0!bxs", "e0nsbKHC", "@0?gb5!0gKTNsZ", "evgN0K[0db!", "e0nsbKH>", "yvsN05v?Kov!D", "e0nsbKH9", "e0nsbKH4", "Jl!nsbvDKTNsZ", "[N5K[0db!", "Yn!5bgK[0db!", "e0nsbKH/", "e0nsbKH*", "t?NiN5bKTNsZ", "'NXSsS0nxb", "Yvss?bK[0db!", "e0nsbKCW", "LSN!?K6x?v5gx", "e0nsbKCR", "TNv5d00gKTNsZ", "e0nsbKCM", "\"saK\"0!sv!", "\"vS0Xv5ZK[0d5", "e0nsbKCH", "'vDbK0]KevXb", "e0nsbKCC", "6lbKovsS", "Y?vlDsS0!5KTNsZ", "O!vX05(xKOb5", "e0nsbKC>", "Ov!DKTvib", "e0nsbKC9", "`N?ib!KTvib", "ov??bsK[0d5", "e0nsbKR", "QN!NgNv5KTNsZ", "e0nsbKM", "obdsb!KTNsZ", "e0nsbKH", "\"saK\"005", "e0nsbKC", "Tb!n?bv5KTNsZ", "e0nsbKMC", "e0nsbKM>", "e0nsbK>", "V5gb!X!0n5g", "e0nsbK9", "Qb!:N?N05KTNsZ", "ONX?bss(xKTvib", "e0nsbK4", "e0nsbK/", "e0nsbK*", "e0lDK[n55b?", "e0nsbKRW", "o0db!Ko?v5s", "'vib5gb!K[0d5", "'viaKevgN0K[0db!", "Tb?vg05KTNsZ", "`v]]!05KTNsZ", "e0nsbKRR", "e0nsbKRM", "e0nsbKRH", "e0nsbKRC", "e0nsbKR>", "e0nsbKR9", "e0nsbKR4", "e0nsbKR/", "EnlSxNvKTNsZ", "e0nsbKR*", "e0nsbKMW", "`bv]0v:K6x?v5gx", "TN55vqv!K6x?v5g", "e0nsbKMR", "e0nsbKMM", "QNls0!ZKe0vg", "e0nsbKMH", "65gNX0Ko?vsbvn", "e0nsbKM9", "e0nsbKM4", "[0SI0KEv??x", "e0nsbKM/", "EvxsK`SN+", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "V5D50d5", "J:+sZ", "Tv5(sKsb??", "`+blNv?"};
	//	static String[] locationmapping = {"0","126","177","127","178","179","139","204","180","209","143","181","129","211","214","182","131","208","183","207","184","185","133","205","206","186","187","132","212","205","188","218","189","130","190","216","134","191","135","192","217","136","222","193","220","194","137","138","149","224","150","140","151","198","152","141","172","173","153","210","154","221","197","155","156","157","200","158","201","142","0","144","148","159","160","161","162","163","164","165","166","145","167","168","203","146","169","170","128","171","147","174","175","223","176","226"};	

	private static double[] genders = {-1,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0,0,0,1,1,1,0.25,0.25,0.25,0.25,0.25,0.25,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.75,0.75,0.5,0.5,0.5,0.75,0.75,0.75,0.75,0.75,0.75,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,-1,-1,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,-1,-1,0.5,0.5,0.5,0.5,1,1,0.5,0.5,0.5,0.5,0.5,0,0.5,0,0.5,0.5,0.5,0.5,-1,-1,0.5,0.5,0,0.75,0.75,0.5,1,0.5,0.5,0.5,-1,0.875,0.875,0.875,0.875,-1,0.875,0.875,0.875,0.875,0.875,0.875,-1,-1,-1,0.5,0.5,0.5,-1,-1,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.875,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.25,0.25,0.875,0.875,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.875,0.875,0.5,0.5,0.5,-1,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.25,0.25,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.25,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,-1,0.5,0.5,1,1,0,0.75,0.75,0,0,-1,-1,-1,0.5,0.5,0.5,-1,-1,-1};
	
	public static void main(String[] args) throws Exception
	{
		initVars();


//		printBytes(readOT(26));

		printAllPokemonDetails();

//						printHexTable();
		//				printParty();
		//				printDetailedParty();
		//		for (int x=0; x<14; x++)
		//				printBox(x);
		//		

//		System.out.println(parsePkm(readPokemonFromFile(26)));
		//System.out.println();

		//		readPkmFile(0);



	}

	//	/**
	//	 * This method is useful when writing into a party slot (the extra 16 bytes need to be generated.) 
	//	 * @param b	the full 32 bit string for PKMN data
	//	 * @return
	//	 */
	//	static byte[] spoofBytes(byte[] b)
	//	{
	//		byte[] newbytes = new byte[48];
	//		
	//		// copy over old array
	//		for (int x=0; x<32; x++)
	//			newbytes[x] = b[x];
	//		
	//	}

	private static void printAllPokemonDetails() 
	{
		// Print party
		for (int x=0; x<getPartySize(); x++)
			System.out.println(parsePkm(readPokemonFromFile(x)));

		//Print all 14 boxes
		for (int x=0; x<14; x++)
		{
			for (int y=0; y<getBoxSize(x); y++)
				System.out.println(parsePkm(readPokemonFromFile(x*20+y+6)));
		}
	}
	
	private static String parseGender(byte[] b)
	{
		// get the gender ratio
		double gender =  genders[getUnsigned(b[22])];
		
		// male and female only species
		if (gender==1)
			return "Male";
		else if (gender==0)
			return "Female";
		else if (gender==-1)
			return "Genderless";
		
		// flip the gender ratio
		gender = 1-gender;
		
		double ivratio = (getUnsigned(((b[43] >> 4) & 0xf))+1)/(16.0);
		
//		System.out.println(""+ivratio+" "+gender);
		
		if ( ivratio >= gender)
			return "Male";
		else
			return "Female";
	}

	private static void printDetailedParty() 
	{
		for (int x=0; x<getPartySize(); x++)
			System.out.println(parsePkm(readPokemonFromFile(x)));	
	}

	private static int getBoxNumber(int pos)
	{
		return ((pos-6)%20);
	}

	private static int getBoxSize(int box)
	{
		box++;
		return getUnsigned(data[16384+1104*(box-1)]);
	}

	/**
	 * Parses a PKM file as a string
	 */
	
	static String getUnknownType(byte[] b)
	{
		return "??"; /*TODO: this*/
	}

	public static String parsePkm(byte[] b)
	{
		String output = "";

		output += "\nNickname: "+ parseNickname(b);
		output += "\nSpecies: "+parseSpecies(b);
		output += "\nLevel: " + parseLevel(b);
		output += "\nGender: "+parseGender(b);
		output += "\nHold Item: "+parseItem(b);
		output += "\nMoveset: "+parseMoves(b);
		output += "\nExperience: "+parseExp(b);
		output += "\nEVs: "+parseEvs(b);
		output += "\nIVs: "+parseIV(b);
		//		output += "\nPP: "+parsePP(b);
		output += "\nHappiness: "+parseHappy(b);
		output += "\nPokeRus: "+parsePokeRus(b);
		//		output += "\n    CAUGHT DATA";
		output += "\nMet at Level: "+parseLevelMet(b);
		output += "\nTime of Day: "+parseTime(b);
		output += "\nLocation: "+ parseLocation(b);
		//		output += "\n    TRAINER DATA";
		output += "\nTrainer Name: "+parseOT(b);
		output += "\nTrainer ID: "+parseID(b);
		output += "\nTrainer Gender: " + parseOTGender(b);

		return output;
	}

	private static String parseLevel(byte[] b) 
	{
		return ""+getUnsigned(b[53]);
	}

	private static String parseOT(byte[] b) 
	{
		String output="";

		for (int x=11; x<19; x++)
		{
			output += ((char)(convertPokeText(getUnsigned(b[x]))));
		}
		return output;
	}

	private static String parseIV(byte[] b)
	{

		String output = "";
		
		int attack = getUnsigned((b[43] >> 4) & 0xf);
		int defense =  getUnsigned((b[43] >> 0) & 0xf);
		int speed = getUnsigned((b[44] >> 4) & 0xf);
		int special =  getUnsigned((b[44] >> 0) & 0xf);
				
//		return ""+(getUnsigned(b[43])*256 + getUnsigned(b[44]));
		return ""+attack+" ATK / "+defense+" DEF / "+speed+" SPEED / "+special+" SPECIAL";
	}

	private static String parseLevelMet(byte[] b) 
	{
		int a = (getUnsigned(b[51])-(b[51] & 0x80)-(b[51] & 0x40));

		if (a==1)
			return "Egg";
		else
			return ""+a;
	}

	private static String parseTime(byte[] b) 
	{
		String time = (((b[51] & 0x80)!=0)?1:0)+""+(((b[51] & 0x40)!=0)?1:0);
		String daylight;

		if (time.equals("01"))
			daylight = "Morning";
		else if (time.equals("10"))
			daylight = "Mid-Day";
		else if (time.equals("11"))
			daylight = "Night";
		else
			daylight = "No Data";

		return daylight;
	}

	private static String parseLocation(byte[] b) 
	{
		return locations[(getUnsigned(b[52])-(b[52] & 0x80))];
	}

	private static String parseOTGender(byte[] b) 
	{
		return ((b[52] & 0x80)!=0)? "Female" : "Male";
	}

	private static String parsePokeRus(byte[] b) 
	{
		return ""+(getUnsigned(b[50])==1);
	}

	private static String parseHappy(byte[] b) 
	{
		return ""+getUnsigned(b[49]);
	}

	static String parsePP(byte[] b) 
	{
		String moveset = "";

		for (int x=0; x<4; x++)
			moveset += getUnsigned(b[45+x]) + " / ";

		return moveset.substring(0, moveset.length()-3);
	}

	private static String parseEvs(byte[] b) 
	{
		String[] evtypes = {"HP","ATK","DEF","SPEED","SPECIAL"};
		String sendstring="";

		for (int x=0; x<5; x++)
			sendstring+=  getUnsigned(b[33+x*2])*256 + getUnsigned(b[33+x*2+1])+ " " + evtypes[x] + " / ";

		return sendstring.substring(0, sendstring.length()-3);
	}

	private static String parseExp(byte[] b) 
	{
		return ""+(getUnsigned(b[30])*65536 + getUnsigned(b[31])*256 + getUnsigned(b[32]));
	}

	private static String parseID(byte[] b) 
	{
		return ""+(getUnsigned(b[28])*256+getUnsigned(b[29]));
	}

	private static String parseMoves(byte[] b) 
	{
		String moveset = "";

		for (int x=0; x<4; x++)
			moveset += attacks[getUnsigned(b[24+x])] + " / ";

		return moveset.substring(0, moveset.length()-3);
	}

	private static String parseItem(byte[] b) 
	{
		return items[getUnsigned(b[23])];
	}

	private static String parseSpecies(byte[] b) 
	{
		int species = getUnsigned(b[22]);
		
		if (species != 201)
			return pokemon[species];
		else
		{
			// Calculate unown type
			// get the middle bits of the four main IV nibbles and put them together from
			// left to right, then divide by 10 and floor it, a number between 0 and 25 will appear
			// add + 'A' to this, to get the ascii. 
			/** TODO: add unown stuff **/
			return pokemon[species];
		}
	}

	public static String parseNickname(byte[] b)
	{
		String output = "";

		// Get the nickname
		for (int x=0; x<11; x++)
		{
			output += ((char)(convertPokeText(getUnsigned(b[x]))));
		}

		return output;
	}

	/**
	 * Returns the combined arrays from the name, original trainer, and pokemon data structure
	 * @param index	The number of the pokemon to be exported 0-285
	 * @return The combined byte array representing a full pokemon, name, and OT
	 */
	public static byte[] readPokemonFromFile(int index)
	{
		byte[] datap;

		//		if (index>=6)
		datap = new byte[54];
		//		else
		//			datap = new byte[70];

		// The file structure is 54 bytes // or 70 bytes
		// 11 for the Nickname of the Pokemon
		// 8 for the Original Trainer name
		// 3 bytes for file information
		// 32 for the Pokemon PKM data

		byte[] namedata = readNickName(index);
		byte[] otnamedata = readOT(index);
		byte[] pkmdata = readPkmnData(index);

		// Nickname bytes
		for (int x=0; x<11; x++)
			datap[x] = namedata[x];

		// OT bytes
		for (int x=11; x<19; x++)
			datap[x] = otnamedata[x-11];

		// PKM data bytes
		for (int x=22; x<54; x++)
			datap[x] = pkmdata[x-22];

		return datap;

	}

	/**
	 * Returns the name of the original trainer
	 * @param pos Position of the pokemon
	 * @return Bytes representing the name
	 */
	public static byte[] readOT(int pos)
	{
		byte[] otname = new byte[8];

		int begin = 6765+288;

		if (pos<6) begin+=48*pos; 
		else 
		{
			begin = (int) (16384+1104*Math.floor(((pos-6)/20))+22);
			begin+=640+11*((pos-6)%20);
		}

		for (int x=0; x<8; x++)
		{
			if (pos<6)
				otname[x]=data[begin+x-37*pos];
			else
				otname[x]=data[begin+x];
		}

		return otname;
	}

	/**
	 * Reads the 32 or 48 (party) pokemon bytes from the data structure in the .sav file
	 * @param pos number representing the pokemon to get
	 * @return The bytes representing the pokemon
	 */
	public static byte[] readPkmnData(int pos)
	{
		byte[] pkmdata = new byte[32];
		// Byte represents the nickname, so it will always be 11 bytes.

		// pos 1-6 is party, from then on is box
		int begin = 6765; 

		if (pos>=6)
		{
			begin = (int) (16384+1104*Math.floor(((pos-6)/20))+22);
			begin+=32*getBoxNumber(pos);
		}
		else
			begin+=48*pos;

		// Get the data
		for (int x=0; x<32; x++)
		{
			if (pos<6)
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+354-37*pos])))));
				pkmdata[x]=data[begin+x];//-37*pos];
			}
			else
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+860-21*((pos-6)%20)])))));
				pkmdata[x]=data[begin+x-21*(pos-6)%20+(pos-6)%20];
			}

		}

		//		for (int x=0; x<32; x++)
		//			pkmdata[x] = 

		return pkmdata;
	}

	/**
	 * Fixes the checksum for modified data, needs to be called whenever stuff is written
	 */
	public static void fixChecksum()
	{

	}

	/**
	 * This method prints names of Pokemon from the party and all 14 boxes
	 */
	public static void printPokeNames()
	{
		printParty();
		for (int x=0; x<14; x++)
			printBox(x);
	}


	/**
	 * This method reads a nickname of a given Pokemon.
	 * 0-5 (party)
	 * 6-25 (box 1)
	 * 26-45 (box 2) and so on
	 * @param pos The number (position) of the Pokemon, as defined above (0-285)
	 * @return the byte array representing the 11 bytes of the name
	 */
	public static byte[] readNickName(int pos)
	{
		// Byte represents the nickname, so it will always be 11 bytes.
		byte[] name = new byte[11];

		// pos 1-6 is party, from then on is box
		int begin = 6765; 

		if (pos>=6)
		{
			begin = (int) (16384+1104*Math.floor(((pos-6)/20))+22);
			begin+=32*getBoxNumber(pos);
		}
		else
			begin+=48*pos;

		// Get the nickname
		for (int x=0; x<11; x++)
		{
			if (pos<6)
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+354-37*pos])))));
				name[x]=data[begin+x+354-37*pos];
			}
			else
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+860-21*((pos-6)%20)])))));
				name[x]=data[begin+x+860-21*getBoxNumber(pos)];
			}

		}

		// Return the string of bytes representing the name
		return name;
	}

	public static void printBytes(byte[] b)
	{
		for (byte x : b)
		{
			// Convert byte to hex
			String s =String.format("%01X",x);

			s = s.toUpperCase();

			if (s.length()<2)
				s = "0"+""+s;

			System.out.print(s+" ");
		}
	}

	public static int getPartySize()
	{
		return data[6757];
	}
	/**
	 * This method prints the entire party's names
	 */
	public static void printParty() //prints party's names
	{
		int party = getPartySize();
		System.out.println("Number of Pokemon in party: "+party);

		int begin = 6765; int inbox=0;
		for (int y=0; y<party; y++)
		{
			// Get the nickname
			for (int x=0; x<11; x++)
				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+354+inbox-37*y])))));
			begin+=48; // advance to the next pokemon
			if (y!=party-1)
				System.out.print(", ");
		}

		System.out.println();
	}

	/**
	 * This method prints a specific box (0-13)
	 * @param box The number of the box (0-13) to be printed
	 */
	public static void printBox(int box) //prints a box's content's name 0 - 13
	{
		System.out.println("Number of Pokemon in box "+(box+1)+": "+data[16384+1104*box]);
		int boxcap = data[16384+1104*box];

		int begin = 16384+1104*box+22;

		for (int y=0; y<boxcap; y++)
		{
			for (int x=0; x<11; x++)
				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+860-21*y])))));
			begin+=32;
		}

		System.out.println();

	}

	public static void initVars() throws Exception
	{
		// Load file TODO: make a file loader
		//	File pokesav = new File("/Users/Ricky/Library/Application Support/Bannister/KiGB/Battery RAM/Pokemon Crystal.sav");
		File pokesav = new File("Crystal.sav.sav");

		// Create byte array for data to go in
		data = new byte[(int) pokesav.length()];

		// Open file for reading
		fis = new FileInputStream(pokesav);

		// Put bytes from file into byte array
		fis.read(data, 0, data.length);

		// Decrypt the String arrays
		decryptAllStrings();
	}

	/**
	 * This method parses the bytes and converts them to ASCII, so names can be read and so on.
	 * @param c The character that is to be converted into ASCII from PokeText
	 * @return The converted character, ready to be printed as human-readable.
	 */
	public static int convertPokeText(int c)
	{
		if (c>245 && c<=256)  
			return c-198;
		else if (c>=97 && c<191) //Pokemon alphabet
			return c+65-128;
		else if (c==80)  // Null terminator
			return '\0';
		else if (c>=32) // Symbols that ruin formatting
			return c;
		else
			return '.';

	}

	/**
	 * Makes -127 -> 255, and keeps 127 -> 127
	 * @param b the byte to be converted
	 * @return the converted byte
	 */
	public static int getUnsigned(int b)
	{
		if (b>=0 && b<128)
			return b;
		else
			return b+256;
	}

	/**
	 * This method is used to undo the previous one, useful when writing data back to disk
	 * @param b The byte that was converted
	 * @return The unconverted byte
	 */
	public static int deSign(int b)
	{
		if (b>=0 && b<128)
			return b;
		else
			return b-256;
	}

	/**
	 * This method prints all of the hex of the save file
	 */
	public static void printHexTable()
	{
		String row="";

		for (int x=0; x<data.length; x++)
		{
			// Convert bytes to hex, TODO: Make a method of this
			//			String s = Integer.toHexString(data[x]*256*256*256+data[x+1]*256*256+data[x+2]*256+data[x+3]);

			if ((x) % 16 == 0)
				System.out.print(String.format("%08d",x)+":  ");

			// Convert byte to hex
			String s =String.format("%01X",data[x]);

			s = s.toUpperCase();

			char newchar = (char)(convertPokeText(getUnsigned(data[x])));

			if (newchar<32) newchar = 46;
			row+=""+newchar;

			if (s.length()<2)
				s = "0"+""+s;

			System.out.print(s+" ");

			if ((x+1) % 16 == 0)
			{
				System.out.print(" ");
				System.out.print(row);
				row="";
				System.out.println();
			}

			else if ((x+1) % 4 == 0)
				System.out.print("| ");
		}
	}

	private static void decryptAllStrings()
	{
		items = decryptStrings(items);
		pokemon = decryptStrings(pokemon);
		attacks = decryptStrings(attacks);
		locations = decryptStrings(locations);
	}

	private static String[] decryptStrings(String[] strings)
	{
		for (int x=0; x<strings.length; x++)
		{
			String t="";
			for (int y=0; y<strings[x].length(); y++)
			{
				int a = strings[x].charAt(y);

				//				System.out.print("converting "+a+" ("+(char)a+")");
				a = (((55*((a-32)-43))%92)+92)%92+32;
				//				System.out.println(" to "+a+" ("+(char)a+")");

				t+= (char)(a);

			}

			strings[x] = t;
			//			System.out.println(t);
		}

		return strings;
	}

	/**
	 * This function generates java code for the four arrays that store copyrighted information,
	 * and should generate their encrypted versions.
	 * @param string
	 */
	private static void encryptStrings(int string)
	{
		String[] strings; 
		String name;

		switch (string)
		{
		case 0: strings = items;name="items";break;
		case 1: strings = pokemon;name="pokemon";break;
		case 2: strings = attacks;name="attacks";break;
		default: strings = locations;name="locations";break;
		}

		System.out.print("private static String[] "+name+" = {");

		for (int y=0; y<strings.length; y++)
		{
			String s = strings[y];
			String t = "";
			for (int x=0; x<s.length(); x++)
			{
				int a = s.charAt(x);

				a-=' ';

				a = ((a*87+43)%92)+' ';

				if (a=='\\')
					t += "\\\\";
				else
					if (a== '"')
						t += "\\\"";
					else
						t+= (char)a;
			}
			//			System.out.print("\""+s+"\", ");
			System.out.print("\""+t+"\"");

			if (strings.length-1 != y)
				System.out.print(", ");
		}

		System.out.println("};");
	}

	static void encryptAllStrings()
	{
		for (int x=0; x<4; x++)
			encryptStrings(x);
	}
}
