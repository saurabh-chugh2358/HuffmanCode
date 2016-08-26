package Chapter16;

import java.io.*;
import java.util.*;

class Song implements Comparable <Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	public int compareTo(Song s){
		int c = title.compareTo(s.getTitle());
		//System.out.println(c);
		return c;
	}
	
	public Song (String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBPM() {
		return bpm;
	}
	
	//We override toString(), because when you do a System.
	//out.println(aSongObject), we want to see the title.
	//When you do a System.out.println(aListOfSongs), it calls
	//the toString() method of EACH element in the list.
	public String toString() {
		return title;
	}
	
	// When you put an object to an HashSet it uses the object's hashCode to determine where to put the object in the set.
	// But it also compares the object's hashCode with the hashCodes of all the other objects in the HashSet to check for duplicity.
	// And if there is no matching code the HashSet assumes that the new object is not duplicate.
	public int hashCode() {
		return getTitle().hashCode();
	}
	
	// If the HashSet finds a matching hashCode for two objects - 
	// the HashSet will call one of the object's equals() method to see if these hashCode matched objects really are equal.  
	public boolean equals(Object aSong) {
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}
	
}


public class JukeBox2 {

	ArrayList<Song> songList = new ArrayList<Song>();
	Song nextSong;
	
	public static void main(String[] args) {
		JukeBox2 box2 = new JukeBox2();
		box2.go();
	}
	
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
		
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		
		// TreeSet that would use the compareTo method for the sort.
		TreeSet<Song> songSetT1 = new TreeSet<Song>();
		songSetT1.addAll(songList);
		System.out.println(songSetT1);
		
		//TreeSet that would use the ArtistCompare (inner class which implements the Comparator interface) for the sort.
		TreeSet<Song> songSetT2 = new TreeSet<Song>(artistCompare);
		songSetT2.addAll(songList);
		System.out.println(songSetT2);

	}
	
	public void getSongs() {
		try{
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			while ((line = reader.readLine()) != null){
				addSong(line);
			}
			
		}catch(Exception ex){ex.printStackTrace();}
		
	}
	
	public void addSong (String lineToParse) {
		String [] tokens = lineToParse.split("/");
		nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
	
	class ArtistCompare implements Comparator<Song> {
		
		public int compare(Song one, Song two){
			return one.getArtist().compareTo(two.getArtist());
		}
	}
}
