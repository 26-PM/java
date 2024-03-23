import java.util.*;
public class guess12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=(int)(Math.random()*100)+1;

        int attempts=5;
        System.out.println("Guess a number.");
        
        do{
            int guess=sc.nextInt();
            if (guess<n){
                System.out.println("Entered value is less than the number.");
            }
            
            else if(guess>n){
                System.out.println("Entered value is greater than the number.");
            }
            else if (guess==n) {
                System.out.println("Hurray, You won!");
                break;
            }
            attempts=attempts-1;
            System.out.println("You have "+attempts+" attempts remaining");
        
            if (attempts==0) {
                System.out.println("You lost. The correct answer was "+n);
                break;
            }
        }while(true);
    }
}