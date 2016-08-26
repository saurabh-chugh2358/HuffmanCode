package linkedList;

public class JosephusPositionCLL {

	public static void main(String[] args) {
		JosephusPositionCLL a = new JosephusPositionCLL();
		a.GetJosephusPosition(5, 3);
	}
	
	public void GetJosephusPosition(int n, int m){
		ListNode p = null, q= null;
		p = new ListNode(1);
		q= p;
		for(int i= 2; i<= n; i++){
			p.setNext(new ListNode(i));
			p = p.getNext();
		}
		p.setNext(q);
		
		for(int count= n; count>1; --count){
			for(int i=0; i<m; i++){
				p = p.getNext();
				p.setNext(p.getNext().getNext());
			}
		}
		System.out.println("Josephus Position is:" + p.getData());
	}

}
