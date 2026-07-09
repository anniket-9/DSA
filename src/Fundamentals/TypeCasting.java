package Fundamentals;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//       System.out.println("Please enter some input: ");
//        int rollno=sc.nextInt();
//        System.out.println("Your roll no is: "+ rollno);
//        Float num=sc.nextFloat();  This gives Float value if we give input an integer value to it.
//        int num=sc.nextFloat();    This will not execute as we know Destination type >  Source Type
//        System.out.println(num);



        // Type Casting :-   Compresses the bigger number into smaller type expeditiously
//        int num=(int)(67.56f);
//        System.out.println(num);


        // Automatic type promotion in expression
//        int a=257;
//       byte b=(byte)(a);  This will not execute as the maximum 1 byte can hold is 256 but we are giving 257
//      System.out.println(b);

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=(a*b)/c;
//        System.out.println(d);   O/P:- 20

//        int number='A';      Here we get the value of A as 65 this is called ASCII Value.
//        System.out.println(number);

         byte b=42;
         char c='a';
         short s=1024;
         int i=50000;
         float f=5.67f;
         double d=0.1234;
         double result=(f*b) + (i/c) - (d*s);
         // float + int - double = double (The solution will be in double)
         System.out.println((f*b) + " " + (i/c) + " " + (d*s));
         System.out.println(result);




    }
        }
