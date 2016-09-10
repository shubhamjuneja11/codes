public class Reverse{
	Node head=null;
	public void reverse(){
		Node prev,next,cur=head;
		prev=next=null;
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;//head.next=prev;
		}
		head=prev;
	}
	public void traverse(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String s[]){
	LinkedList l=new LinkedList();
	l.insert(1);l.insert(2);l.insert(3);
l.traverse();
	Reverse r=new Reverse();
	r.head=l.head;
	r.reverse();
	r.traverse();
    
}
}