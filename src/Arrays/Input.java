package Arrays;
import java.util.*;
import java.util.Arrays;
public class Input {

    static void printArray(int[]arr){   // This will help when we need to call an array then we directly call this method.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter " + n + " elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array");
         printArray(arr); // This is method we didn't want to write whole array to print we need this


//        for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//        }

        //trying to copy elements of arr to arr_2.

//        int[]arr_2= arr;
//        System.out.println(" Copied array_2");
//        printArray(arr_2);

        // To copy the elements from an array
//        int[] arr_2= Arrays.copyOf(arr, newLength: 2);
//        System.out.println("Copied arr_2");
//        printArray(arr_2);


//        int[] arr_2=Arrays.copyOfRange(arr, from:0, arr.length);
//        System.out.println("Copied arr_2");
//        printArray(arr_2);


        // Changing some values of arr_2

//        arr_2[0]=0;
//        arr_2[1]=0;
//
//        System.out.println("Original array after changing arr_2");
//        printArray(arr);
//
//        System.out.println("Copied arr_2 after changing arr_2");
//        printArray(arr);




    }
}
