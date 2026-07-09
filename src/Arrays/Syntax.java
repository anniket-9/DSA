package Arrays;
public class Syntax {
    public static void main(String[] args) {

        // 1-D Array
        // datatype[] variable_name = new datatype[size]

//        int[] rolno = new int[5];        // This datatype indicates what type of data are stored in an Array.
//        int [] rollno = {23,24,13,14};   // All the type of data in the array should be same
//
//        int[] rols;                      // declaration of array ros is getting defined in the stack
//        rols= new int[5];                // initialisation: actually there object is being created in heap memory
//
//
//         int ages[]=new int[5];
//         int[] age={1,2,3,4,5};         // We can also declare 1-D Array in this way

//        int ages[]=new int[3];   // Array size=3
//
//        ages[0]=5;
//        ages[1]=19;
//        ages[2]=15;
//        ages[5]=20;      // This will not run as no of ages is only 3 and we have given here 5.
//        ages[-1]=13;    // Out of bounds
//
//        System.out.println(ages[0]);
//        System.out.println(ages[5]);    // This will give an error of Index 5 out of bounds for length 3



        // 2-D Array
        // Syntax:  int[][]arr=new int[size][size];
//        int[][] arr_1= new int[5][3];

//        int[][]arr={{56,45,89}, {23,54,67},{46,67,89}};
//        [0][0] [0][1] [0][2]  [1][0] [1][1] [1][2]  [2][0] [2][1] [2][2]
//
//        System.out.println(arr[0][0]); // 56
//        System.out.println(arr[0][1]); // 45
//        System.out.println(arr[0][2]); // 89
//
//        System.out.println(arr[1][0]); // 23
//        System.out.println(arr[1][1]); // 54
//        System.out.println(arr[1][2]); // 67

        // 3-D Array
//        int[][][]arr_3=new int[2][3][4]; // 2*3*4=24 elements space 96 bytes
//        arr_3[0][0][0]=1;
//        arr_3[0][0][1]=2;


        // Traversing through the Array: We can use loop in an Array.

//        int[] arr={10,20,30,40,50};

        // By using for loop
//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]);
//        }

        // By for each loop   In this we can't get the direct value of the indexes
//        for(int num: arr){
//            System.out.println(num);
//        }

        // By while loop
//        int i=0;
//        while(i<5){
//            System.out.println(arr[i]);
//            i++;
//        }

//        // For Multi Arrays
//        int[][] arr= {{56,37,8},{12,32,4}};
//        for(int i=0; i<2;i++){    //  2 rows present
//            for(int j=0;j<3;j++){ //  3 elements are there
//                System.out.println(arr[i][j]);
//            }
//        }
        // When Length operator is used
        int[][] arr_1= {{56,37,8},{12,32,4}};
        for(int i=0; i<arr_1.length;i++){   // i is used for no of rows
            for(int j=0;j<arr_1[i].length;j++){  //arr[i].length is used for no of columns
                System.out.println(arr_1[i][j]);
            }
        }
        // In 2D array outer loop runs with(arr.length) and the inner loop runs with(arr[i].length)











    }

}
