
public class Version 
{
	String name;
	int gen;

	int getStartOfParty()
	{
		switch (gen)
		{
		case 1:
			return 12084;
		case 3:
			return 10349;
		default:
			return 0;
		}
	}

	int[] getChecksumDimensions()	// start, size, offset
	{
		switch(gen)
		{	// color case
		case 1:
			int[] e = {9624, 3979, 13603};
			return e;
		case 2:		// gold silver
			int[] a =  {8201, 3424, 11625};
			return a;
		case 3:		// crystal
			int[] c =  {8201, 2938, 11533};
			return c;
		default:
			int[] b =  {};
			return b;
		}
	}

	int getGen()
	{
		return gen;
	}

	String getVersion()
	{
		return name;
	}

	void setVersion(int gen)		// 1 is RBY, 2 is GS, 3 is C
	{
		this.gen = gen;

		switch (gen)
		{
		case 1:		// color case
			name = "Red / Blue / Yellow";
			break;
		case 2:
			name = "Gold / Silver";
			break;
		case 3:
			name = "Crystal";
			break;
		default:		// null gen
			name = "Unknown";
		}
	}

	public int getSizeOfPartyData() 
	{
		return 44 + ((gen<2)? 0:4);
	}

	public int getSizeOfPokeData() 
	{
		switch (gen)
		{
		case 1:
			return 33;
		case 2:
		case 3:
			return 32;
		default:
			return 0;
		}
	}

	public int getNicknameOffset() 
	{
		switch (gen)
		{
		case 0:
		case 1:
			return 12414;
		case 2:
		case 3:
			return 7119;
		default:
			return 0;
		}
	}

	public static int numberOfGens() 
	{
		return 4;	// including the null gen
	}
}
