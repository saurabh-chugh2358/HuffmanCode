package stacks;

public class DynArrayStack {

	private int top;
	private int capacity;
	private int [] array;
	
	public DynArrayStack(){
		capacity = 1;
		array = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isStackFull(){
		return (top== (capacity-1));
	}
	
	private void doubleStack() {
		int [] newArray = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity *= 2;
		array = newArray;
	}
	
	public void push(int data) {
		if(isStackFull()){
			doubleStack();
		}else{
			array[++top] = data;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			return array[top--];
		}
	}
	
	public void deleteStack(){
		top = -1;
	}
}