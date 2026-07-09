package Switch;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();

//        switch(empID){
//            case 1:
//                System.out.println("Aniket Kumar");
//                break;
//            case 2:
//                System.out.println("Rohit Kumar");
//                break;
//            case 3:
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department");
//                }
//            default:
//                System.out.println("Enter correct EmpID");
//        }

        // better way to write

//        switch (empID) {
//            case 1:
//                System.out.println("Aniket Kumar");
//            case 2:
//                System.out.println("Rohit Kumar");
//            case 3:
//                switch (department) {
//                    case "IT" -> System.out.println("IT Department");
//                    case "Management" -> System.out.println("Management Department");
//                    default -> System.out.println("No Department");
//                }
//            default:
//                System.out.println("Enter correct EmpID");
//        }



    }
}
