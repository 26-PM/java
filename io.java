import java.util.Scanner;

public class io{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word please!");
        char ch=sc.next().charAt(0);
        System.out.println("First Character is -> "+ch);
    }
}