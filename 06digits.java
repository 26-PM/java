public class digits{
    public static void main(String [] args){
        int num,digit,sum=0;
        String a=args[0];
        System.out.println("Length -->"+a.length());
        num=Integer.parseInt(args[0]);
        while (num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of Digits -->"+sum);
    }
}