
public class Version 
{
	String name;
	int gen;
		
	int[] getChecksumDimensions()	// start, size, offset
	{
		switch(gen)
		{
		case 2:
			int[] a =  {8201, 3424, 11625};
			return a;
		case 3:
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
	
	void setVersion(int gen)		// 0 is RB, 1 is Y, 2 is GS, 3 is C
	{
		this.gen = gen;
		
		switch (gen)
		{
		case 0:
			name = "Red / Blue";
			break;
		case 1:
			name = "Yellow";
			break;
		case 2:
			name = "Gold / Silver";
			break;
		case 3:
			name = "Crystal";
			break;
		default:
			name = "Unknown";
		}
	}
}
