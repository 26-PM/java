// 1.	Write a java application that takes an integer number as input from command line and computes the sum of digits and number of digits

// 2.	WAP to enter age to find out person is eligible to vote or not

// 3.	Enter a number and check whether its Armstrong or not

// 4.	WAP to enter three numbers and check the smallest of 3 numbers

// 5. WAP to calculate perimeter and area of circle, triangle, square, and rectangle using switch case

// 6. Write a program to take marks as input and display the associated grade 

// 7. WAP to demonstrate the use of arithmetic and bitwise operators

// 8. WAP to demonstrate the use of logical and relational operators

// 9. WAP to take a number as input and check whether it is a prime number or not.

// 1.
// public class digits{
//     public static void main(String [] args){
//         int num,digit,sum=0;
//         String a=args[0];
//         System.out.println("Length -->"+a.length());
//         num=Integer.parseInt(args[0]);
//         while (num>0){
//             digit=num%10;
//             sum=sum+digit;
//             num=num/10;
//         }
//         System.out.println("Sum of Digits -->"+sum);
//     }
// }


// 2.
// import java.util.Scanner;
// public class vote{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age --> ");
//         int age=sc.nextInt();
//         if (age>=18){
//             System.out.println("You can vote.");
//         }        
//         else{
//             System.out.println("You cannot vote.");
//         } 
//     }
// }


// 3.
// import java.util.Scanner;
// public class armstrong{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number --> ");
//         int num = sc.nextInt();
//         int temp,digit,last,sum=0;
//         temp=num;
//         while (temp>0){
//             digit=temp%10;
//             sum+=Math.pow(digits,3);
//             temp/=10;
//         }
//         if (sum==num){
//             System.out.println("Armstorong");
//         }
//         else{
//             System.out.println("Not an Armstrong number.");
//         }
//     }
// }


// 4.
// import java.util.Scanner;
// public class SmallestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int c = sc.nextInt();
//         if (a < b && a < c) {
//             System.out.println(a + " is the smallest.");
//         } else if (b < c && b < a) {
//             System.out.println(b + " is the smallest.");
//         } else {
//             System.out.println(c + " is the smallest.");
//         }
//     }
// }


// 5.
// public class extraQuestion {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 1 to find perimeter of circle.");
//         System.out.println("Enter 2 to find perimeter of square.");
//         System.out.println("Enter 3 to find perimeter of rectangle.");
//         System.out.println("Enter 4 to find perimeter of triangle.");
//         System.out.println("Enter 5 to find perimeter of exit.");
//         String a=sc.next();
//         switch (a) {
//             case "1":
//             System.out.println("Enter radius of circle.");
//             int r=sc.nextInt();
//                 System.out.println("Perimeter = "+2*(22/7)*r);
//                 break;
//             case "2":
//             System.out.println("Enter length of square.");
//             int l=sc.nextInt();
//                 System.out.println("Perimeter = "+l*4);
//                 break;
//             case "3":
//             System.out.println("Enter length of rectangle.");
//             l=sc.nextInt();
//                 System.out.println("Perimeter = "+l*4);
//                 break;
//             case "4":
//             System.out.println("Enter a side of triangle.");
//             int aa=sc.nextInt();
//             System.out.println("Enter b side of triangle.");
//             int b=sc.nextInt();
//             System.out.println("Enter c side of triangle.");
//             int c=sc.nextInt();
//                 System.out.println("Perimeter = "+(aa+b+c));
//                 break;
//             default:
//             System.exit(0);
//                 break;
//         } 
//     }    
// }


// 6.
// import java.util.Scanner;
// public class extraQuestion {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter marks : ");
//         int a=sc.nextInt();
//         if (a>=90){
//             System.out.println("Grade A");
//         }
//         else if(a>=80){
//             System.out.println("Grade B");
//         } 
//         else if(a>=70){
//             System.out.println("Grade C");
//         } 
//         else if(a>=60){
//             System.out.println("Grade D");
//         } 
//         else if(a>=50){
//             System.out.println("Grade E");
//         } 
//         else if(a>=40){
//             System.out.println("Grade F");
//         } 
//         else{
//             System.out.println("Fail");
//         }
//     }
// }


