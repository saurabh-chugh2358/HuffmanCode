
public class practice1 {

	public static void main(String[] args) {
		int x =3;
		while (x>0){
			if (x>2){
				System.out.print("a");
			}
			
			x = x-1;
			System.out.print("-");
			
			if (x==2){
				System.out.print("b c");
			}
			
			if (x==1){
				System.out.print("d");
				x= x-1;
			}
			
		}
		
		int y=5;
		while (y>1){
			y = y-1;
			
			if (y<3){
				System.out.println("small x");
			}
		}
	}

}
