package src;
public class Keyword_super {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    static class Dog extends Keyword_super {

        public void animalSound() {
            super.animalSound();
            System.out.println("The dog says: bow wow");
        }
    }

    public static void main(String args[]) {
        Keyword_super myDog = new Dog();
        myDog.animalSound();
    }
}
