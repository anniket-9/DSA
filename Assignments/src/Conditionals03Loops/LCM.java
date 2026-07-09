package Conditionals03Loops;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int x=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y=sc.nextInt();

        int i;
        for(i=1;i<x*y;i++){
           if(i%x==0 && i%y==0){
               System.out.println("LCM is: "+ i);

           }
        }
    }
}
