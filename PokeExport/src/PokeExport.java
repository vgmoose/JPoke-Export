import java.io.File;
import java.io.FileInputStream;


public class PokeExport 
{
	static File pokesav; 
	static byte[] data;
	static FileInputStream fis;

	static String[] items = {"None","Master Ball","Ultra Ball","BrightPowder","Great Ball","Poké Ball","Bicycle","Teru-sama","Moon Stone","Antidote","Burn Heal","Ice Heal","Awakening","Parlyz Heal","Full Restore","Max Potion","Hyper Potion","Super Potion","Potion","Escape Rope","Repel","Max Elixer","Fire Stone","Thunderstone","Water Stone","Teru-sama","HP Up","Protein","Iron","Carbos","Lucky Punch","Calcium","Rare Candy","X Accuracy","Leaf Stone","Metal Powder","Nugget","Poké Doll","Full Heal","Revive","Max Revive","Guard Spec.","Super Repel","Max Repel","Dire Hit","Teru-sama","Fresh Water","Soda Pop","Lemonade","X Attack","Teru-sama","X Defend","X Speed","X Special","Coin Case","Itemfinder","Teru-sama","Exp Share","Old Rod","Good Rod","Silver Leaf","Super Rod","PP Up","Ether","Max Ether","Elixer","Red Scale","SecretPotion","S.S. Ticket","Mystery Egg","Clear Bell","Silver Wing","Moomoo Milk","Quick Claw","PSNCureBerry","Gold Leaf","Soft Sand","Sharp Beak","PRZCureBerry","Burnt Berry","Ice Berry","Poison Barb","King's Rock","Bitter Berry","Mint Berry","Red Apricorn","TinyMushroom","Big Mushroom","SilverPowder","Blu Apricorn","Teru-sama","Amulet Coin","Ylw Apricorn","Grn Apricorn","Cleanse Tag","Mystic Water","TwistedSpoon","Wht Apricorn","Black Belt","Blk Apricorn","Teru-sama","Pnk Apricorn","BlackGlasses","SlowpokeTail","Pink Bow","Stick","Smoke Ball","NeverMeltIce","Magnet","MiracleBerry","Pearl","Big Pearl","Everstone","Spell Tag","RageCandyBar","GS Ball","Blue Card","Miracle Seed","Thick Club","Focus Band","Teru-sama","EnergyPowder","Energy Root","Heal Powder","Revival Herb","Hard Stone","Lucky Egg","Card Key","Machine Part","Egg Ticket","Lost Item","Stardust","Star Piece","Basement Key","Pass","Teru-sama","Teru-sama","Teru-sama","Charcoal","Berry Juice","Scope Lens","Teru-sama","Teru-sama","Metal Coat","Dragon Fang","Teru-sama","Leftovers","Teru-sama","Teru-sama","Teru-sama","MysteryBerry","Dragon Scale","Berserk Gene","Teru-sama","Teru-sama","Teru-sama","Sacred Ash","Heavy Ball","Flower Mail","Level Ball","Lure Ball","Fast Ball","Teru-sama","Light Ball","Friend Ball","Moon Ball","Love Ball","Normal Box","Gorgeous Box","Sun Stone","Polkadot Bow","Teru-sama","Up-Grade","Berry","Gold Berry","SquirtBottle","Teru-sama","Park Ball","Rainbow Wing","Teru-sama","Brick Piece","Surf Mail","Litebluemail","Portraitmail","Lovely Mail","Eon Mail","Morph Mail","Bluesky Mail","Music Mail","Mirage Mail","Teru-sama","TM01","TM02","TM03","TM04","Fake TM04","TM05","TM06","TM07","TM08","TM09","TM10","TM11","TM12","TM13","TM14","TM15","TM16","TM17","TM18","TM19","TM20","TM21","TM22","TM23","TM24","TM25","TM26","TM27","TM28","Teru-sama","TM29","TM30","TM31","TM32","TM33","TM34","TM35","TM36","TM37","TM38","TM39","TM40","TM41","TM42","TM43","TM44","TM45","TM46","TM47","TM48","TM49","TM50","HM01","HM02","HM03","HM04","HM05","HM06","HM07","HM08","HM09","HM10","HM11","HM12","Cancel"};
	static String[] pokemon = {"Missingno.","Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran (f)","Nidorina","Nidoqueen","Nidoran (m)","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras","Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck","Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew","Chikorita","Bayleef","Meganium","Cyndaquil","Quilava","Typhlosion","Totodile","Croconaw","Feraligatr","Sentret","Furret","Hoothoot","Noctowl","Ledyba","Ledian","Spinarak","Ariados","Crobat","Chinchou","Lanturn","Pichu","Cleffa","Igglybuff","Togepi","Togetic","Natu","Xatu","Mareep","Flaaffy","Ampharos","Bellossom","Marill","Azumarill","Sudowoodo","Politoed","Hoppip","Skiploom","Jumpluff","Aipom","Sunkern","Sunflora","Yanma","Wooper","Quagsire","Espeon","Umbreon","Murkrow","Slowking","Misdreavus","Unown","Wobbuffet","Girafarig","Pineco","Forretress","Dunsparce","Gligar","Steelix","Snubbull","Granbull","Qwilfish","Scizor","Shuckle","Heracross","Sneasel","Teddiursa","Ursaring","Slugma","Magcargo","Swinub","Piloswine","Corsola","Remoraid","Octillery","Delibird","Mantine","Skarmory","Houndour","Houndoom","Kingdra","Phanpy","Donphan","Porygon2","Stantler","Smeargle","Tyrogue","Hitmontop","Smoochum","Elekid","Magby","Miltank","Blissey","Raikou","Entei","Suicune","Larvitar","Pupitar","Tyranitar","Lugia","Ho-oh","Celebi","Uknown","Egg","Unknown","Unknown"};
	static String[] attacks = {"No Move","Pound","Karate Chop","DoubleSlap","Comet Punch","Mega Punch","Pay Day","Fire Punch","Ice Punch","ThunderPunch","Scratch","ViceGrip","Guillotine","Razor Wind","Swords Dance","Cut","Gust","Wing Attack","Whirlwind","Fly","Bind","Slam","Vine Whip","Stomp","Double Kick","Mega Kick","Jump Kick","Rolling Kick","Sand-Attack","Headbutt","Horn Attack","Fury Attack","Horn Drill","Tackle","Body Slam","Wrap","Take Down","Thrash","Double-Edge","Tail Whip","Poison Sting","Twineedle","Pin Missile","Leer","Bite","Growl","Roar","Sing","Supersonic","SonicBoom","Disable","Acid","Ember","Flamethrower","Mist","Water Gun","Hydro Pump","Surf","Ice Beam","Blizzard","Psybeam","BubbleBeam","Aurora Beam","Hyper Beam","Peck","Drill Peck","Submission","Low Kick","Counter","Seismic Toss","Strength","Absorb","Mega Drain","Leech Seed","Growth","Razor Leaf","SolarBeam","PoisonPowder","Stun Spore","Sleep Powder","Petal Dance","String Shot","Dragon Rage","Fire Spin","ThunderShock","Thunderbolt","Thunder Wave","Thunder","Rock Throw","Earthquake","Fissure","Dig","Toxic","Confusion","Psychic","Hypnosis","Meditate","Agility","Quick Attack","Rage","Teleport","Night Shade","Mimic","Screech","Double Team","Recover","Harden","Minimize","SmokeScreen","Confuse Ray","Withdraw","Defense Curl","Barrier","Light Screen","Haze","Reflect","Focus Energy","Bide","Metronome","Mirror Move","Selfdestruct","Egg Bomb","Lick","Smog","Sludge","Bone Club","Fire Blast","Waterfall","Clamp","Swift","Skull Bash","Spike Cannon","Constrict","Amnesia","Kinesis","Softboiled","Hi Jump Kick","Glare","Dream Eater","Poison Gas","Barrage","Leech Life","Lovely Kiss","Sky Attack","Transform","Bubble","Dizzy Punch","Spore","Flash","Psywave","Splash","Acid Armor","Crabhammer","Explosion","Fury Swipes","Bonemerang","Rest","Rock Slide","Hyper Fang","Sharpen","Conversion","Tri Attack","Super Fang","Slash","Substitute","Struggle","Sketch","Triple Kick","Thief","Spider Web","Mind Reader","Nightmare","Flame Wheel","Snore","Curse","Flail","Conversion 2","Aeroblast","Cotton Spore","Reversal","Spite","Powder Snow","Protect","Mach Punch","Scary Face","Faint Attack","Sweet Kiss","Belly Drum","Sludge Bomb","Mud-Slap","Octazooka","Spikes","Zap Cannon","Foresight","Destiny Bond","Perish Song","Icy Wind","Detect","Bone Rush","Lock-On","Outrage","Sandstorm","Giga Drain","Endure","Charm","Rollout","False Swipe","Swagger","Milk Drink","Spark","Fury Cutter","Steel Wing","Mean Look","Attract","Sleep Talk","Heal Bell","Return","Present","Frustration","Safeguard","Pain Split","Sacred Fire","Magnitude","DynamicPunch","Megahorn","DragonBreath","Baton Pass","Encore","Pursuit","Rapid Spin","Sweet Scent","Iron Tail","Metal Claw","Vital Throw","Morning Sun","Synthesis","Moonlight","Hidden Power","Cross Chop","Twister","Rain Dance","Sunny Day","Crunch","Mirror Coat","Psych Up","ExtremeSpeed","AncientPower","Shadow Ball","Future Sight","Rock Smash","Whirlpool","Beat Up","Unknown","Unknown","Unknown","Unknown"};
	static String[] locations = {"No Data","New Bark Town","Route 29","Cherrygrove City","Route 30","Route 31","Violet City","Sprout Tower","Route 32","Ruins of Alph","Union Cave","Route 33","Azalea Town","Slowpoke Well","Ilex Forest","Route 34","Goldenrod City","Radio Tower","Route 35","National Park","Route 36","Route 37","Ecruteak City","Tin Tower","Burned Tower","Route 38","Route 39","Olivine City","Lighthouse","Battle Tower","Route 40","Whirl Islands","Route 41","Cianwood City","Route 42","Mt. Mortar","Mahogany Town","Route 43","Lake of Rage","Route 44","Ice Path","Blackthorn City","Dragon's Den","Route 45","Dark Cave","Route 46","Silver Cave","Pallet Town","Route 1","Viridian City","Route 2","Pewter City","Route 3","Mt. Moon","Route 4","Cerulean City","Route 24","Route 25","Route 5","Underground","Route 6","Vermilion City","Diglett's Cave","Route 7","Route 8","Route 9","Rock Tunnel","Route 10","Power Plant","Lavender Town","Lav. Radio Tower","Celadon City","Saffron City","Route 11","Route 12","Route 13","Route 14","Route 15","Route 16","Route 17","Route 18","Fuchsia City","Route 19","Route 20","Seafoam Islands","Cinnabar Island","Route 21","Route 22","Victory Road","Route 23","Indigo Plateau","Route 26","Route 27","Tohjo Falls","Route 28","Fast Ship","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Unknown","Empty","Can't tell","Special"};
	//	static String[] locationmapping = {"0","126","177","127","178","179","139","204","180","209","143","181","129","211","214","182","131","208","183","207","184","185","133","205","206","186","187","132","212","205","188","218","189","130","190","216","134","191","135","192","217","136","222","193","220","194","137","138","149","224","150","140","151","198","152","141","172","173","153","210","154","221","197","155","156","157","200","158","201","142","0","144","148","159","160","161","162","163","164","165","166","145","167","168","203","146","169","170","128","171","147","174","175","223","176","226"};	

