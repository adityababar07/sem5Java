package src;
public class Constructors {
    int id;
    String name;
    void display()
    {
        System.out.println("Default value for integer & String is : "+id+" and "+name+"Respectively");
    }
    Constructors()
    {
        System.out.println("Default Constructors is created");
    }
    Constructors(int i,String n)
    {
        id = i;
        name = n;
    }
    void show()
    {
        System.out.println("Roll No. :"+id+", Name is "+name);
    }
    public static void main(String[] args) {
        Constructors obj=new Constructors();
        obj.display();
        Constructors Pobj1=new Constructors(1, "A");
        Constructors Pobj2=new Constructors(2, "B");
        System.out.println("Here paramtric contructor is called");
        Pobj1.show();
        Pobj2.show();
        System.out.println("Destructor is called for object obj ie. for show default values");
        obj.finalize();
        obj=null;
        System.gc();
        System.out.println("Inside the main() method");
        System.out.println("Checking that object obj destroyed...");
        obj.display();
    }
    protected void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}