import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class PokeGUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	PokeList leftFrame;
	PokeList rightFrame;
	private Container content = getContentPane();
	
	PokeExport pe1, pe2;
	int box1, box2;
	
	
	JButton [] b = new JButton[6];
	
	public PokeGUI() throws IOException
	{
		pe1 = new PokeExport();
		box1 = 1;
		
	    String input = JOptionPane.showInputDialog("What Box number? (temporary popup)\nenter 0 - 14, where 0 is the party.");
	    box1 = Integer.parseInt(input);

		
//		refresh();
		leftFrame = new PokeList(pe1, box1);
		leftFrame.setPreferredSize(new Dimension(200,1000));
		leftFrame.setSelectedIndex(0);
		
		rightFrame = new PokeList(new File("Pokemon"));
		rightFrame.setPreferredSize(new Dimension(200,1000));
		rightFrame.setSelectedIndex(0);


		//		FlowLayout fl = new FlowLayout();
		GridBagLayout fl = new GridBagLayout();

		content.setLayout(fl);
		//
		//		content.add(text1);
		//		content.add(filename);
		//		content.add(button5);

		GridBagConstraints c = new GridBagConstraints();

		//		c.fill = GridBagConstraints.HORIZONTAL;
		//		c.weightx = 0;
		//		c.gridx = 0;
		//		c.gridy = 0;
		//		c.gridwidth=8;
		//		content.add(text1, c);

//		c.fill = GridBagConstraints.WEST;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth=1;
		c.gridheight=4;
		JScrollPane jspListPane = new JScrollPane(leftFrame);
		content.add(jspListPane, c);
//		content.add(leftFrame, c);
		
		b[1]= new JButton("<");
		b[1].setPreferredSize(new Dimension(30,40));
		b[1].setFocusable(false);
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth=1;
		c.gridheight=1;
		content.add(b[1], c);
		
		b[2]= new JButton(">");
		b[2].setPreferredSize(new Dimension(30,40));
		b[2].setFocusable(false);
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth=1;
		c.gridheight=1;
		content.add(b[2], c);
		
		b[3]= new JButton("<<");
		b[3].setPreferredSize(new Dimension(30,40));
		b[3].setFocusable(false);
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth=1;
		c.gridheight=1;
		content.add(b[3], c);
		
		b[4]= new JButton(">>");
		b[4].setPreferredSize(new Dimension(30,40));
		b[4].setFocusable(false);
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth=1;
		c.gridheight=1;
		content.add(b[4], c);
		
		b[5]= new JButton("<-->");
		b[5].setPreferredSize(new Dimension(60,40));
		b[5].setFocusable(false);
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth=2;
		c.gridheight=1;
		content.add(b[5], c);

		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth=1;
		c.gridheight=4;
		jspListPane = new JScrollPane(rightFrame);
		content.add(jspListPane, c);
		
		for (int x=1; x<6; x++)
			b[x].addActionListener(this);
		
//		content.add(rightFrame, c);

//		c.fill = GridBagConstraints.EAST;
//		c.weightx = 0.5;
//		c.gridx = 4;
//		c.gridy = 3;
//		content.add(send, c);
//
//		
//		add( leftFrame );
//		add( b );
//		add(new JButton("wadup"));
//		add( rightFrame );
		pack();
	
		setVisible(true);
		
	}
	
	public static void main(String[] args) throws IOException
	{
		PokeExport.decryptAllStrings();
		
		new File("Pokemon").mkdir();
				
		PokeGUI p = new PokeGUI();

		p.setTitle("PokeExport");
		p.setVisible(true);
		
	}

	public void exportPokemon()
	{
		try {
			PokeExport.exportPokemon(pe1.readPokemonFromData(PokeExport.getPosition(box1, leftFrame.getSelectedIndex()+1)));
			rightFrame.refresh();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void importMovePokemon()
	{
		try {
			pe1.writePokemonToData(PokeExport.importPokemon(PokeExport.listLocalPokemonFiles()[rightFrame.getSelectedIndex()]), PokeExport.getPosition(box1, leftFrame.getSelectedIndex()+1));
			
			//byte[] a = PokeExport.importPokemon(PokeExport.listLocalPokemonFiles()[rightFrame.getSelectedIndex()]);
			
			//System.out.println(PokeExport.parsePkm(a));
			
			pe1.writeFile();
			leftFrame.refresh();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void importAddPokemon()
	{
		try {
			if (box1 ==0)
				pe1.addPokemonToParty(PokeExport.importPokemon(PokeExport.listLocalPokemonFiles()[rightFrame.getSelectedIndex()]));
			else
				pe1.addPokemonToBox(PokeExport.importPokemon(PokeExport.listLocalPokemonFiles()[rightFrame.getSelectedIndex()]), box1);

			pe1.writeFile();
			leftFrame.refresh();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void trade()
	{
		
	}
	
	public void tradeMovePokemon(PokeList source, PokeList destination)
	{
		
	}
	
	public void tradeAddPokemon(PokeList source, PokeList destination)
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
//		System.out.println(arg0.getActionCommand());
		if (arg0.getActionCommand().equals(">"))
		{
			if (pe1!=null && pe2!=null)
				tradeMovePokemon(leftFrame,rightFrame);
			else
				exportPokemon();
		}
		else if(arg0.getActionCommand().equals(">>"))
		{
			if (pe1!=null && pe2!=null)
				tradeAddPokemon(leftFrame,rightFrame);
			else
				exportPokemon();
		}
		else if (arg0.getActionCommand().equals("<"))
		{
			if (pe1!=null && pe2!=null)
				tradeMovePokemon(rightFrame,leftFrame);
			else
				importMovePokemon();
		}
		else if (arg0.getActionCommand().equals("<<"))
		{
			if (pe1!=null && pe2!=null)
				tradeAddPokemon(rightFrame,leftFrame);
			else
				importAddPokemon();
		}
		else if (arg0.getActionCommand().equals("<-->"))
		{
			trade();
		}
			
		
	}


}
