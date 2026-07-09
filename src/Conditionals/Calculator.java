package Conditionals;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user till user does not press x or X.
        int ans=0;     // In this the value will be stored.
        while(true){
            // take the operator as  input
            System.out.println("Enter the operator; ");
            char op=sc.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='%' || op=='/'){
                //input two numbers
                System.out.println("Enter two nos: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }else if(op=='x' || op=='X'){
                System.out.println("Tham jaa laadle !!");
                break;
            }else{
                System.out.println("Invalid Operation!!!");
            }
            System.out.println(ans);

            // At last again enter the operation is coming that means this is infinite while loop running.
        }

    }
}

