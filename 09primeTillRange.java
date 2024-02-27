import java.util.Scanner;
public class prime{
    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        else{
            for (int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range to which you want to print prime number.");
        int num=sc.nextInt();

        for(int i=0;i<num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            
        }

    }
}