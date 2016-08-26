package linkedList;

import java.util.*;

public class FindMergePointInSLL {
	static private ListNode headNode1 = null;
	static private ListNode headNode2 = null;

	public static void main(String[] args) {
		FindMergePointInSLL a = new FindMergePointInSLL();
		a.buildMergingLL();
		ListNode cNode = a.byHashTable(headNode1, headNode2);
		System.out.println(cNode.getData());
		
		cNode = a.byCalculatingDifference(headNode1, headNode2);
		System.out.println(cNode.getData());
		
	}
	
	public void buildMergingLL(){
		headNode1 = new ListNode(0);
		ListNode temp = headNode1;
		for (int i=1; i<9; i++){
			temp.setNext(new ListNode(i));
			temp = temp.getNext();
		}
		
		int j= -9;
		headNode2 = new ListNode(j);
		temp = headNode2;
		while(j<0){
			temp.setNext(new ListNode(j));
			temp = temp.getNext();
			j += 7;
		}
		temp.setNext(headNode1.getNext().getNext().getNext().getNext().getNext());
		int i=0;
		i +=1;
	}
	
	public int listLength (ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;

		while(currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	public ListNode byHashTable(ListNode head1, ListNode head2){
		ListNode commonHead = null;
		
		HashMap<Integer, ListNode> list = new HashMap<Integer, ListNode>();
		for(int i = 1; head1 != null; i++){
			list.put(i, head1);
			head1= head1.getNext();
		}
		
		for (commonHead = null; head2 != null; head2 = head2.getNext()){
			if(list.containsValue(head2)){
				commonHead = head2;
				break;
			}
		}
		return commonHead;
	}
	
    public ListNode byCalculatingDifference(ListNode head1, ListNode head2){
    	ListNode commonNode = null;
    	int diff = listLength(head1) - listLength(head2);
    	
    	for (int i=0; i<Math.abs(diff); i++){
    		if(diff>0){
    			head1 = head1.getNext();
    		}else{
    			head2 = head2.getNext();
    		}
    	}
    	
    	while(head1!= null|| head2!= null){
    		if(head1 == head2){
    			commonNode = head1;
    			break;
    		}
    		head1 = head1.getNext();
    		head2 = head2.getNext();
    	}
    	return commonNode;
	}

}
