package linkedList;

import java.util.*;

public class CheckCylclicity {
	static ListNode headNode;

	public static void main(String[] args) {
		CheckCylclicity list1 = new CheckCylclicity();
		list1.buildLinkedList();
		
		if (list1.chkInHashTable(headNode) == true){
			System.out.println("Cycle Exists");
		}else{
			System.out.println("Cycle does not Exists");
		}
		
		if (list1.floydCyclicityAlgo(headNode) == true){
			System.out.println("Cycle Exists");
		}else{
			System.out.println("Cycle does not Exists");
		}

	}
	
	public void buildLinkedList(){
		int [] inputArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		SinglyLinkedList list = new SinglyLinkedList();
		for(int i=0; i<inputArray.length; i++){
			headNode = list.insertListNode(headNode, new ListNode(inputArray[i]), inputArray[i]+1);
		}
		list.printList(headNode);
		
		ListNode lastNode = list.getLastNode(headNode);
		lastNode.setNext(headNode.getNext().getNext().getNext().getNext());
	}
	
	public static boolean chkInHashTable(ListNode headNode){
		boolean cycleExist = false;
		Hashtable<Integer, ListNode> listTable = new Hashtable<Integer, ListNode>();
		ListNode currentNode = headNode; 
		for(int pos = 1; currentNode.getNext() != null; pos++){
			listTable.put(pos, currentNode);
			currentNode = currentNode.getNext(); 
			if (listTable.containsValue(currentNode)){
				cycleExist = true;
				break;
			}
		}
		
		return cycleExist;
	}
	
	
	// FLOYD ALGORITHM to check if there exists a cycle in the Linked List.
	// and is there is a cycle it will print the data of the node from where the cycle starts.
	public static boolean floydCyclicityAlgo(ListNode headNode){
		boolean cycleExist = false;
		ListNode fPtr = headNode;
		ListNode sPtr = headNode;
		
		while ((fPtr.getNext()!= null) && (fPtr.getNext().getNext() != null)){
			sPtr = sPtr.getNext();
			fPtr = fPtr.getNext().getNext();
			if(fPtr == sPtr){
				
				cycleExist = true;
				break;
			}
		}
		
		if (cycleExist == true){
			sPtr = headNode;
			while(sPtr != fPtr){
				sPtr = sPtr.getNext();
				fPtr = fPtr.getNext();
			}
			System.out.println(sPtr.getData());
		}
		return  cycleExist;
	}
}
