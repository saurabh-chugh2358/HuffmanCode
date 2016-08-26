package stacks;

public class LLStack {
	private LLNode headNode;
	
	public LLStack(){
		this.headNode = null;
	}
	
	public void push(int data){
		if(headNode == null){
			headNode = new LLNode(data);
		}else {
			LLNode llNode = new LLNode(data);
			llNode.setNext(headNode);
			headNode = llNode;
		}
	}
	
	public int pop() throws EmptyStackException{
		if(headNode == null){
			throw new EmptyStackException("Stack Empty");
		}else{
			int data = headNode.getData();
			headNode = headNode.getNext();
			return data;
		}
	}
	
}

class EmptyStackException extends Exception{
	public EmptyStackException(String){
		
	}
}