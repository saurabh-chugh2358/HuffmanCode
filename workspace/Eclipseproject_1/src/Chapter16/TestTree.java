package Chapter16;

import java.util.*;

public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestTree().go();

	}
	
	public void go(){
		Book b1 = new Book("Fountain Head");
		Book b2 = new Book("Atlus Shrugged");
		Book b3 = new Book("Kane and Abel");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b1);
		tree.add(b1);
		
		System.out.println(tree);
	}

}

class Book {
	String title;
	public Book(String t) {
		title = t;
	}
}