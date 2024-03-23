public class abstractt{
    public static void main(String args []){
        Son s=new Son();
        // prints coder
        s.proffesion();
    }
}
// Base class
 public abstract class Parent{
    abstract void proffesion();
}
// Children class - inheritence
public class Son extends Parent{
    void proffesion(){
        System.out.println("I am a Coder.");
    }
}

