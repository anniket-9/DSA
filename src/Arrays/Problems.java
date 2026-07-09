package Arrays;

public class Problems {
    public static void main(String[] args) {

        // Sum of all elements
//        int[]arr={10,20,30,40};
//        int sum =0;
//        for(int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//        }
//        System.out.println("Sum is="+sum);

        // Find Maximum value from an Array
//        int[]arr_1={12,32,45,3,78};
//        int ans=0;
//        for(int i=0;i<arr_1.length;i++){
//            if(arr_1[i]>ans){
//                ans=arr_1[i];
//            }
//        }
//        System.out.println("Max:"+ans);


        // Search in Array
        int[]arr={10,5,2,12,5,4,3};
        int x=5;    // This element we need to find out

        int ans=-1;  // Here value of index will be stored.

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;  // Used when 2 same elements are present in an Array then it will stop the loop when it will found first.
            }
        }
        if(ans==-1){
            System.out.println("Not found");
        }

        System.out.println("Found " + x + " at index " + ans);



    }
}
