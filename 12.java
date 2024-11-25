package src;

class mainClass {

    interface Printable {

        void print();
    }

    interface Showable {

        void show();
    }

    public static class Multiple_inheritance implements Printable, Showable {

        public void print() {
            System.out.println("Hello");
        }

        public void show() {
            System.out.println("Welcome");
        }

    }

    public static void main(String[] args) {
        Multiple_inheritance obj = new Multiple_inheritance();
        System.out.println("This is an exmpale of Multiple Inheritance");
        obj.print();
        obj.show();
    }
}
