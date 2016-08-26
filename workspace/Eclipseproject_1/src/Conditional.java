
public class Conditional {

	public static void main(String[] args) {
		
		switch(args[0]){
			case "10":
				System.out.println("WEB ORDER");
				break;
			
			case "20":
				System.out.println("PHONE-IN");
				break;
			
			case "80":
				System.out.println("Buisness to Buisness");
				break;
			
			default:
				System.out.println("NOT A VALID ORDER");
				
		}
		
		if(args[1].equals("1")){
			System.out.println("SINGLE SHIPMENT");
			
		}
		else if (args[1].equals("2")){
			System.out.println("TWO SHIPMENTS");
		}
		else {
			System.out.println("MULTIPLE SHIPMENTS");
		}


	}

}
