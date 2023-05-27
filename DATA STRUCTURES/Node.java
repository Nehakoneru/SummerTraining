class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class LinkedList
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    void insertEnd(int data)
    {
        Node n = new Node(data);
        Node temp=head;
        if(head==null)// no linked list
            head=n;
        else if(head.next==null)
            head.next=n;
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }         
            temp.next=n;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
class TestLinkedList
{
    public static void main(String args[])
    {
        LinkedList l = new LinkedList();
        l.insertEnd(10);
        l.insertEnd(20);
        l.insertEnd(30);
        l.insertEnd(40);
        l.display();
        
    }
}