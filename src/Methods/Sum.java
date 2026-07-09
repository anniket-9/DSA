package Methods;
import java.util.*;
public class Sum {


//    Q. Calculate sum of 2 nos

//    public static int calculateSum(int a,int b){
//        int sum=a+b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        int sum=calculateSum(a,b);
//        System.out.println("Sum of 2nos is"+sum);
//
//
//    }



//    Q.Calculate  the product of 2 nos.

//    public static int calculatemul (int a,int b){
//        return a*b;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        System.out.println("Mul os 2nos "+calculatemul(a,b));
//
//    }


//     Q. Calculate the factorial of nos.

    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid no.");
            return;
        }
        int factorial=1;

        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);
    }

}
