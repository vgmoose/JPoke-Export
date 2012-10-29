import java.io.File;
import java.io.FileInputStream;


public class PokeExport 
{
	static File pokesav; 
	static byte[] data;
	static FileInputStream fis;

	//	static String[] items = {"None","Master Ball","Ultra Ball","BrightPowder","Great Ball","PokŽ Ball","Bicycle","Teru-sama","Moon Stone","Antidote","Burn Heal","Ice Heal","Awakening","Parlyz Heal","Full Restore","Max Potion","Hyper Potion","Super Potion","Potion","Escape Rope","Repel","Max Elixer","Fire Stone","Thunderstone","Water Stone","Teru-sama","HP Up","Protein","Iron","Carbos","Lucky Punch","Calcium","Rare Candy","X Accuracy","Leaf Stone","Metal Powder","Nugget","PokŽ Doll","Full Heal","Revive","Max Revive","Guard Spec.","Super Repel","Max Repel","Dire Hit","Teru-sama","Fresh Water","Soda Pop","Lemonade","X Attack","Teru-sama","X Defend","X Speed","X Special","Coin Case","Itemfinder","Teru-sama","Exp Share","Old Rod","Good Rod","Silver Leaf","Super Rod","PP Up","Ether","Max Ether","Elixer","Red Scale","SecretPotion","S.S. Ticket","Mystery Egg","Clear Bell","Silver Wing","Moomoo Milk","Quick Claw","PSNCureBerry","Gold Leaf","Soft Sand","Sharp Beak","PRZCureBerry","Burnt Berry","Ice Berry","Poison Barb","King's Rock","Bitter Berry","Mint Berry","Red Apricorn","TinyMushroom","Big Mushroom","SilverPowder","Blu Apricorn","Teru-sama","Amulet Coin","Ylw Apricorn","Grn Apricorn","Cleanse Tag","Mystic Water","TwistedSpoon","Wht Apricorn","Black Belt","Blk Apricorn","Teru-sama","Pnk Apricorn","BlackGlasses","SlowpokeTail","Pink Bow","Stick","Smoke Ball","NeverMeltIce","Magnet","MiracleBerry","Pearl","Big Pearl","Everstone","Spell Tag","RageCandyBar","GS Ball","Blue Card","Miracle Seed","Thick Club","Focus Band","Teru-sama","EnergyPowder","Energy Root","Heal Powder","Revival Herb","Hard Stone","Lucky Egg","Card Key","Machine Part","Egg Ticket","Lost Item","Stardust","Star Piece","Basement Key","Pass","Teru-sama","Teru-sama","Teru-sama","Charcoal","Berry Juice","Scope Lens","Teru-sama","Teru-sama","Metal Coat","Dragon Fang","Teru-sama","Leftovers","Teru-sama","Teru-sama","Teru-sama","MysteryBerry","Dragon Scale","Berserk Gene","Teru-sama","Teru-sama","Teru-sama","Sacred Ash","Heavy Ball","Flower Mail","Level Ball","Lure Ball","Fast Ball","Teru-sama","Light Ball","Friend Ball","Moon Ball","Love Ball","Normal Box","Gorgeous Box","Sun Stone","Polkadot Bow","Teru-sama","Up-Grade","Berry","Gold Berry","SquirtBottle","Teru-sama","Park Ball","Rainbow Wing","Teru-sama","Brick Piece","Surf Mail","Litebluemail","Portraitmail","Lovely Mail","Eon Mail","Morph Mail","Bluesky Mail","Music Mail","Mirage Mail","Teru-sama","TM01","TM02","TM03","TM04","Fake TM04","TM05","TM06","TM07","TM08","TM09","TM10","TM11","TM12","TM13","TM14","TM15","TM16","TM17","TM18","TM19","TM20","TM21","TM22","TM23","TM24","TM25","TM26","TM27","TM28","Teru-sama","TM29","TM30","TM31","TM32","TM33","TM34","TM35","TM36","TM37","TM38","TM39","TM40","TM41","TM42","TM43","TM44","TM45","TM46","TM47","TM48","TM49","TM50","HM01","HM02","HM03","HM04","HM05","HM06","HM07","HM08","HM09","HM10","HM11","HM12","Cancel"};
	//	static String[] pokemon = {"Missingno.","Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran (f)","Nidorina","Nidoqueen","Nidoran (m)","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras","Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck","Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew","Chikorita","Bayleef","Meganium","Cyndaquil","Quilava","Typhlosion","Totodile","Croconaw","Feraligatr","Sentret","Furret","Hoothoot","Noctowl","Ledyba","Ledian","Spinarak","Ariados","Crobat","Chinchou","Lanturn","Pichu","Cleffa","Igglybuff","Togepi","Togetic","Natu","Xatu","Mareep","Flaaffy","Ampharos","Bellossom","Marill","Azumarill","Sudowoodo","Politoed","Hoppip","Skiploom","Jumpluff","Aipom","Sunkern","Sunflora","Yanma","Wooper","Quagsire","Espeon","Umbreon","Murkrow","Slowking","Misdreavus","Unown","Wobbuffet","Girafarig","Pineco","Forretress","Dunsparce","Gligar","Steelix","Snubbull","Granbull","Qwilfish","Scizor","Shuckle","Heracross","Sneasel","Teddiursa","Ursaring","Slugma","Magcargo","Swinub","Piloswine","Corsola","Remoraid","Octillery","Delibird","Mantine","Skarmory","Houndour","Houndoom","Kingdra","Phanpy","Donphan","Porygon2","Stantler","Smeargle","Tyrogue","Hitmontop","Smoochum","Elekid","Magby","Miltank","Blissey","Raikou","Entei","Suicune","Larvitar","Pupitar","Tyranitar","Lugia","Ho-oh","Celebi","Uknown","Egg","Unknown","Unknown"};
	//	static String[] attacks = {"No Move","Pound","Karate Chop","DoubleSlap","Comet Punch","Mega Punch","Pay Day","Fire Punch","Ice Punch","ThunderPunch","Scratch","ViceGrip","Guillotine","Razor Wind","Swords Dance","Cut","Gust","Wing Attack","Whirlwind","Fly","Bind","Slam","Vine Whip","Stomp","Double Kick","Mega Kick","Jump Kick","Rolling Kick","Sand-Attack","Headbutt","Horn Attack","Fury Attack","Horn Drill","Tackle","Body Slam","Wrap","Take Down","Thrash","Double-Edge","Tail Whip","Poison Sting","Twineedle","Pin Missile","Leer","Bite","Growl","Roar","Sing","Supersonic","SonicBoom","Disable","Acid","Ember","Flamethrower","Mist","Water Gun","Hydro Pump","Surf","Ice Beam","Blizzard","Psybeam","BubbleBeam","Aurora Beam","Hyper Beam","Peck","Drill Peck","Submission","Low Kick","Counter","Seismic Toss","Strength","Absorb","Mega Drain","Leech Seed","Growth","Razor Leaf","SolarBeam","PoisonPowder","Stun Spore","Sleep Powder","Petal Dance","String Shot","Dragon Rage","Fire Spin","ThunderShock","Thunderbolt","Thunder Wave","Thunder","Rock Throw","Earthquake","Fissure","Dig","Toxic","Confusion","Psychic","Hypnosis","Meditate","Agility","Quick Attack","Rage","Teleport","Night Shade","Mimic","Screech","Double Team","Recover","Harden","Minimize","SmokeScreen","Confuse Ray","Withdraw","Defense Curl","Barrier","Light Screen","Haze","Reflect","Focus Energy","Bide","Metronome","Mirror Move","Selfdestruct","Egg Bomb","Lick","Smog","Sludge","Bone Club","Fire Blast","Waterfall","Clamp","Swift","Skull Bash","Spike Cannon","Constrict","Amnesia","Kinesis","Softboiled","Hi Jump Kick","Glare","Dream Eater","Poison Gas","Barrage","Leech Life","Lovely Kiss","Sky Attack","Transform","Bubble","Dizzy Punch","Spore","Flash","Psywave","Splash","Acid Armor","Crabhammer","Explosion","Fury Swipes","Bonemerang","Rest","Rock Slide","Hyper Fang","Sharpen","Conversion","Tri Attack","Super Fang","Slash","Substitute","Struggle","Sketch","Triple Kick","Thief","Spider Web","Mind Reader","Nightmare","Flame Wheel","Snore","Curse","Flail","Conversion 2","Aeroblast","Cotton Spore","Reversal","Spite","Powder Snow","Protect","Mach Punch","Scary Face","Faint Attack","Sweet Kiss","Belly Drum","Sludge Bomb","Mud-Slap","Octazooka","Spikes","Zap Cannon","Foresight","Destiny Bond","Perish Song","Icy Wind","Detect","Bone Rush","Lock-On","Outrage","Sandstorm","Giga Drain","Endure","Charm","Rollout","False Swipe","Swagger","Milk Drink","Spark","Fury Cutter","Steel Wing","Mean Look","Attract","Sleep Talk","Heal Bell","Return","Present","Frustration","Safeguard","Pain Split","Sacred Fire","Magnitude","DynamicPunch","Megahorn","DragonBreath","Baton Pass","Encore","Pursuit","Rapid Spin","Sweet Scent","Iron Tail","Metal Claw","Vital Throw","Morning Sun","Synthesis","Moonlight","Hidden Power","Cross Chop","Twister","Rain Dance","Sunny Day","Crunch","Mirror Coat","Psych Up","ExtremeSpeed","AncientPower","Shadow Ball","Future Sight","Rock Smash","Whirlpool","Beat Up","Unknown","Unknown","Unknown","Unknown"};
	//	static String[] locations = {"No Data","New Bark Town","Route 29","Cherrygrove City","Route 30","Route 31","Violet City","Sprout Tower","Route 32","Ruins of Alph","Union Cave","Route 33","Azalea Town","Slowpoke Well","Ilex Forest","Route 34","Goldenrod City","Radio Tower","Route 35","National Park","Route 36","Route 37","Ecruteak City","Tin Tower","Burned Tower","Route 38","Route 39","Olivine City","Lighthouse","Battle Tower","Route 40","Whirl Islands","Route 41","Cianwood City","Route 42","Mt. Mortar","Mahogany Town","Route 43","Lake of Rage","Route 44","Ice Path","Blackthorn City","Dragon's Den","Route 45","Dark Cave","Route 46","Silver Cave","Pallet Town","Route 1","Viridian City","Route 2","Pewter City","Route 3","Mt. Moon","Route 4","Cerulean City","Route 24","Route 25","Route 5","Underground","Route 6","Vermilion City","Diglett's Cave","Route 7","Route 8","Route 9","Rock Tunnel","Route 10","Power Plant","Lavender Town","Lav. Radio Tower","Celadon City","Saffron City","Route 11","Route 12","Route 13","Route 14","Route 15","Route 16","Route 17","Route 18","Fuchsia City","Route 19","Route 20","Seafoam Islands","Cinnabar Island","Route 21","Route 22","Victory Road","Route 23","Indigo Plateau","Route 26","Route 27","Tohjo Falls","Route 28","Fast Ship","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Empty","Can't tell","Special"};

