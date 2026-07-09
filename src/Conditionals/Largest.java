package Conditionals;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st no: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd no:");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd no");
        int c=sc.nextInt();

//        Find the largest of the 3 numbers:

         if(a>=b && a>=c){
             System.out.println("a is largest");
         }
         else if(b>=a && b>=c){
             System.out.println("b is largest");
         }
         else{
             System.out.println("c is largest");
         }



        }

    }

