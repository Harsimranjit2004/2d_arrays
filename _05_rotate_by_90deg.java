package _2d_array;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class _05_rotate_by_90deg {

    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        // input function

        for(int i = 0 ; i<arr.length;i++){
            for(int  j =0 ; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        // logic 
        // first transpose a matrix then reverse it col wise 
        for(int i =0; i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){ // to ensure that its work on upper trangular only
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse a matrix
        for(int i=0;i<arr.length;i++){
            int li = 0 ; 
            int ri = arr[0].length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

            }
            li++;
            ri--;
            
        }
    }
    
}
