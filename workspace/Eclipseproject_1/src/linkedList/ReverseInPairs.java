package linkedList;

public class ReverseInPairs {

	public static void main(String[] args) {
		ReverseInPairs a = new ReverseInPairs ();
		ListNode headNode = a.bldLinkedList();
		headNode = a.reversePairIterative(headNode);
		ListNode currentNode = headNode;
		while (currentNode != null){
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		
		headNode = a.reversePairIterativeNew(headNode);
		currentNode = headNode;
		while (currentNode != null){
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		
		headNode = a.reversePairRecursive(headNode);
		currentNode = headNode;
		while (currentNode != null){
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		
	}
	
	public ListNode bldLinkedList(){
		ListNode headNode = new ListNode(1);
		ListNode temp = headNode;
		for(int i = 2; i<8; i++){
			temp.setNext(new ListNode(i));
			temp = temp.getNext();
		}
		return headNode;
	}
	
	public ListNode reversePairRecursive(ListNode headNode){
		ListNode temp;
		if(headNode == null || headNode.getNext() == null){return headNode;}
		else{
			temp = headNode.getNext();
			headNode.setNext(temp.getNext());
			temp.setNext(headNode);
			headNode = temp;
			headNode.getNext().setNext(reversePairRecursive(headNode.getNext().getNext()));
		}
		return headNode;
	}
	
	public ListNode reversePairIterative(ListNode headNode){
		ListNode temp1 = null;
		ListNode temp2 = null;
		ListNode firstNode = headNode.getNext();
		while(headNode.getNext()!=null && headNode.getNext().getNext()!=null){
			temp1 = headNode.getNext();
			temp2 = headNode.getNext().getNext();
			temp1.setNext(headNode);
			if(temp2.getNext() != null){
				headNode.setNext(temp2.getNext());
			}else{
				headNode.setNext(temp2);
			}
			headNode = temp2;
			if(headNode.getNext() != null){
				if(headNode.getNext().getNext() == null){
					headNode.getNext().setNext(headNode);
					headNode.setNext(null);
				}
			}
		}
		return firstNode;
	}
	
	public ListNode reversePairIterativeNew(ListNode headNode){
		ListNode temp1 = null;
		ListNode temp2 = null;
		
		while(headNode != null && headNode.getNext() != null){
			if (temp1 != null){
				temp1.getNext().setNext(headNode.getNext());
			}
			temp1 = headNode.getNext();
			headNode.setNext(headNode.getNext().getNext());
			temp1.setNext(headNode);
			
			if(temp2 == null){
				temp2 = temp1;
			}
			headNode = headNode.getNext();
		}
		return temp2;
	}
	
}
