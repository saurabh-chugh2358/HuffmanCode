public class constructors {

	public 	static void main(String[] args) {
		// declare a variable of type getinformation.
		getinformation person;

		// CALL THE CONSTRUCTOR OF OTHER CALSS AS PER THE INCOMING PARAMETER(S)
		switch (args.length) {
		case 1:
			// getinformation person1 = new getinformation(args[0]);
			person = new getinformation(args[0]);
			break;

		case 2:
			// getinformation person2 = new getinformation(args[0],
			// Integer.parseInt(args[1]));
			person = new getinformation(args[0], Integer.parseInt(args[1]));
			break;

		case 3:
			// getinformation person3 = new getinformation(args[0],
			// Integer.parseInt(args[1]), args[2].substring(1, 1));
			person = new getinformation(args[0], Integer.parseInt(args[1]),
					args[2].substring(1, 1));
			break;

		case 4:
			// getinformation person4 = new getinformation(args[0],
			// Integer.parseInt(args[1]), args[2].substring(0, 1), args[3]);
			person = new getinformation(args[0], Integer.parseInt(args[1]),
					args[2].substring(0, 1), args[3]);
			// getinformation person = new getinformation(args[]);
			break;

		default:
			// getinformation person5 = new getinformation();
			person = new getinformation();

		}

	}
}

class getinformation {
	private String ename;
	private int eage;
	private String esex;
	private String elocation;

	public getinformation() {
		System.out.println("Wrong or Invalid Information");
	}

	public getinformation(String name) {
		this.ename = name;
		System.out.println("Name of the User is: " + ename);
	}

	public getinformation(String name, int age) {
		this.ename = name;
		this.eage = age;
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
	}

	public getinformation(String name, int age, String sex) {
		this.ename = name;
		this.eage = age;
		this.esex = sex;
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
		System.out.println("Sex of the User is: " + esex);
	}

	public getinformation(String name, int age, String sex, String location) {
		this.ename = name;
		this.eage = age;
		this.esex = sex;
		this.elocation = location;
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
		System.out.println("Sex of the User is: " + esex);
		System.out.println("Location of the User is: " + elocation);
	}
	
	public void displayinfo() {
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
		System.out.println("Sex of the User is: " + esex);
		System.out.println("Location of the User is: " + elocation);		
	}
}