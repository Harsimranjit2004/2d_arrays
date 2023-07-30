package _2d_array;

import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;

public class _03_spiral_triversal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        int tnt = n*m;
        int minc = 0;
        int minr = 0;
        int maxr = arr.length -1;
        int maxc = arr[0].length-1;
        while(cnt<tnt){
            //left wall
            for(int i = 0 ,j=minc;i<=maxr && cnt<tnt ;i++  ){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for(int i = maxr,j=minc;j<=maxc && cnt<tnt ;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            //rigth wall
            for(int j =maxc,i=maxr;i>=minc && cnt<tnt ;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall
            for(int i = minr,j=maxc;j>=minc && cnt<tnt ;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }                                                        
}
