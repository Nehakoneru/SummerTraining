class Library
{
	Book phy= new Book("Physics");
	Book chem= new Book("Chemistry");

}
class Book
{
	String name;
	Book(String name)
	{
		this.name=name;
	}
}
class Student extends Thread
{
    Library lib;
    String name;
    chem Student(String name,Library lib)
    {
        this.name=name;
        this.lib=lib;
    }
    punlic void run()
    {
        synchronized(lib.phy)
        {
             system.out.println(" name is reading the physics book");
             synchronized(lib.chem)
             {
                system.out.println("name is reading the chemistry book");   
             }
             system.out.println("name+" returned the  physics book");   
            }
            system.out.println("name+"has  returned the  chemistry book");   
        }
         class TestLib{
             public static void main (String args[]) 
             {
                Library lib=new Library();
                Phystud p=new PhyStud("ramu",lib);
                chemistry c=new chemStud("rahul,lib");
                p.start();
                Thread sleep( 5000);            }
         }