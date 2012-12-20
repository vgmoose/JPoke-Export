// Imports
import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.swing.*;

public class PokeList extends JList
{

	private static final long serialVersionUID = 1L;

	String[]  listData;
	File f;
	int box;
	PokeExport pe;

	public PokeList(PokeExport pe, int box)
	{
		this();

		if (box==0)
			listData = pe.parseParty();
		else
			listData = pe.parseBox(box-1);

		this.box = box;
		this.pe = pe;
		setListData(listData);

	}

	PokeList()
	{
		// Set the frame characteristics
		//		setTitle("Local Storage");
		//		setSize( 200, 500 );
		setBackground( Color.white );
		setVisible(true);
		//		getContentPanel();

		// Create a panel to hold all other components
		//		topPanel = new JPanel();
		//		topPanel.setLayout( new BorderLayout() );
		//		getContentPane().add( topPanel );
	}

	// Constructor of main frame
	public PokeList(File f) throws IOException
	{		
		this();

		this.f = f;

		File[] files = f.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".2pkm");
			}
		});

		// get the array of actual pokemon data
		byte[][] pokemon = PokeExport.importMultiplePokemon(files);

		listData = new String[files.length];

		// decrypt the strings
		//		PokeExport.decryptAllStrings();

		// fill the string array with text
		for (int x=0; x<files.length; x++)
			listData[x] = PokeExport.parseNickname(pokemon[x])+", "+PokeExport.parseSpecies(pokemon[x]);

		setListData(listData);
	}

	public void refresh() throws IOException
	{
		if (f!=null)
		{
			File[] files = f.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".2pkm");
				}
			});
			
			listData = new String[files.length];

			if (files.length!=0)
			{
				// get the array of actual pokemon data
				byte[][] pokemon = PokeExport.importMultiplePokemon(files);

				// decrypt the strings
				//		PokeExport.decryptAllStrings();

				// fill the string array with text
				for (int x=0; x<files.length; x++)
					listData[x] = PokeExport.parseNickname(pokemon[x])+", "+PokeExport.parseSpecies(pokemon[x]);
			}
		}
		else
		{
			if (box==0)
				listData = pe.parseParty();
			else
				listData = pe.parseBox(box-1);

			setListData(listData);
		}

		setListData(listData);

	}

	//		public static void main( String args[] ) throws IOException
	//		{
	//			PokeExport pe1 = new PokeExport();
	//			PokeExport.decryptAllStrings();
	//			
	//			PokeList mainFrame	= new PokeList(pe1, 0);	// party
	//			mainFrame.setVisible( true );
	//		}
}


