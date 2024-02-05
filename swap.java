import java.util.Scanner;

public class swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number -> ");
        int a=sc.nextInt();
        System.out.println("Enter second number -> ");
        int b=sc.nextInt();
        
        int temp=a;
        a=b;
        b=temp;
    
        System.out.println("Value of a after swapping -> "+a);
        System.out.println("Value of b after swapping -> "+b);
    }
}