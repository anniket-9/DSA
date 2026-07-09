package Switch;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {


//        Scanner sc=new Scanner(System.in);
//        String fruits=sc.next();
//        int day=sc.nextInt();

//        if(fruits.equals("Mango")){     // .equals is used instead of ==
//            System.out.println("King of fruits.");
//        }
//        if(fruits.equals("Apple")){
//            System.out.println("A red sweet fruit");
//        }


//        break condition:

//          switch(fruits){
//              case "Mango":
//                  System.out.println("King os fruits");
//                  break;
//              case "Apple":
//                  System.out.println("A red sweet fruit");
////                  break;                        // If break will not provided then all the execution below it will executes.
//              case "Orange":
//                  System.out.println("Round fruit");
//                  break;
//              case "Grapes":
//                  System.out.println("Small fruit");
//                  break;
//              default:
//                  System.out.println("Please enter valid fruit name");
//        }

//          switch(day){
//              case 1:
//              case 2:
//              case 3:
//              case 4:
//              case 5:
//                  System.out.println("Weekday");
//                  break;
//              case 6:
//              case 7:
//
//          }


           // Day Time of day

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day type: (1= Weekday, 2=Weekend)");
        int day=sc.nextInt();

        System.out.println("Enter the time: (1= Morning, 2=Evening)");
        int time =sc.nextInt();

        switch(day){            // Here normal Switch is initialised.
            case 1:
                  System.out.println("It's a Weekdays");
                  switch(time){    // Here again switch is initialised under previous one that is called Nested Switch Case.
                      case 1:
                          System.out.println("Time to go to work.");
                          break;
                      case 2:
                          System.out.println("Time to relax after work.");
                          break;
                  }
                  break;
            case 2:    // This case is the 2nd of previous Switch.
                System.out.println("It is Weekend");
                switch(time){
                    case 1:
                        System.out.println("Sleep in or go for a walk.");
                        break;
                    case 2:
                        System.out.println("Movie night!!");
                        break;
                }
            break;
        }

    }
}
