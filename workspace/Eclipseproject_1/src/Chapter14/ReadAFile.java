package Chapter14;

import java.io.*;

public class ReadAFile {

	public static void main(String[] args) {
		try{
			File f = new File("Foo.txt");
			BufferedReader reader = new BufferedReader(new FileReader(f));
			
			String line = null;
			while ((line = reader.readLine()) != null){
				// Some how split() doesn't work for the pipe symbol "|"
				//String [] result = line.split("/");
				
				String [] result = line.split(":");
				
				for (String token:result){
					System.out.println(token);
				}
				System.out.println(line);
				
			}
			reader.close();
		}catch (Exception ex) {ex.printStackTrace();}
	}
}
