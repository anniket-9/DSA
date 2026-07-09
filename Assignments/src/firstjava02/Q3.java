package firstjava02;

import java.util.Scanner;
public class Q3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amt: ");
        float p=sc.nextFloat();
        System.out.println("Enter the time period:");
        float t=sc.nextFloat();
        System.out.println("Enter the interest rate: ");
        float r=sc.nextFloat();

        float SI=p*r*t/100;
        System.out.println("Simple interest is: "+SI);

    }
}
