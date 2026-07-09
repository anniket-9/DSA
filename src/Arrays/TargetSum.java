package Arrays;
import java.util.*;
public class TargetSum {

    // Find the second smallest element in the given array.

    // 1st Min value
    static int findMin(int[]arr){
        int mx=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    // 2nd min value
    /*
    Find minimum first
    mark all min as +infinite
    Find min again and that will be the 2nd minimum
     */

    static int SecondMin(int[]arr){
        int mx=findMin(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int SecondMin=findMin(arr);
        return SecondMin;
    }

    //  Return the Last value that is repeating in the array.

    static int lastRepeatingNumber(int[]arr){
        int n=arr.length;
        int ans=-1;  // If No repeating number exists

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                }
            }
        }
        return ans;
    }

    // Return the first value that is repeating in the array.

    static int firstRepeatingNumber(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){   //First number
            for(int j=i+1;j<n;j++){ //Second number
                if(arr[i]==arr[j]){ //Found answer
                    return arr[i];
                }
            }
        }
        return -1;  //For not found any repeating ans
    }

    // Find the second largest element in the given array.

    // Max Value
    static int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];

            }
        }
        return mx;

    }

    // 2nd Max Value:
    /*
    Find the max first
    Mark all max as -infinite
    Find max again and this will be the 2nd max
     */

    static int findSecondMax(int[]arr){
        int mx=findMax(arr);       // For finding max value
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;    // This is to mark the max element to -infinity.
            }
        }
        int SecondMax=findMax(arr);
        return SecondMax;
    }



    // Array Manipulation: Find the unique number in a given array where all the elements are repeated twice.

    static int findUnique(int[] arr){

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }

            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }


    // Find the no of triplets whose sum is equal to the given value x.

    static int tripletSum(int[] arr, int x) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {   //first number
            for (int j = i + 1; j < n; j++) {  //second number
                for (int k = j + 1; k < n; k++) {  //third number
                    if (arr[i] + arr[j] + arr[k] == x) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

        // Find the total number of pairs in an array whose sum is equal to the given value x.

        static int pairSum ( int[] arr, int x){
            int n = arr.length;
            int ans = 0;

            for (int i = 0; i < n; i++) {  //first number
                for (int j = i + 1; j < n; j++) {  // second number
                    if (arr[i] + arr[j] == x) {
                        ans++;
                    }
                }
            }
            return ans;
        }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

//            System.out.println("Enter x");
//            int x = sc.nextInt();


//        System.out.println("Total no of pairs: " + pairSum(arr,x));

//        System.out.println("Total no of triplets: " + tripletSum(arr, x));

//        System.out.println("Unique no is: " + findUnique(arr));

//        System.out.println("The max value is: " + findMax(arr));

//          System.out.println("The 2nd max value is: " + findSecondMax(arr) );

//            System.out.println("The first repeating no is: " + firstRepeatingNumber(arr));

//            System.out.println("The last repeating no is: " + lastRepeatingNumber(arr));

//            System.out.println("The min value is: " + findMin(arr));

            System.out.println("The second min value is: " + SecondMin(arr));






        }

}
