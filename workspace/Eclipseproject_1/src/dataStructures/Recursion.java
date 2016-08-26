package dataStructures;

public class Recursion {

	public static void main(String[] args) {
		Recursion r1 = new Recursion();
		System.out.println(r1.fact(4));
		System.out.println(r1.print(4));
	}
	
	public int fact(int n){
		if(n==1){return 1;}
		else if(n==0){return 1;}
		else{
			return n*fact(n-1);
		}
	}
	
	public int print(int n){
		if(n==0){return 0;}
		else{ 
			System.out.println(n);
			System.out.println(print(n-1));
			return print(n-1);
		}
	}

}
