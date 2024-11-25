package src;

class Myclass{

    static int num = 100;

    public static void car(int id , String name){
        System.out.println("id =" + id);
        System.out.println("name =" + name);
    }

    public static void student(int id, String name){
        System.out.println("id =" + id);
        System.out.println("name =" + name);
    }

    // overloading
    public static void student(int id, String name, double cgpi){
        System.out.println("\n" + "id =" + id);
        System.out.println("name =" + name);
        System.out.println("CGPI =" + cgpi);
    }

    static class vehical extends Myclass{
        // overriding :- this happens when the method of a subclass has the same name and parameters as that of the method in superclass
         
        public static void car(int id, String name){
            System.out.println("id =" + id);
            System.out.println("name =" + name);
        }
    }

    static void displayNum(){

        System.out.println("\n" + num);
    }

    public static void main(String[] args){
        Myclass obj = new Myclass();

        obj.car(1, "BMW");
        obj.student(1, "aditya");
        obj.student(2, "unmesh", 8.10);

        vehical obj1 = new vehical();

        obj1.car(1, "BMW");

        // static method is a method that exists without  a instance
        displayNum();
    }
}



