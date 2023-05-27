 import java.util.*;

 class LinkedListEx2
 {
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add(45);
        l.add(55);
        l.push(78);//for stack
        l.remove(1); 
        l.offerFirst(10);
        l.pollFirst();
        l.pollLast();
        System.out.println(l+"\n" +l.peek());
    }
    }
    Deque d11 = new LinkedList();//Double LinkedList
    Queue s11=new LinkedList();//single LinkedList