// 7.
// public class extraQuestion{
//     public static void main(String[] args) {
//         System.out.println("Arithmetic Operators");
//         System.out.println("Addition : 5+5 = "+(5+5));
//         System.out.println("Subtraction : 5-5 = "+(5-5));
//         System.out.println("Multiplication : 5*5 = "+(5*5));
//         System.out.println("Quotient : 5/5 = "+(5/5));
//         System.out.println("Remainder : 5%5 = "+(5%5));
//         System.out.println("\n");
//         System.out.println("Bitwise Operators");
//         System.out.println("AND & : 1&1 = "+(1&1));
//         System.out.println("OR | : 0|0 = "+(0|0));
//         System.out.println("XOR ^ : 5^5 = "+(5^5));
//         System.out.println("NOT ~ : ~5 = "+(~5));
//         System.out.println("Left Shift << : 5<<5 = "+(5<<5));
//         System.out.println("Right Shift >> : 5>>5 = "+(5>>5));
//         System.out.println("Unsigned Right Shift >>> : 5>>>5 = "+(5>>>5));
//     }
// }


// 8. 
// public class extraQuestion{
//     public static void main(String[]args){
//         System.out.println("Logical Operators");
//         System.out.println("Logical AND && : 1<2&&2>1 = "+(1<2&&2>1));
//         System.out.println("Logical OR || : 1<2||2>1 = "+(1<2||2>1));
//         System.out.println("Logical NOT ! : !false= "+(!false));
//         System.out.println("\n");
//         System.out.println("Relational Operators");
//         System.out.println("Equal to == : 1==1 = "+(1==1));
//         System.out.println("Not equal to != : 1!=2 = "+(1!=2));
//         System.out.println("Greater than > : 2>1 = "+(2>1));
//         System.out.println("Less than < : 1<2 = "+(1<2));
//         System.out.println("Less than equal to < : 1<=1 = "+(1<=1));
//         System.out.println("Greater than equal to < : 1>=1 = "+(1>=1));
//     }
// }

// 9.
// import java.util.Scanner;
// public class prime{ 
//     public static void main(String[] args) {

//         int flag=1;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int num=sc.nextInt();

//         if (num<=1){
//             flag=0;
//         }
//         else{
//             for (int i = 2; i < (num/2); i++) {
//                 if (num%i==0){
//                     flag=0;
//                     break;
//                 }
//             }
//         }

//         if (flag==0){
//             System.out.println("Not a prime number.");
//         }
//         else{
//             System.out.println("Prime number.");
//         }
//     }
// }


// 10. WAP to create sphere class in Shapes 3D package and print volume and surface area.
// package Shapes3D;

// class Sphere{

//     private double radius;

//     public  Sphere(double radius){
//         this.radius=radius;
//     }
//     public double getVolume(){
//         // Volume of a sphere: V = (4/3) * π * r^3
//         return (4/3)*Math.PI*Math.pow(radius,3);
//     }
//     public double getSurfaceArea(){
//         // Surface area of a sphere: A = 4 * π * r^2
//         return 4*Math.PI*Math.pow(radius, 2);
//     }

//     public static void main(String [] args){
//         double sphereRadius=5.0;
//         Sphere mySphere= new Sphere(sphereRadius);
//         System.out.printf("Volume ="+mySphere.getVolume()+"\n");
//         System.out.printf("Surface Area ="+mySphere.getSurfaceArea()+"\n");
//     }
// }


// 11. WAP to print Fibonnaci numbers and store it in an array.
// import java.util.*;
// public class fibo{
//     public static void main(String[] args) {
//         int n=10;
//         int[] arr=new int[n];
//         arr[0]=0;
//         arr[1]=1;
//         for(int i=2;i<n;i++){
//             arr[i] = arr[i-1] + arr[i-2];
//         }
//         System.out.println("Fibonacci numbers  are : ");
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// 12. WAP to take 10 elements as an input in an array, sort it and print using functions.
// import java.util.Scanner;
// public class  SortArray {
//     static int[]sort(int[]arr){
//         int temp;
//         for (int i=0;i<arr.length - 1;i++){
//             if (arr[i]>arr[i+1]){
//                 temp=arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//             }
//         }
//         return  arr;
//     }
//     public static void main(String[] args) {    
//         Scanner scanner = new Scanner(System.in);   
//         int n = 10;
//         int[] arr= new int[n];    
//         for (int i=0;i<10;i++)  {
//             System.out.print("Enter number "+(i+1)+" : ");    
//             arr[i] = scanner.nextInt();
//         }
//         System.out.println("\nSorted Array is:");  
//         sort(arr);
//         for (int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+"\t");  
//         }
//     }
// }