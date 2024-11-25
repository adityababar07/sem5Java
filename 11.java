package src;

class Main {


public interface Interface_pract {

    void print();
}

static class A6 implements Interface_pract {

    public void print() {
        System.out.println("This is print method from class A6");
    }

}

public static void main(String args[]) {
    A6 obj = new A6();
    System.out.println("Using interface : ");
    obj.print();
}

}
