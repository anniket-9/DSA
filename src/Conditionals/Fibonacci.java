package Conditionals;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {

 //  Fibonacci Numbers: It starts from 0 & 1 and the next no will be the sum of previous 2 nos.
//   Ex: 0,1,1,2,3,5,8,13,21,34,........
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

         // This is Fibonacci using While loop.

    }
}
