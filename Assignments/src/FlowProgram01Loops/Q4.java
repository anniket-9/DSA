package FlowProgram01Loops;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        int lcm=(a*b)/hcf;
        System.out.println("Hcf is: "+hcf);
        System.out.println("Lcm is: "+lcm);

    }
}

