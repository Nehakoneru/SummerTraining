import java.util.*;
class Box
{
    int len,wei;
    String color;
    Box(int len,int weiString color)
    {
        this.len=len;
        this.wei=wei;
        this.color=color;
    }
    public String to String(){
        return len="+len+" weight= "+wei+"  "+color+";
    }
}
class WeightMachine implements Comparator
{ 
    public int Compare(object o1,object o2)
    {
         Box b1=(Box) o1;
         Box b2=(Box) o2;
         if(b1.wei>b2.wei)
            return 1;
         else if (b1.wei>b2.wei)
            return -1;
         else
            return 0;
    }
}
class colorCmp{
    public int Compare(object o1,object o2)
    {
        Box b1=(Box) o1;
        Box b2=(Box) o2;    }
}
class TestWeiMach
{
    public ststic void main(String args[])
    {
        WeightMachine wm=new weightMachine();
        ColorCmp cm=new ColorCmp();
         Box b1=new Box(4,4,"blue");
         Box b2=new Box(5,15,"Black");
         Box b3=new Box(8,10,"red");
        TreeSet t1=new Treeset(wm);
        TreeSet t2=new Treeset(cm);
        t1.add(b1);
        t1.add(b2);
        t1.add(b3);
        t2.add(b1);
        t2.add(b2);
        t2.add(b3);
        System.out.println(t2);
    }
}