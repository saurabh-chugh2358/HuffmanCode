package linkedList;

public class ListNode {
	private int data;
	private ListNode next;
	
	// constructor to set default data.
	public ListNode (int data){
		this.data = data;
	}
	
	// Method to set the incoming data.
	public void setData(int data){
		this.data = data;
	}
	
	// Method to set this node's pointer to some other node 
	// The next pointer stores the address of the next node to which it is pointing in the Singly Linked List.
	public void setNext(ListNode next){
		this.next = next;
	}
	
	// Method to get the address of the node it is pointing.
	public ListNode getNext(){
		return this.next;
	}
	
	public int getData(){
		return this.data;
	}
}