	public static void main(String[] args) throws Exception
	{
		initVars();
		printBytes(readPkmFile(0));

		//		printAllOfEverything();
		//		printParty();
		//		for (int x=0; x<14; x++)
		//				printBox(x);
		//		
		//		System.out.println(parsePkm(readPkmFile(0)));
		//		readPkmFile(0);



	}

	/**
	 * Parses a PKM file as a string
	 */

	public static String parsePkm(byte[] b)
	{
		String output = "";

		output += parseNickname(b);
		//		output += parseSpecies(b);
		//		output += parseItem(b);
		//		output += parseMoves(b);
		////		output += parseOT(b);
		//		output += parseID(b);
		//		output += parseExp(b);
		//		output += parseIV(b);
		//		output += parseEvs(b);
		//		output += parsePP(b);
		//		output += parseHappy(b);
		//		output += parsePokeRus(b);
		//		output += parseTime(b);
		//		output += parseGender(b);
		//		output += parseOTGender(b);
		//		output += parseLocation(b);

		return output;
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
	public static byte[] readPkmFile(int index)
	{
		byte[] datap = new byte[54];

		byte[] namedata = readNickName(index);
		byte[] otnamedata = readOT(index);
		byte[] pkmdata = readPkmn(index);

		// Nickname bytes
		for (int x=0; x<11; x++)
			datap[x] = namedata[x];

		// OT bytes
		for (int x=11; x<22; x++)
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
		byte[] otname = new byte[11];



		return otname;
	}

	/**
	 * Reads the 32 or 48 (party) pokemon bytes from the data structure in the .sav file
	 * @param pos number representing the pokemon to get
	 * @return The bytes representing the pokemon
	 */
	public static byte[] readPkmn(int pos)
	{
		byte[] pkmdata = new byte[32];

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
			return '.';
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
}
