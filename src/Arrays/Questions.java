package Arrays;
import java.util.*;
public class Questions {

    // Find the kth largest and smallest element from a given array.

    static int[] kthLargestAndSmallest(int[] arr, int k){
        Arrays.sort(arr);

        int kthSmallest=arr[k-1];
        int kthLargest=arr[arr.length-k];

        return new int[]{kthSmallest, kthLargest};


    }

    // Find the array of smallest and largest element from a given array.

    static int[] smallestAndLargestElement(int[] arr){ //1,2,3,4,5
        Arrays.sort(arr);  // Build in method in java use to sort the array
        int[] ans={arr[0], arr[arr.length-1]}; // arr[0]=1 and arr.length-1=5
        return ans;

    }


    // Check if the given array is sorted or not.

    static boolean isSorted(int[] arr){
        boolean check= true;

        for(int i=1;i<arr.length;i++){  // Here i=0 could not be possible because if i=0 then arr[0]<arr[-1] which is not taken here.
            if(arr[i]<arr[i-1]){  // not sorted because for this the i th > i-1.
                check=false;
                break;
            }
        }
        return check;
    }


    // Count the number of elements strictly greater than value x

    static int strictlyGreater(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){   // Just the value x will be greater than the array value.
                count++;
            }
        }
        return count;
    }


      // Find the last Occurrence of an element x in given array.

    static int lastOccurrence(int[] arr, int x){
        int lastIndex=-1;   // Becoz if we take any number which is not present in an array then it will show -1.
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }


    // Count the no of occurrences of element x in given array.

    static int countOccurrences(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter x");
        int x=sc.nextInt();   // Here change the value of x to k for kth smallest and largest.

//      System.out.println("Count of x: " + countOccurrences(arr, x) );


//      System.out.println("Last occurrence of x:" + lastOccurrence(arr,x));


//      System.out.println("Strictly Greater of x " + strictlyGreater(arr,x));


//      System.out.println("Is Sorted " + isSorted(arr));


//        int[] ans=  smallestAndLargestElement(arr);
//        System.out.println("Smallest: " + ans[0]);
//        System.out.println("Largest: " + ans[1]);


//        int[] result=kthLargestAndSmallest(arr,k);
//        System.out.println("Kth smallest element: " + result[0]);
//        System.out.println("Kth Largest element: " + result[1] );


    }
}
