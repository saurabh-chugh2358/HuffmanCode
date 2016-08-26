
public class SuperClassAndConstructors {

	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee("Saurabh Chugh", 25, "Male", "Noida", "e-Commerce");
		
		Person p1;

		switch (args.length) {
		case 1:
			p1 = new Person (args[0]);
			break;

		case 2:
			p1 = new Person (args[0], Integer.parseInt(args[1]));
			break;

		case 3:
			p1 = new Person (args[0], Integer.parseInt(args[1]),
					args[2].substring(1, 1));
			break;

		case 4:
			p1 = new Person (args[0], Integer.parseInt(args[1]),
					args[2].substring(0, 1), args[3]);
			break;

		default:
			p1 = new Person ();

		}

	}

}


class Person {
	private String ename;
	private int eage;
	private String esex;
	private String elocation;

	public Person () {
		System.out.println("Wrong or Invalid Information");
	}

	public Person (String name) {
		this.ename = name;
		System.out.println("Name of the User is: " + ename);
	}

	public Person (String name, int age) {
		this.ename = name;
		this.eage = age;
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
	}

	public Person (String name, int age, String sex) {
		this.ename = name;
		this.eage = age;
		this.esex = sex;
		System.out.println("Name of the User is: " + ename);
		System.out.println("Age of the User is: " + eage);
		System.out.println("Sex of the User is: " + esex);
	}

	public Person (String name, int age, String sex, String location) {
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


class Employee extends Person {
	private String eName = "Saurabh Chugh";
	private int eAge = 26;
	private String eSex = "Male";
	private String eLocation = "Noida";
	private String eDept = "e-Commerce";
	
	
	public Employee(String eName, int eAge, String eSex, String eLocation, String eDept) {
		//super(eName, eAge, eSex, eLocation);
		//super(eName, eAge, eSex);
		this.eDept = eDept;
	}
}