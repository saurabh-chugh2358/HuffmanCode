import java.util.*;

public class TestBox {
	Integer i = 0;
	int j;
	Date today = new Date();
	

	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
	}
	
	public void go() {
		j=i;
		System.out.println(j);
		System.out.println(i);
		System.out.println(String.format("I've more than %,.3f articles to read", 298374.39847));
		System.out.println(String.format("I've more than %.3f, articles to read", 298374.39847));
		System.out.println(String.format("%,d", 298374));
		System.out.println(String.format("%d", 298374));
		System.out.println(String.format("%c", 298374));
		System.out.println(String.format("Almost %,.2f got out of total %,.2f", 298.23987, 387.32478));
		System.out.println(String.format("%tc", new Date()));
	}

}
