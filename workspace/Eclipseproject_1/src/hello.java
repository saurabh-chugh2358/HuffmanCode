public class hello {
	public static void main (String[] arg) {
			
		bye abc = new bye();
		for(int i=0;i<arg.length;i++){
			abc.usrname = arg[i];
			abc.byeout(arg[i]);
			// abc.byeout(arg);
			System.out.println ("Have Fun");
			System.out.print("\n");
		}
	}
}

class bye {
	protected String usrname;
	public void byeout (String arg1) {
		usrname = arg1;
		System.out.println ("Fuck off " + usrname);
	}
}