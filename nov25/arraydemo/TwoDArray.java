package nov25.arraydemo;

public class TwoDArray {
    public static void main(String[] args) {

       // int[][] num = {{10,20,30,40}, {10,20,30}, {10,20,30}};


        int[][] arr = new int[3][3];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;


        int[][] arr2 = new int[3][3];

        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;
        arr2[2][0] = 70;
        arr2[2][1] = 80;
        arr2[2][2] = 90;

        System.out.println("length of array : "+arr.length);
// 3rd array arr3[i][j] = arr[i] [j] + arr2 [i] [j]

       System.out.println(" sum : "+(arr[0][0] + arr2[0][0]));

        for (int[] elements: arr) {
            for (int numbers: elements) {
                System.out.print(" "+numbers);
            }
        }



    }
}
