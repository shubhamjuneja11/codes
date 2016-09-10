public class LinkedList
{
	Node temp,temp1,head=null;
		public void insert(int data){
		temp=new Node(data);
		if(head==null)
			head=temp;
		else {
				temp1=head;
					while(temp1.next!=null)
					{
					temp1=temp1.next;
					}
				temp1.next=temp;
			}
	}
	public void delete(int key)
	{
		temp1=head;
		Node previous=null;
		if(temp1.data==key)
			head=temp1.next;
		else{
			previous=temp1;
			temp1=temp1.next;
			while(temp1!=null&&temp1.data!=key)
			{
				previous=temp1;
				temp1=temp1.next;
			}
			if(temp1!=null)
				previous.next=temp1.next;
		}

	}
	public void traverse(){
		temp=head;
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
	l.delete(1);
	l.traverse();

}
}