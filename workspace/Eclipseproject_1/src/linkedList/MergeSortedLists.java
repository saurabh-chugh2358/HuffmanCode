package linkedList;

public class MergeSortedLists {

	public static void main(String[] args) {
		ListNode headNode1;
		ListNode headNode2;
		
		headNode1 = buildStortedLL(132);
		headNode2 = buildStortedLL(123);
		
		ListNode headSortedNode = mergeList(headNode1, headNode2);
		
		while (headSortedNode != null){
			System.out.println(headSortedNode.getData());
			headSortedNode = headSortedNode.getNext();
		} 

	}
	
	static ListNode buildStortedLL(int length){
		ListNode headNode = null;
		headNode = new ListNode((int) (Math.random()*5));
		ListNode temp = headNode;
		
		for (int i =1; i<=length; i++){
			temp.setNext(new ListNode(temp.getData()+i));
			temp = temp.getNext();
		}
		return headNode;
	}
	
	static ListNode mergeList (ListNode a, ListNode b){
		ListNode result = null;
		
		if(a==null){return b;}
		if(b==null){return a;}
		
		if(a.getData() <= b.getData()){
			result = a;
			result.setNext(mergeList(a.getNext(), b));
		}else{
			result = b;
			result.setNext(mergeList(b.getNext(), a));
		}
		
		return result;
	}
}
