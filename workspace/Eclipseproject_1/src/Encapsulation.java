
public class Encapsulation {
	public String ename;
	public String edesignation;
	protected String erole;
	private int esalary;

	public static void main(String[] args) {
				
		
		
	}
	
	public String getrole (String designation){
		String role = null;

		switch (designation){
		case "Associate Software Engineer":
			role = "Engineer";
			break;
		
		case "Software Engineer":
			role = "Engineer";
			break;
			
		case "Project Lead":
			role = "Lead";
			break;
			
		case "Associate Project Manager":
			role = "Manager";
			break;
			
		case "Project Manager":
			role = "Manager";
			break;
			
		case "Technical Manager":
			role = "Manager";
			break;
			
		case "Senior Project Manager":
			role = "Manager";
			break;
			
		case "Assistant General Manager":
			role = "Consultant";
			break;
			
		case "Deputy General Manager":
			role = "Consultant";
			break;
			
			
		case "General Manager":
			role = "Consultant";
			break;
			
		case "Vice President":
			role = "Consultant";
			break;
			
		}
		return role;
	}
	
	Encapsulation emp = new Encapsulation();
	
	public int getinformation (String designation) {
		if (emp.getrole(designation).equals("Manager")){
			return esalary;
		}
		else if(emp.getrole(designation).equals("Consultant")){
			return esalary;
		}
		else{
			return 0;
		}
	}
	
	public void setsalary(String designation, int salary){
		if (emp.getrole(designation).equals("Consultant")){
			esalary = salary;
		}
	}

}
