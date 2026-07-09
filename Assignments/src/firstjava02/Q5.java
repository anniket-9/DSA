package firstjava02;

import java.util.Scanner;
public class Q5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();
        if(a>b) {
            System.out.println("1st no is Largest number");
        }
        else if(b>a){
            System.out.println("2nd no is Largest number");
        }
        else{
            System.out.println("Both numbers are equal");
        }
        }
    }

