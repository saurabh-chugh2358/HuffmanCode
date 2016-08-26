package linkedList;

import java.util.*;

public class NthNodeFromEnd {
	static ListNode headNode;

	public static void main(String[] args) {
		NthNodeFromEnd list1 = new NthNodeFromEnd();
		list1.buildLinkedList();
		System.out.println(byHashTables(headNode, 3).getData());
		System.out.println(byTwoPointers(headNode, 3).getData());
		
	}
	
	public void buildLinkedList(){
		int [] inputArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		SinglyLinkedList list = new SinglyLinkedList();
		for(int i=0; i<inputArray.length; i++){
			headNode = list.insertListNode(headNode, new ListNode(inputArray[i]), inputArray[i]+1);
		}
		list.printList(headNode);
		
		// it reverses the singly linked list and returns the last node of the list as head.
		headNode = list.iterativeReverseList(headNode);
		list.printList(headNode);
		
		headNode = list.recursiveReverseList(headNode);
		list.printList(headNode);
		
		// it prints the reverse list.
		list.printReverseList(headNode);
		
	}
	
	public static ListNode byHashTables(ListNode headNode, int positionFromEnd){
		ListNode resultNode = null;
		Hashtable<Integer, ListNode> listTable = new Hashtable<Integer, ListNode>();
		ListNode currentNode = headNode;
		int pos = 1;
		for(;currentNode != null; currentNode= currentNode.getNext()){
			listTable.put(pos, currentNode);
			pos++;
		}
		positionFromEnd = pos-positionFromEnd;
		resultNode = listTable.get(positionFromEnd);
		return resultNode;
	}
	
	public static ListNode byTwoPointers(ListNode headNode, int positionFromEnd){
		ListNode resultNode = null;
		ListNode fPtr = headNode;
		ListNode sPtr = headNode;
		
		for (int cntr = positionFromEnd;fPtr.getNext() != null; cntr--){
			fPtr = fPtr.getNext();
			if(cntr<=1){
				sPtr = sPtr.getNext();
			}
		}
		resultNode = sPtr;
		return resultNode;
	}
}
