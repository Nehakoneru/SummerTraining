class DNode
{
	int data;
	DNode prev,next;
	DNode(int data)
	{
		this.data=data;
		prev=next=null;
	}
	
}
class DLL
{
	DNode head=null,tail=null;
	void insertAtEnd(int data)
	{
		DNode nn = new DNode(data);
		if(head==null)
			tail=head=nn;			
		else if(head.next==null)
		{
			nn.prev=head;
			head.next=nn;
			tail=nn;
		}
		else
		{
			nn.prev=tail;
			tail.next=nn;
			tail=nn;
			
		}
	}
void delEnd()
{
	if(head==null)
			System.out.println("Linked list is empty");			
	else if(head.next==null)
			tail=head=null;
	else
	{	
	DNode temp2=tail;
	tail=tail.prev;
	tail.next=null;
	temp2.prev=null;//optional
	}
}
void insertBegin(int data)
{
	DNode nn = new DNode(data);
	if(head==null)
			tail=head=nn;			
	else
	{
		nn.next=head;
		head.prev=nn;
		head=nn;
	}
	
}
void delBegin()
{
	if(head==null)
			System.out.println("Linked list is empty");			
	else if(head.next==null)
			tail=head=null;
	else{
	DNode temp2=head;
	head=head.next;
	head.prev=null;
	temp2.next=null; 
    //optional
	}
}
void insertAfter(int data,int new_data)
{
	DNode nn=new DNode(data);
	DNode temp=head;
	while(temp.next!=null&&temp.data!=new_data)
	{
		temp=temp.next;
	}
	if(temp.data==new_data)
	{
		nn.next=temp.next;
		nn.prev=temp;
		temp.next=nn;
	}
	else
	System.out.println("Data not found");
}
void size()
{
	int count=0;
	DNode temp=head;
	while(temp!=null)
	{
		temp=temp.next;count++;
	}
	System.out.println("Size="+count);
}
void display()
	{ DNode temp=head;

		while(temp!=null)
		{
            System.out.print(temp.data +" ");
			temp=temp.next;
        }
		System.out.println();

	}
void delAfter(int data)
{
		DNode temp=head;
		if(head==null||head.next==null||tail.data==data)
		System.out.println("cannot delete");
		else{
		while(temp.next.next!=null&&temp.data!=data)
			temp=temp.next;
		if(temp.next==tail&&tail.prev.data==data)
        {
		delEnd();
    }
		else if(temp.data==data&&temp.next!=null)
		{
			DNode temp2=temp.next;
			temp2.next.prev=temp;
			temp.next=temp2.next;
			temp2.prev=temp2.next=null;
		}
		
	}
}
void delBefore(int data)
{
		DNode temp=tail;
		if(head.data==data||head==null||head.next==null)
		System.out.println("cannot delete");
			else{
			while(temp.prev.prev!=null&&temp.data!=data)
				temp=temp.prev;
			DNode temp2=temp;
			 if(temp.data==data&&temp.prev.prev==null)
			{
			delBegin();
			}

			else if(temp.data==data)
			{
				temp2=temp.prev;
				temp2.prev.next=temp;
				temp.prev=temp2.prev;			
			}
			else
			System.out.println("element not found");
			
		}
}
}
class TestDLLEx
{
public static void main(String args[])
{
		DLL l= new DLL();
		l.insertAtEnd(10);
		l.insertAtEnd(20);
		l.insertAtEnd(30);
		l.display();
		l.size();
		l.delEnd();
		l.display();
		l.size();
		
		l.insertBegin(40);
		l.display();
		l.size();
		l.delBegin();
		l.display();
		System.out.println("insert 50 after 30 ");
		
		l.insertAfter(50,30);
		l.display();
		l.insertAtEnd(30);
		l.insertAtEnd(40);
		System.out.println("insert 50 after 20 ");
		l.insertAfter(50,20);
		l.display();
		System.out.println("delete after 20 ");
		l.delAfter(20);
		l.display();
		System.out.println("delete after 30 ");
		l.delAfter(30);
		l.display();
		System.out.println("delete before 30 ");
		l.delBefore(30);
		l.display();
		System.out.println("delete before 20 ");
		l.delBefore(20);		
		l.display();
}
}