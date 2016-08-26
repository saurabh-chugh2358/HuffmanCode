package Chapter15;

import java.io.*;
import java.util.*;

public class JukeBox1 {
	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		JukeBox1 box1 = new JukeBox1();
		box1.go();
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
		
		// This method sorts a list and
		// since ArrayList implements the List interface, 
		// we can pass ArrayList to a method declared to take Lists.
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	public void getSongs() {
		
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			while ((line = reader.readLine()) != null){
				addSong(line);
			}
		}catch (Exception ex) {ex.printStackTrace();}
	}
	
	public void addSong(String lineToParse) {
		String [] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}

}