public class Main{
    public static void main(String [] args){
        Car c=new Car();
        c.start();
        c.stop();
    }
}
public interface Engine{
    public void start();
    public void stop();
}
public interface Music{
    void start();
    void stop();
}
public class Car implements  Engine,Music{
    public void start(){
        System.out.println("Started");
    }
    public void stop(){
        System.out.println("Stopped");
    }
}