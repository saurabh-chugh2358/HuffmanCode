package stacks;

public class LLNode {
	private int data;
	private LLNode next;
	
	// constructor to set default data.
	public LLNode (int data){
		this.data = data;
	}
	
	// Method to set the incoming data.
	public void setData(int data){
		this.data = data;
	}
	
	// Method to set this node's pointer to some other node 
	// The next pointer stores the address of the next node to which it is pointing in the Singly Linked List.
	public void setNext(LLNode next){
		this.next = next;
	}
	
	// Method to get the address of the node it is pointing.
	public LLNode getNext(){
		return this.next;
	}
	
	public int getData(){
		return this.data;
	}
}