	private static String[] items = {"5HMz", ":24/z9cq2WW", "nW/92cq2WW", "q9fpk/+H #z9", "X9z2/cq2WW", "+H\\jcq2WW", "qf(r(Wz", "sz9*\"42R2", ":HHMcx/HMz", "vM/f#H/z", "q*9McSz2W", "N(zcSz2W", "v 2\\zMfMp", "+29WrmcSz2W", "]*WWc!z4/H9z", ":2wc+H/fHM", "SrCz9c+H/fHM", "x*Cz9c+H/fHM", "+H/fHM", "b4(2Czc!HCz", "!zCzW", ":2wcbWfwz9", "]f9zcx/HMz", "sk*M#z94/HMz", "d2/z9cx/HMz", "sz9*\"42R2", "S+cnC", "+9H/zfM", "N9HM", "l29-H4", "?*(\\rc+*M(k", "l2W(f*R", "!29zcl2M#r", "_cv((*92(r", "?z2ucx/HMz", ":z/2Wc+H #z9", "5*ppz/", "+H\\jcgHWW", "]*WWcSz2W", "!z%f%z", ":2wc!z%f%z", "X*29#cxCz(y", "x*Cz9c!zCzW", ":2wc!zCzW", "gf9zcSf/", "sz9*\"42R2", "]9z4kcd2/z9", "xH#2c+HC", "?zRHM2#z", "_cv//2(\\", "sz9*\"42R2", "_cgzuzM#", "_cxCzz#", "_cxCz(f2W", "lHfMcl24z", "N/zRufM#z9", "sz9*\"42R2", "bwCcxk29z", "0W#c!H#", "XHH#c!H#", "xfW%z9c?z2u", "x*Cz9c!H#", "++cnC", "b/kz9", ":2wcb/kz9", "bWfwz9", "!z#cx(2Wz", "xz(9z/+H/fHM", "xyxycsf(\\z/", ":r4/z9rcbpp", "lWz29cqzWW", "xfW%z9cdfMp", ":HHRHHc:fW\\", "&*f(\\clW2 ", "+x5l*9zqz99r", "XHW#c?z2u", "xHu/cx2M#", "xk29Ccqz2\\", "+!Ul*9zqz99r", "q*9M/cqz99r", "N(zcqz99r", "+Hf4HMcq29-", "DfMp@4c!H(\\", "qf//z9cqz99r", ":fM/cqz99r", "!z#cvC9f(H9M", "sfMr:*4k9HHR", "qfpc:*4k9HHR", "xfW%z9+H #z9", "qW*cvC9f(H9M", "sz9*\"42R2", "vR*Wz/clHfM", "ZW cvC9f(H9M", "X9McvC9f(H9M", "lWz2M4zcs2p", ":r4/f(cd2/z9", "s f4/z#xCHHM", "dk/cvC9f(H9M", "qW2(\\cqzW/", "qW\\cvC9f(H9M", "sz9*\"42R2", "+M\\cvC9f(H9M", "qW2(\\XW244z4", "xWH CH\\zs2fW", "+fM\\cqH ", "x/f(\\", "xRH\\zcq2WW", "5z%z9:zW/N(z", ":2pMz/", ":f92(Wzqz99r", "+z29W", "qfpc+z29W", "b%z94/HMz", "xCzWWcs2p", "!2pzl2M#rq29", "Xxcq2WW", "qW*zcl29#", ":f92(Wzcxzz#", "skf(\\clW*-", "]H(*4cq2M#", "sz9*\"42R2", "bMz9pr+H #z9", "bMz9prc!HH/", "Sz2Wc+H #z9", "!z%f%2WcSz9-", "S29#cx/HMz", "?*(\\rcbpp", "l29#cDzr", ":2(kfMzc+29/", "bppcsf(\\z/", "?H4/cN/zR", "x/29#*4/", "x/29c+fz(z", "q24zRzM/cDzr", "+244", "sz9*\"42R2", "sz9*\"42R2", "sz9*\"42R2", "lk29(H2W", "qz99rcI*f(z", "x(HCzc?zM4", "sz9*\"42R2", "sz9*\"42R2", ":z/2WclH2/", "g92pHMc]2Mp", "sz9*\"42R2", "?zu/H%z94", "sz9*\"42R2", "sz9*\"42R2", "sz9*\"42R2", ":r4/z9rqz99r", "g92pHMcx(2Wz", "qz94z9\\cXzMz", "sz9*\"42R2", "sz9*\"42R2", "sz9*\"42R2", "x2(9z#cv4k", "Sz2%rcq2WW", "]WH z9c:2fW", "?z%zWcq2WW", "?*9zcq2WW", "]24/cq2WW", "sz9*\"42R2", "?fpk/cq2WW", "]9fzM#cq2WW", ":HHMcq2WW", "?H%zcq2WW", "5H9R2WcqHw", "XH9pzH*4cqHw", "x*Mcx/HMz", "+HW\\2#H/cqH ", "sz9*\"42R2", "nC\"X92#z", "qz99r", "XHW#cqz99r", "x>*f9/qH//Wz", "sz9*\"42R2", "+29\\cq2WW", "!2fM-H cdfMp", "sz9*\"42R2", "q9f(\\c+fz(z", "x*9uc:2fW", "?f/z-W*zR2fW", "+H9/92f/R2fW", "?H%zWrc:2fW", "bHMc:2fW", ":H9Ckc:2fW", "qW*z4\\rc:2fW", ":*4f(c:2fW", ":f92pzc:2fW", "sz9*\"42R2", "s:oj", "s:oe", "s:o`", "s:o[", "]2\\zcs:o[", "s:oV", "s:oQ", "s:oL", "s:oG", "s:oB", "s:jo", "s:jj", "s:je", "s:j`", "s:j[", "s:jV", "s:jQ", "s:jL", "s:jG", "s:jB", "s:eo", "s:ej", "s:ee", "s:e`", "s:e[", "s:eV", "s:eQ", "s:eL", "s:eG", "sz9*\"42R2", "s:eB", "s:`o", "s:`j", "s:`e", "s:``", "s:`[", "s:`V", "s:`Q", "s:`L", "s:`G", "s:`B", "s:[o", "s:[j", "s:[e", "s:[`", "s:[[", "s:[V", "s:[Q", "s:[L", "s:[G", "s:[B", "s:Vo", "S:oj", "S:oe", "S:o`", "S:o[", "S:oV", "S:oQ", "S:oL", "S:oG", "S:oB", "S:jo", "S:jj", "S:je", "l2M(zW"};
	private static String[] pokemon = {":f44fMpMHy", "q*W-242*9", "N%r42*9", "izM*42*9", "lk29R2M#z9", "lk29RzWzHM", "lk29fm29#", "x>*f9/Wz", "d29/H9/Wz", "qW24/Hf4z", "l2/z9Cfz", ":z/2CH#", "q*//z9u9zz", "dzz#Wz", "D2\\*M2", "qzz#9fWW", "+f#pzr", "+f#pzH//H", "+f#pzH/", "!2//2/2", "!2/f(2/z", "xCz29H ", "]z29H ", "b\\2M4", "v9-H\\", "+f\\2(k*", "!2f(k*", "x2M#4k9z ", "x2M#4W24k", "5f#H92Mc;u6", "5f#H9fM2", "5f#H>*zzM", "5f#H92Mc;R6", "5f#H9fMH", "5f#H\\fMp", "lWzu2f9r", "lWzu2-Wz", "i*WCfw", "5fMz/2Wz4", "IfppWrC*uu", "dfppWr/*uu", "U*-2/", "XHW-2/", "0##f4k", "XWHHR", "ifWzCW*Rz", "+2924", "+2924z(/", "izMHM2/", "izMHRH/k", "gfpWz//", "g*p/9fH", ":zH /k", "+z94f2M", "+4r#*(\\", "XHW#*(\\", ":2M\\zr", "+9fRz2Cz", "X9H Wf/kz", "v9(2MfMz", "+HWf 2p", "+HWf kf9W", "+HWf 92/k", "v-92", "D2#2-92", "vW2\\2m2R", ":2(kHC", ":2(kH\\z", ":2(k2RC", "qzWW4C9H*/", "dzzCfM-zWW", "if(/9zz-zW", "szM/2(HHW", "szM/2(9*zW", "XzH#*#z", "X92%zWz9", "XHWzR", "+HMr/2", "!2Cf#24k", "xWH CH\\z", "xWH -9H", ":2pMzRf/z", ":2pMz/HM", "]29uz/(k@#", "gH#*H", "gH#9fH", "xzzW", "gz pHMp", "X9fRz9", ":*\\", "xkzWW#z9", "lWHr4/z9", "X24/Wr", "S2*M/z9", "XzMp29", "0Mfw", "g9H mzz", "SrCMH", "D92--r", "DfMpWz9", "iHW/H9-", "bWz(/9H#z", "bwzpp(*/z", "bwzpp*/H9", "l*-HMz", ":29H 2\\", "Sf/RHMWzz", "Sf/RHM(k2M", "?f(\\f/*Mp", "DHuufMp", "dzzmfMp", "!krkH9M", "!kr#HM", "lk2M4zr", "s2MpzW2", "D2Mp24\\k2M", "SH94z2", "xz2#92", "XHW#zzM", "xz2\\fMp", "x/29r*", "x/29Rfz", ":9yc:fRz", "x(r/kz9", "IrMw", "bWz(/2-*mm", ":2pR29", "+fM4f9", "s2*9H4", ":2pf\\29C", "Xr292#H4", "?2C924", "gf//H", "bz%zz", "i2CH9zHM", "IHW/zHM", "]W29zHM", "+H9rpHM", "0R2Mr/z", "0R24/29", "D2-*/H", "D2-*/HC4", "vz9H#2(/rW", "xMH9W2w", "v9/f(*MH", "U2C#H4", ":HW/9z4", "g92/fMf", "g92pHM2f9", "g92pHMf/z", ":z / H", ":z ", "lkf\\H9f/2", "q2rWzzu", ":zp2Mf*R", "lrM#2>*fW", "&*fW2%2", "srCkWH4fHM", "sH/H#fWz", "l9H(HM2 ", "]z92Wfp2/9", "xzM/9z/", "]*99z/", "SHH/kHH/", "5H(/H W", "?z#r-2", "?z#f2M", "xCfM292\\", "v9f2#H4", "l9H-2/", "lkfM(kH*", "?2M/*9M", "+f(k*", "lWzuu2", "NppWr-*uu", "sHpzCf", "sHpz/f(", "52/*", "_2/*", ":29zzC", "]W22uur", "vRCk29H4", "qzWWH44HR", ":29fWW", "vm*R29fWW", "x*#H HH#H", "+HWf/Hz#", "SHCCfC", "x\\fCWHHR", "I*RCW*uu", "vfCHR", "x*M\\z9M", "x*MuWH92", "Z2MR2", "dHHCz9", "&*2p4f9z", "b4CzHM", "nR-9zHM", ":*9\\9H ", "xWH \\fMp", ":f4#9z2%*4", "nMH M", "dH--*uuz/", "Xf92u29fp", "+fMz(H", "]H99z/9z44", "g*M4C29(z", "XWfp29", "x/zzWfw", "xM*--*WW", "X92M-*WW", "& fWuf4k", "x(fmH9", "xk*(\\Wz", "Sz92(9H44", "xMz24zW", "sz##f*942", "n9429fMp", "xW*pR2", ":2p(29pH", "x fM*-", "+fWH4 fMz", "lH94HW2", "!zRH92f#", "0(/fWWz9r", "gzWf-f9#", ":2M/fMz", "x\\29RH9r", "SH*M#H*9", "SH*M#HHR", "DfMp#92", "+k2MCr", "gHMCk2M", "+H9rpHMe", "x/2M/Wz9", "xRz29pWz", "sr9Hp*z", "Sf/RHM/HC", "xRHH(k*R", "bWz\\f#", ":2p-r", ":fW/2M\\", "qWf44zr", "!2f\\H*", "bM/zf", "x*f(*Mz", "?29%f/29", "+*Cf/29", "sr92Mf/29", "?*pf2", "SH\"Hk", "lzWz-f", "n\\MH M", "bpp", "nM\\MH M", "nM\\MH M"};
	private static String[] attacks = {"5Hc:H%z", "+H*M#", "D292/zclkHC", "gH*-WzxW2C", "lHRz/c+*M(k", ":zp2c+*M(k", "+2rcg2r", "]f9zc+*M(k", "N(zc+*M(k", "sk*M#z9+*M(k", "x(92/(k", "if(zX9fC", "X*fWWH/fMz", "!2mH9cdfM#", "x H9#4cg2M(z", "l*/", "X*4/", "dfMpcv//2(\\", "dkf9W fM#", "]Wr", "qfM#", "xW2R", "ifMzcdkfC", "x/HRC", "gH*-WzcDf(\\", ":zp2cDf(\\", "I*RCcDf(\\", "!HWWfMpcDf(\\", "x2M#\"v//2(\\", "Sz2#-*//", "SH9Mcv//2(\\", "]*9rcv//2(\\", "SH9Mcg9fWW", "s2(\\Wz", "qH#rcxW2R", "d92C", "s2\\zcgH M", "sk924k", "gH*-Wz\"b#pz", "s2fWcdkfC", "+Hf4HMcx/fMp", "s fMzz#Wz", "+fMc:f44fWz", "?zz9", "qf/z", "X9H W", "!H29", "xfMp", "x*Cz94HMf(", "xHMf(qHHR", "gf42-Wz", "v(f#", "bR-z9", "]W2Rz/k9H z9", ":f4/", "d2/z9cX*M", "Sr#9Hc+*RC", "x*9u", "N(zcqz2R", "qWfmm29#", "+4r-z2R", "q*--Wzqz2R", "v*9H92cqz2R", "SrCz9cqz2R", "+z(\\", "g9fWWc+z(\\", "x*-Rf44fHM", "?H cDf(\\", "lH*M/z9", "xzf4Rf(csH44", "x/9zMp/k", "v-4H9-", ":zp2cg92fM", "?zz(kcxzz#", "X9H /k", "!2mH9c?z2u", "xHW29qz2R", "+Hf4HM+H #z9", "x/*McxCH9z", "xWzzCc+H #z9", "+z/2Wcg2M(z", "x/9fMpcxkH/", "g92pHMc!2pz", "]f9zcxCfM", "sk*M#z9xkH(\\", "sk*M#z9-HW/", "sk*M#z9cd2%z", "sk*M#z9", "!H(\\csk9H ", "b29/k>*2\\z", "]f44*9z", "gfp", "sHwf(", "lHMu*4fHM", "+4r(kf(", "SrCMH4f4", ":z#f/2/z", "vpfWf/r", "&*f(\\cv//2(\\", "!2pz", "szWzCH9/", "5fpk/cxk2#z", ":fRf(", "x(9zz(k", "gH*-Wzcsz2R", "!z(H%z9", "S29#zM", ":fMfRfmz", "xRH\\zx(9zzM", "lHMu*4zc!2r", "df/k#92 ", "gzuzM4zcl*9W", "q299fz9", "?fpk/cx(9zzM", "S2mz", "!zuWz(/", "]H(*4cbMz9pr", "qf#z", ":z/9HMHRz", ":f99H9c:H%z", "xzWu#z4/9*(/", "bppcqHR-", "?f(\\", "xRHp", "xW*#pz", "qHMzclW*-", "]f9zcqW24/", "d2/z9u2WW", "lW2RC", "x fu/", "x\\*WWcq24k", "xCf\\zcl2MMHM", "lHM4/9f(/", "vRMz4f2", "DfMz4f4", "xHu/-HfWz#", "SfcI*RCcDf(\\", "XW29z", "g9z2Rcb2/z9", "+Hf4HMcX24", "q2992pz", "?zz(kc?fuz", "?H%zWrcDf44", "x\\rcv//2(\\", "s92M4uH9R", "q*--Wz", "gfmmrc+*M(k", "xCH9z", "]W24k", "+4r 2%z", "xCW24k", "v(f#cv9RH9", "l92-k2RRz9", "bwCWH4fHM", "]*9rcx fCz4", "qHMzRz92Mp", "!z4/", "!H(\\cxWf#z", "SrCz9c]2Mp", "xk29CzM", "lHM%z94fHM", "s9fcv//2(\\", "x*Cz9c]2Mp", "xW24k", "x*-4/f/*/z", "x/9*ppWz", "x\\z/(k", "s9fCWzcDf(\\", "skfzu", "xCf#z9cdz-", ":fM#c!z2#z9", "5fpk/R29z", "]W2RzcdkzzW", "xMH9z", "l*94z", "]W2fW", "lHM%z94fHMce", "vz9H-W24/", "lH//HMcxCH9z", "!z%z942W", "xCf/z", "+H #z9cxMH ", "+9H/z(/", ":2(kc+*M(k", "x(29rc]2(z", "]2fM/cv//2(\\", "x zz/cDf44", "qzWWrcg9*R", "xW*#pzcqHR-", ":*#\"xW2C", "0(/2mHH\\2", "xCf\\z4", "U2Ccl2MMHM", "]H9z4fpk/", "gz4/fMrcqHM#", "+z9f4kcxHMp", "N(rcdfM#", "gz/z(/", "qHMzc!*4k", "?H(\\\"0M", "0*/92pz", "x2M#4/H9R", "Xfp2cg92fM", "bM#*9z", "lk29R", "!HWWH*/", "]2W4zcx fCz", "x 2ppz9", ":fW\\cg9fM\\", "xC29\\", "]*9rcl*//z9", "x/zzWcdfMp", ":z2Mc?HH\\", "v//92(/", "xWzzCcs2W\\", "Sz2WcqzWW", "!z/*9M", "+9z4zM/", "]9*4/92/fHM", "x2uzp*29#", "+2fMcxCWf/", "x2(9z#c]f9z", ":2pMf/*#z", "grM2Rf(+*M(k", ":zp2kH9M", "g92pHMq9z2/k", "q2/HMc+244", "bM(H9z", "+*94*f/", "!2Cf#cxCfM", "x zz/cx(zM/", "N9HMcs2fW", ":z/2WclW2 ", "if/2Wcsk9H ", ":H9MfMpcx*M", "xrM/kz4f4", ":HHMWfpk/", "Sf##zMc+H z9", "l9H44clkHC", "s f4/z9", "!2fMcg2M(z", "x*MMrcg2r", "l9*M(k", ":f99H9clH2/", "+4r(kcnC", "bw/9zRzxCzz#", "vM(fzM/+H z9", "xk2#H cq2WW", "]*/*9zcxfpk/", "!H(\\cxR24k", "dkf9WCHHW", "qz2/cnC", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M"};
	private static String[] locations = {"5Hcg2/2", "5z cq29\\csH M", "!H*/zceB", "lkz99rp9H%zclf/r", "!H*/zc`o", "!H*/zc`j", "ifHWz/clf/r", "xC9H*/csH z9", "!H*/zc`e", "!*fM4cHucvWCk", "nMfHMcl2%z", "!H*/zc``", "vm2Wz2csH M", "xWH CH\\zcdzWW", "NWzwc]H9z4/", "!H*/zc`[", "XHW#zM9H#clf/r", "!2#fHcsH z9", "!H*/zc`V", "52/fHM2Wc+29\\", "!H*/zc`Q", "!H*/zc`L", "b(9*/z2\\clf/r", "sfMcsH z9", "q*9Mz#csH z9", "!H*/zc`G", "!H*/zc`B", "0Wf%fMzclf/r", "?fpk/kH*4z", "q2//WzcsH z9", "!H*/zc[o", "dkf9WcN4W2M#4", "!H*/zc[j", "lf2M HH#clf/r", "!H*/zc[e", ":/yc:H9/29", ":2kHp2MrcsH M", "!H*/zc[`", "?2\\zcHuc!2pz", "!H*/zc[[", "N(zc+2/k", "qW2(\\/kH9Mclf/r", "g92pHM@4cgzM", "!H*/zc[V", "g29\\cl2%z", "!H*/zc[Q", "xfW%z9cl2%z", "+2WWz/csH M", "!H*/zcj", "if9f#f2Mclf/r", "!H*/zce", "+z /z9clf/r", "!H*/zc`", ":/yc:HHM", "!H*/zc[", "lz9*Wz2Mclf/r", "!H*/zce[", "!H*/zceV", "!H*/zcV", "nM#z9p9H*M#", "!H*/zcQ", "iz9RfWfHMclf/r", "gfpWz//@4cl2%z", "!H*/zcL", "!H*/zcG", "!H*/zcB", "!H(\\cs*MMzW", "!H*/zcjo", "+H z9c+W2M/", "?2%zM#z9csH M", "?2%yc!2#fHcsH z9", "lzW2#HMclf/r", "x2uu9HMclf/r", "!H*/zcjj", "!H*/zcje", "!H*/zcj`", "!H*/zcj[", "!H*/zcjV", "!H*/zcjQ", "!H*/zcjL", "!H*/zcjG", "]*(k4f2clf/r", "!H*/zcjB", "!H*/zceo", "xz2uH2RcN4W2M#4", "lfMM2-29cN4W2M#", "!H*/zcej", "!H*/zcee", "if(/H9rc!H2#", "!H*/zce`", "NM#fpHc+W2/z2*", "!H*/zceQ", "!H*/zceL", "sHkaHc]2WW4", "!H*/zceG", "]24/cxkfC", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "nM\\MH M", "bRC/r", "l2M@/c/zWW", "xCz(f2W"};
	//	static String[] locationmapping = {"0","126","177","127","178","179","139","204","180","209","143","181","129","211","214","182","131","208","183","207","184","185","133","205","206","186","187","132","212","205","188","218","189","130","190","216","134","191","135","192","217","136","222","193","220","194","137","138","149","224","150","140","151","198","152","141","172","173","153","210","154","221","197","155","156","157","200","158","201","142","0","144","148","159","160","161","162","163","164","165","166","145","167","168","203","146","169","170","128","171","147","174","175","223","176","226"};	

	public static void main(String[] args) throws Exception
	{
		initVars();
		decryptStrings(pokemon);
		//		encryptAllStrings();

		//		printBytes(readPokemonFromFile(2));

		//		printAllOfEverything();
		//		printParty();
		//		for (int x=0; x<14; x++)
		//				printBox(x);
		//		
		//		System.out.println(parsePkm(readPokemonFromFile(1)));
		//		readPkmFile(0);



	}

	/**
	 * Parses a PKM file as a string
	 */

	public static String parsePkm(byte[] b)
	{
		String output = "";

		output += "\nNickname: "+ parseNickname(b);
		output += "\nSpecies: "+parseSpecies(b);
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

		return ""+(getUnsigned(b[43])*256 + getUnsigned(b[44]));
	}

	private static String parseLevelMet(byte[] b) 
	{
		return ""+(getUnsigned(b[51])-(b[51] & 0x80)-(b[51] & 0x40));
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
		return pokemon[getUnsigned(b[22])];
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
		byte[] datap = new byte[54];

		// The file structure is 54 bytes,
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

		for (int x=0; x<8; x++)
			otname[x]=data[begin+x-37*pos];

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
			begin+=32*((pos-6)%20);
		}
		else
			begin+=37*pos;

		// Get the data
		for (int x=0; x<32; x++)
		{
			if (pos<6)
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+354-37*pos])))));
				pkmdata[x]=data[begin+x-37*pos];
			}
			else
			{
				//				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+860-21*((pos-6)%20)])))));
				pkmdata[x]=data[begin+x+860-21*((pos-6)%20)];
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
			begin+=32*((pos-6)%20);
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
				name[x]=data[begin+x+860-21*((pos-6)%20)];
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

	/**
	 * This method prints the entire party.
	 */
	public static void printParty() //prints party's names
	{
		System.out.println("Number of Pokemon in party: "+data[6757]);
		int party = data[6757];

		int begin = 6765; int inbox=0;
		for (int y=0; y<party; y++)
		{
			// Get the nickname
			for (int x=0; x<11; x++)
				System.out.print((char)(convertPokeText(getUnsigned((data[begin+x+354+inbox-37*y])))));
			begin+=48; // advance to the next pokemon
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
	 * This method prints all of the hex of the 
	 */
	public static void printAllOfEverything()
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

			row+=""+(char)(convertPokeText(getUnsigned(data[x])));

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

	private static String[] decryptStrings(String[] strings)
	{
		for (int x=0; x<strings.length; x++)
		{
			String t="";
			for (int y=0; y<strings[x].length(); y++)
			{
				int a = strings[x].charAt(y);
				a = a-' ';
				a = (55*(a-43))%92;
				t+= (char)(a+' ');
			}

			strings[x] = t;
			System.out.println(t);
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

				a = (a*87+43)%92+' ';
				
				if (a=='\\' || a== '"')
					t += '\\';

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
