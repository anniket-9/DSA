package Conditionals03Loops;
import java.util.*;
public class Intermediate {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

//        Q. Electricity Bill
//        System.out.println("Enter the units consumed: ");
//        int units=sc.nextInt();
//
//        int rate=5;
//        int bill=units*rate;
//        System.out.println("Electricity bill is: "+ bill);

        System.out.println("Enter the units consumed: ");
        int units=sc.nextInt();

        units*rate;

        if(units<100){
            System.out.println("Electricity bill is: "+units*3);
        }
        else if(units>=101 && units<=200){
            System.out.println("Electricity bill is: "+units*5);
        }
        else if(units>=201 && units<=300){
            System.out.println("Electricity bill is: "+ units*7);
        }
        else{
            System.out.println("Electricity bill is:"+units*10);
        }



    }
}
