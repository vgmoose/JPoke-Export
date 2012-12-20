// Imports
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.swing.*;

public class PokeList extends JFrame
{

	private static final long serialVersionUID = 1L;

	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JList		listbox;

	String[]  listData;
	
	public PokeList(PokeExport pe)
	{
		
	}
	
	private PokeList()
	{
		// Set the frame characteristics
		setTitle("Local Storage");
		setSize( 200, 500 );
		setBackground( Color.white );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
	}
	
	// Constructor of main frame
	public PokeList(File f) throws IOException
	{

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

	}
	
	public void makeList()
	{

		// Create a new listbox control
		listbox = new JList( listData );

		topPanel.add( listbox, BorderLayout.CENTER );
	}

	//	public static void main( String args[] ) throws IOException
	//	{
	//		PokeList mainFrame	= new PokeList();
	//		mainFrame.setVisible( true );
	//	}
}


