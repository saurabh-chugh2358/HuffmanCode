
public class ArraysandStrings {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int[] myarr;
		int[][] mydarr1;
		int[][] mydarr2;
		
		myarr = new int[5];
		mydarr1 = new int[5][5];
		mydarr2 = new int[5][5];
		System.out.println(myarr.hashCode());
		System.out.println(mydarr1.hashCode());
		System.out.println(mydarr2.hashCode());
				
		for(int i=0; i<5;i++){
			// 1-D Array to load positive integers.
			myarr[i] = i+1;
			
			for(int j=0;j<5;j++){
				// 2-D Array to load positive integers.
				mydarr1[i][j] = 1+ 5*i +j;
				// 2-D Array to load Fibonacci Series.
				mydarr2[i][j] = first + second;
				first = second;
				second = mydarr2[i][j];				
			}
		}
		
		// 1-D Array to print positive integers.
		for(int i=0; i<5;i++){
			System.out.println(myarr[i]);
		}
		
		// 2-D Array to print positive integers.
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				System.out.println(mydarr1[i][j]);
			}
		}
		
		// 2-D Array to print Fibonacci Series.
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				System.out.println(mydarr2[i][j]);
			}
		}
		
		int pos;
		int len;
		char resultchr;
		String finalstr;
		
		// will return ASCII number of the character at position
		pos = args[0].charAt(2);
		System.out.println(pos);
		
		// will return the char at position
		resultchr = args[0].charAt(2);
		System.out.println(resultchr);
		
		// 0-Equal Values
		pos = args[0].compareTo("SAURABH");
		System.out.println(pos);
		
		// concatinate the 2 strings.
		finalstr = args[0].concat("CHUGH");
		System.out.println(finalstr);
		
		// like %Scan in RPGLE - returns the position of the string
		pos = args[0].indexOf("A");
		System.out.println(pos);
		
		// returns the length of the string.
		len = args[0].length();
		System.out.println(len);
		
		// replaces the parg of the string
		finalstr = args[0].replace("S", "R");
		System.out.println(finalstr);
		
		// returns the substring
		finalstr = args[0].substring(2, 4);
		System.out.println(finalstr);
		
	}

}
