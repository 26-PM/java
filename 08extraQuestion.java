// 3
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


// 4
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

// 1.	Write a java application that takes an integer number as input from command line and computes the sum of digits and number of digits

// 2.	WAP to enter age to find out person is eligible to vote or not

// 3.	Enter a number and check whether its Armstrong or not

// 4.	WAP to enter three numbers and check the smallest of 3 numbers

// 5. WAP to calculate perimeter and area of circle, triangle, square, and rectangle using switch case

// 6. Write a program to take marks as input and display the associated grade 

// 7. WAP to demonstrate the use of arithmetic and bitwise operators

// 8. WAP to demonstrate the use of logical and relational operators

// 9. WAP to take a number as input and check whether it is a prime number or not.


// 5
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

// 6
public class extraQuestion {
       
}