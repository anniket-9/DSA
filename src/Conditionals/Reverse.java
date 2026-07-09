package Conditionals;

public class Reverse {
    public static void main(String[] args) {

        int num=123456;

        int ans=0; // Here reversed nos will be stored.

        while(num>0){
            int rem= num % 10; // This extracts the last digit from the input number.
            num /=10;   // This removes the last digit that has been extracted.

            ans=ans*10+rem; // This shifts the number left and add new digit.

        }

        System.out.println(ans);

    }
}
