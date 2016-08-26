package linkedList;

public class SinglyLinkedList {
	private int cntr = 0;
	private ListNode h2 = null;

	public static void main(String[] args) {
		if(args.length>0){
			ListNode headNode = new ListNode(Integer.parseInt(args[0]));
			ListNode currentNode = headNode;
			for(int i=1; i<args.length; i++){
				ListNode tempNode = new ListNode(Integer.parseInt(args[i]));
				currentNode.setNext(tempNode);
				currentNode = tempNode;
			}
			
			// get the length of the list.
			System.out.println(listLength(headNode));
			
			// inserting a node.
			insertListNode(headNode, new ListNode(25), 5);
			
			// get the length of the list.
			System.out.println(listLength(headNode));
			
			// printing the whole list.
			printList(headNode);
			
			// inserting a node.
			ListNode headNode2 = insertListNode(null, new ListNode(25), 5);
			
			// get the length of the list.
			System.out.println(listLength(headNode2));
			
			// printing the whole list.
			printList(headNode2);
			
			// deleting a node.
			deleteListNode(headNode, 5);
			
			// printing the whole list.
			printList(headNode);
			
			// get the length of the list.
			System.out.println(listLength(headNode));
		}
	}
	
	static int listLength (ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;

		while(currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	static void printList(ListNode headNode){
		while (headNode != null){
			System.out.println(headNode.getData());
			headNode = headNode.getNext();
		}
	}
	
	static ListNode getLastNode(ListNode headNode){
		while(headNode.getNext() != null){
			headNode = headNode.getNext();
		}
		return headNode;
	}
	
	static ListNode insertListNode(ListNode headNode, ListNode nodeToInsert, int position){
		if(headNode == null){
			return nodeToInsert;
		}
		
		int size = listLength(headNode);
		if(position>size+1 || position <1){
			System.out.println("Position is invalid, Valid inputs are: 1 to" + (size+1));
			return headNode;
		}else{
			ListNode previousNode = headNode;
			for(int count= 1; count<position-1;){
				previousNode = previousNode.getNext();
				count++;
			}
			nodeToInsert.setNext(previousNode.getNext());
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}
	
	static ListNode deleteListNode(ListNode headNode, int position){
		int size = listLength(headNode);
		ListNode currentNode;
		ListNode previousNode;
		if(position>size || position <1){
			System.out.println("Position is invalid, Valid inputs are: 1 to" + (size));
			return headNode;
		}

		if(position == 1){
			currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		}else{
			previousNode = headNode;
			for(int count = 1; count < position;){
				previousNode = previousNode.getNext();
				count++;
			}
			currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return headNode;
	}
	
	static ListNode iterativeReverseList(ListNode headNode){
		
		ListNode prevNode= null, nextNode = null;
		
		while(headNode != null){
			nextNode = headNode.getNext();
			headNode.setNext(prevNode);
			prevNode = headNode;
			headNode = nextNode;
		}
		return prevNode;
	}
	
	public ListNode recursiveReverseList(ListNode headNode){
		if(headNode.getNext() != null){
			cntr++;
			ListNode h1 = recursiveReverseList(headNode.getNext());
			h1.setNext(headNode);
			cntr--;
		}
		
		if(headNode.getNext() == null){
			h2 = headNode;
			return headNode;
		}
		
		if(cntr == 0){
			headNode.setNext(null);
			return h2;
		}
		return headNode;
	}
	
	// To print the reverse list it traverse the list recursively to the end and while coming back it prints the list.
	public void printReverseList(ListNode headNode){
		if(headNode != null){
			printReverseList(headNode.getNext());
			System.out.println(headNode.getData());
		}
	}
	
	
	static void deletingLinkedList(ListNode headNode){
		
	}
}