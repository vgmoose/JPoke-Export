import java.util.*;
public class data
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter Text");
			String s = scan.nextLine();

			for (int x=0;x<s.length();x++)
				System.out.print(" "+Integer.toHexString(s.charAt(x)-'A'+128));

			//		System.out.println(""+('M'-'A'+128)+""+('O'-'A'+128)+""+('O'-'A'+128)+""+('F'-'A'+128));
			System.out.println();
			for (int x=0;x<s.length();x++)
				System.out.print("  "+s.charAt(x));

			System.out.println();
		}


	}
}
