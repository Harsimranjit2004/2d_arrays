package _2d_array;

import java.util.Scanner;

public class _07_diagonal_triversal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int g = 0;g<arr.length;g++){
            for(int i = 0,  j = g; j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
