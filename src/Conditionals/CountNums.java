package Conditionals;
import java.util.*;
public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;    // used to get the last digit of the number.
            if (rem == 5) {
                count++;         // And then we will increase the value of the variable by count
            }
            n = n / 10;          // by dividing no to 10 then the last digit is eliminated.
        }
        System.out.println(count);

    }
}
