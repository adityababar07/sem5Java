package src;

public abstract class AbstractKey {

    public String fname = "aditya";
    public int age = 21;

    public abstract void study();

    static class Student extends AbstractKey {

        public int graduationYear = 2026;

        public void study() {
            System.out.println("Studying all day long");
        }
    }

    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}
