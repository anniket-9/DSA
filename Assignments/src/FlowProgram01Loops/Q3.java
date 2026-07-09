package FlowProgram01Loops;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            int m = n * i;
            System.out.println(m);

        }
    }
}