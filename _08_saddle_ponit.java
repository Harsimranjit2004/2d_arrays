package _2d_array;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class _08_saddle_ponit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i<arr.length;i++){
            int idx = 0;
            for(int j = 0 ;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][idx]){
                    idx = j;
                }
            }
            boolean flag = true;
            for(int k = 0;k<arr.length;k++){
                if(arr[k][idx]>arr[i][idx]){
                    flag = false;
                    break;
                }
            
            }
            if(flag == true){
                System.out.print(arr[i][idx]);
                return;
            }
        }
        System.out.println("invalid");

    }
    
}
