
public class MixedTestDrive {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();
		Object a3 = new A();
		
		if (a3 instanceof A){
			A a4 = (A) a3;
			a4.m1();
		}
		A a4 = (A) a3;
		a4.m1();
		
		b.m1();
		c.m3();
		a.m1();
		a2.m3();
		
		MixedTestDrive m1 = new MixedTestDrive();
		
		m1.getObject(a);
		m1.getObject(b);
		m1.getObject(c);
		m1.getObject(a2);
		System.out.println(m1.toString());
		
	}
	
	public void getObject(A a){
		System.out.println("This is A's or its subclass's object");
		a.m1();
		a.m2();
		a.m3();
	}

}


class A {
	int ivar = 7;
	void m1 () {
		System.out.println("A's m1, ");
	}
	
	void m2 () {
		System.out.println("A's m2, ");
	}
	
	void m3 () {
		System.out.println("A's m3, ");
	}
	
}

class B extends A {
	void m1(){
		System.out.println("B's m1");
	}
}

class C extends B {
	void m3 () {
		System.out.println("C's m3, " + ivar);
	}
	
	void m4 () {
		System.out.println("C's m4, " + ivar);
	}
}