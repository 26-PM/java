public class abstractt {
    public static void main(String args[]) {
        Son s = new Son();
        // prints coder
        s.proffesion();
    }
}
// Base class
abstract class Parent {
    abstract void proffesion();
    // abstract void hobbies();
}

// Children class - inheritence
class Son extends Parent {
    void proffesion() {
        System.out.println("I am a Coder.");
    }
}

