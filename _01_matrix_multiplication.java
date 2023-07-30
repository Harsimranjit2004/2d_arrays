package _2d_array;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class _01_matrix_multiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] one = new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j =0;j<one[0].length;j++){
                one[i][j] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] two = new int[r2][c2];
        for(int i=0;i<two.length;i++){
            for(int j =0;j<two[0].length;j++){
                two[i][j] = sc.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("invalid");
        }
        int[][] product = new int[r1][c2];
        for(int i= 0 ;i<product.length;i++){
            for(int j = 0 ; j<product[0].length;j++){
                for(int k =0;k<c1;k++){
                    product[i][j] += one[i][k] +two[k][j];
                }
            }
        }

    }
}