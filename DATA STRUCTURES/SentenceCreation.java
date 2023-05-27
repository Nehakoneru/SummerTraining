class  NodeS
{
String data;
NodeS next;
NodeS(String data1)
{
this.data=data1;
this.next=null;
}
}
class Sentence
{
NodeS head;
Sentence()
{
this.head=null;
}
void WriteWord(String word) 
{
if(CheckDuplicate(word)) 
{
System.out.println(word+" is already present NO DUPLICATES");
}
else 
{
NodeS  newNode =new  NodeS(word);
if(head==null) 
{
head=newNode;

}
NodeS n=head;
while(n.next!=null) 
{
n=n.next;
}
n.next=newNode;
newNode.next=null;
AddSpace();
}

}
void AddSpace() 
{
NodeS  newNode =new  NodeS(" ");
if(head==null) 
{
head=newNode;

}
NodeS n=head;
while(n.next!=null) 
{
n=n.next;
}
n.next=newNode;
newNode.next=null;
}
boolean CheckDuplicate(String word) 
{
if(head==null) 
{
return false;
}
if(head.next==null ) 
{
if(head.data.equals(word)) 
{
return true;
}
return false;
}
else 
{
NodeS temp=head;
while(temp!=null) 
{
if(temp.data.equals(word)) 
{
return true;
}
temp=temp.next;
}
return false;
}
}
void display() 
{
NodeS n=head;
if(n==null) 
{
System.out.println("No elements to display ");
}
while(n!=null) 
{
System.out.print(" "+n.data);
n=n.next;
}
System.out.println();
}
void ClearSentence() 
{
head=null;
}
void BackScpace() 
{
int i=0;
while(i<2) 
{
if(head==null) 
{
System.out.println("No Elements to BackSpace");
}
else if(head.next==null) 
{
head=null;
}
else 
{
NodeS n=head;
while(n.next.next!=null) 
{
n=n.next;
}
NodeS temp=n.next;
n.next=null;

}
i++;
}

}
}
public class SentenceCreation 
{

public static void main(String[] args) 
{
// TODO Auto-generated method stub
Sentence s1=new Sentence();
s1.WriteWord("Hello");
s1.WriteWord("World");
s1.display();
s1.WriteWord("Hello");
        s1.WriteWord("Good Morning!!");
        s1.display();
        s1.BackScpace();
        s1.display();
}
}