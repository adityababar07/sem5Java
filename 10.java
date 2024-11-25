package src;

class testInterface {

    interface Drawable {

        void draw();
    }

    public class Implement_interface implements Drawable {

        public void draw() {
            System.out.println("drawing rectangle");
        }
    }

    static class Circle implements Drawable {

        public void draw() {
            System.out.println("drawing circle");
        }
    }

    public static void main(String args[]) {
        Drawable d = new Circle();
        System.out.println("Differenct implementation of method");
        d.draw();
    }
}
