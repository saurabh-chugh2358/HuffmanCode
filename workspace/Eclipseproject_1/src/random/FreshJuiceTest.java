package random;

public class FreshJuiceTest {
	enum GlassSize{SMALL, MEDIUM, LARGE}
	GlassSize size;
	
	public static void main(String[] args) {
		FreshJuiceTest juice = new FreshJuiceTest();
		juice.size = FreshJuiceTest.GlassSize.SMALL;
		System.out.println(juice.size);
	}
}