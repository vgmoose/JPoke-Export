package com.vgmoose.pokeexport;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

public class PokeExportActivity extends Activity 
{
	
	Stack<File> stack;
	Stack<File> savfiles;
	TextView name;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		stack = new Stack<File>();
		savfiles = new Stack<File>();

		name = (TextView)(findViewById(R.id.textView1));


		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		stack.push(Environment.getExternalStorageDirectory());
		
		findSaves();
		
	}
	
	
	
	public void findSaves()
	{
		FilenameFilter savfilter = new FilenameFilter() {
		    File f;
		    public boolean accept(File dir, String name) {
		    if(name.toLowerCase().endsWith(".sav")) {
		            return true;
		        }
		        f = new File(dir.getAbsolutePath()+"/"+name);

		        return f.isDirectory();
		    }
		};
		
		while (!stack.isEmpty())
		{
			File searchme = stack.pop();
			String[] files = searchme.list(savfilter); 
			String dir = searchme.getAbsolutePath();
			
			for (String s : files)
			{
				File f = new File(dir+"/"+s);
				
				Log.d("HELLO","checking out "+f.getAbsolutePath());
				
				if (f.isDirectory())
					stack.push(f); // to be traversed
				else
					if (f.length()==32768)
						savfiles.push(f);
//						if (f.length()==32768)
//							Log.d("FOUND","checking out "+f.getAbsolutePath());
			}
		}
		
		for (File f : savfiles)
		{
			boolean hi;
			try {
				hi = PokeExport.isPokemonSav(f);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				hi=false;
			}
			
			Log.d("FOUND",""+f.getName()+": "+hi);
		}

	}
}