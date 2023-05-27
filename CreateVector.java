import java.util.*;
import java.util.Vector;

class CreateVector
{
    public static void main(String[] args)
    {
        Vector v1 = new Vector();//10 is initial capacity
        Vector v2 = new Vector(3);
        Vector v3 = new Vector(3,2);
        v1.add(5);
        v1.add(6);
        System.out.println(v1.size()+ " "+v1.capacity());
        v2.add(15);
        v2.add(61);
        v2.add(150);
        v2.add(761);
        System.out.println(v2.size()+ " "+v2.capacity());
        // v3.add(v2);
        System.out.println(v3.size()+ " "+v3.capacity());
    }
}