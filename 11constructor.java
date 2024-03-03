import java.util.*;
public class Constructor{
    public static void main(String[] args) {
        Car swift=new Car();
        swift.printData();
    }
}

class Car{
    String name;
    String brand;
    Scanner sc=new Scanner(System.in);

    Car(){
        
        System.out.println("Enter name of car.");
        name=sc.next();
        System.out.println("Enter brand of car.");
        brand=sc.next();
    }
    void printData(){
        System.out.println("The name of car is "+name);
        System.out.println("The brand of car is "+brand);
    }
}