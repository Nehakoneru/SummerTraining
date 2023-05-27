class CircQueuee{
    int front=-1,rear=-1,size;
    Integer CircularQueue[];
    CircQueuee(int size)
    { 
        this.size=size;
        CircularQueue = new Integer[size];
    }
    CircQueuee()
    {
        this.size = 10;
        CircularQueue = new Integer[size];
    }
    boolean isFull(){
        if (((rear+1)%size==front))
        { 
            return true;
        }
        
        return false;
    }
    boolean isEmpty()
    {
        if((front==-1 && rear == -1))
        {
            return true;
        }
        return false;
    }
    void enqueue(int ele)
    {
        if (isFull())
        {
            System.out.println("the queue is full cant enqueue");
        }
        else if(front==-1 && rear==-1)
        {
            front++;
            rear++;
            CircularQueue[rear]=ele;
            System.out.println(ele+" inserted at "+rear);
        }
        else{
            rear=(rear+1)%size;
            CircularQueue[rear] = ele;
            System.out.println(ele+" inserted at "+rear);
        }
    }
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("the queue is empty cant dequeue");
        }
        else if(rear==front)
        {
            int a = CircularQueue[front];
            System.out.println(a+" is dequeued and is last element");
            rear=front=-1;
        }
        else
        {
            int a = CircularQueue[front];
            System.out.println(a+" is dequeued at "+front);
            front=(front+1)%size;
        }
    }
    void display()
    {
        if (isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            int i ;
            System.out.println("The elements are:");
            for (i=front;i!=rear;i=(i+1)%size){
                System.out.print(CircularQueue[i]+" ");
            }
            System.out.println(CircularQueue[i]);
        }
    }
    int queueSize()
    {
        if(isFull())
        {
            return size;
        }
        else if (isEmpty())
        {
            return 0;
        }
        else if(front>rear)
        {
          //  return size-((rear+1)%front);
          return size-front+rear+1;
        }
        return (rear-front)+1;
    }
    int search(int ele)
    {
        if (isEmpty())
        {
            System.out.print(ele+" not found: ");
            return -1;
        }
        for (int i=front; i<=rear;i++)
        {
            if(CircularQueue[i] == ele)
            {
                System.out.print(ele+" found at: ");
                return i;
            }
        }
        System.out.print(ele+" not found: ");
        return -1;
    }
    int peek(){
        if (isEmpty())
        {
            System.out.print("no elements: ");
            return -1;
        }
        return CircularQueue[rear];
    }
}
class CircularQueueEx{
    public static void main(String [] args)
    {
        CircQueuee s1 = new CircQueuee(5);
        s1.dequeue();
        System.out.println(s1.peek());
        s1.enqueue(5);
        s1.enqueue(7);
        s1.enqueue(9);
        s1.enqueue(11);
        System.out.println("size: "+s1.queueSize());
        s1.enqueue(15);
        //s1.enqueue(1876);
        s1.dequeue();
        s1.dequeue();
        s1.dequeue();
        //s1.dequeue();
        //s1.dequeue();
        //s1.dequeue();
        s1.enqueue(187);
        s1.enqueue(1876);
        s1.display();
       // s1.enqueue(34);
        //System.out.println(s1.rear +" " +s1.front);
        System.out.println("size: "+s1.queueSize());
        System.out.println(s1.search(5));
        System.out.println(s1.search(7));
        System.out.println("element at rear:"+s1.peek());
    }
}