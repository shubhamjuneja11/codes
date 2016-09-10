public class MergeList{
	Node head1,head2;
	LinkedList l1,l2,l3;
	public void merge()
	{
		while(head1!=null&&head2!=null){
			if(head1.data<=head2.data)
				{l3.insert(head1.data);head1=head1.next;}
			else {l3.insert(head2.data);head2=head2.next;}
		}
		while(head1!=null)
		{l3.insert(head1.data);head1=head1.next;}
		while(head2!=null){
		l3.insert(head2.data);
	    head2=head2.next;
	}
	}	
	public static void main(String s[]){
 
MergeList m=new MergeList();
m.l1=new LinkedList();
 m.l2=new LinkedList();
 m.l3=new LinkedList();
 m.l1.insert(1);m.l1.insert(3);m.l1.insert(5);
 m.l2.insert(1);m.l2.insert(2);m.l2.insert(4);
 m.l1.traverse();
 m.l2.traverse();
m.head1=m.l1.head;
m.head2=m.l2.head;
m.merge();
m.l3.traverse();
}
}