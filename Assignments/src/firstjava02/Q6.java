package firstjava02;

import java.util.Scanner;
public class Q6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Currency in rupees: ");
        float INR=sc.nextFloat();

        float USD=INR/90;
        System.out.println("Amount in USD="+USD);

    }
}
