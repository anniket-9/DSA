package Arrays;
import java.util.*;
public class MiscProblems {

    // Sort an array consisting of only 0 and 1.



    // Rotate the array without using extra space

//    static void reverse(int[] arr, int i,int j){
//        while(i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//    static void rotateInPlace(int[] arr, int k){
//        int n=arr.length;
//        reverse(arr,i:0,j:n-k-1);
//
//    }




    // Rotate the array by k steps

//    static int[] rotate(int[] arr, int k){
//        int n=arr.length;
//        k=k%n;
//        int[] ans= new int[n];
//        int j=0;
//
//        for(int i=n-k;i<n;i++){
//            ans[j++]=arr[i];
//        }
//
//        for(i=0;i<n-k;i++){
//            ans[j++]=arr[i];
//        }
//        return ans;
//    }


    // Reverse an Array

    // METHOD--2

//    static void swapInArray(int[] arr, int i, int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//
//    static void reverseArray(int[] arr){
//        int i=0, j=arr.length-1;
//
//        while(i<j){
//            swapInArray(arr,i,j);
//            i++;
//            j--;
//        }
//
//    }


    // METHOD--1

//    static int[] reverseArray(int[]arr){
//        int n=arr.length;
//        int[]ans=new int[n];
//        int j=0;  // To store the value of ans in this
//
//        // traverse the original array in reverse direction
//
//        for(int i=n-1;i>=0;i--){
//           ans[j]=arr[i];
//           j++;
//            // j++ means its value will be 0 then automatically it will become 1
//
//        }
//        return ans;
//    }


    // Swapping of two numbers

    static void swapWithoutTemp(int a, int b){

        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

//    static void swap(int a, int b){
//            System.out.println("Original values before swap");
//            System.out.println("a: " + a);
//            System.out.println("b: " + b);
//
//            int temp=a;   // temp=9
//            a=b;    // a=3
//            b=temp;   // b=9
//
//            System.out.println("Values after swap");
//            System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k=sc.nextInt();

//        System.out.println("Original Array");
//        printArray(arr);
////        int[]ans=rotate(arr,k);
//        System.out.println("Array after rotation");
////        printArray(ans);


//        int a=9;
//        int b=3;
//        int[] arr={1,2,3,4,5};

//         reverseArray(arr);
//         printArray(arr);


 //      swap(a,b);

//       swapWithoutTemp(a,b);












    }
}
