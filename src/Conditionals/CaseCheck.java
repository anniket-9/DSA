package Conditionals;
import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);

        // .trim(): removes the spaces at beginning or end.
        // .charAt(0): takes the very 1st character of that word and stores it in variable ch

        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("Uppercase");

        }

    }

}
