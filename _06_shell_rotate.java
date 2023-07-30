package _2d_array;
import java.io.*;
import java.util.*;

public class _06_shell_rotate{
    public static void display(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
    public static void shellRotate(int[][] arr, int s, int r){
        int oned[] = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr,s,oned);
    }
    public static void fillShellFromOned(int[][] arr,int s , int[] oned){
        int minc = s-1;
        int minr = s-1;
        int maxr = arr.length-s;
        int maxc = arr.length-s;
       
        int index =0;
       
        //lw
        for(int i = minr,j = minc; i<=maxr;i++){
            arr[i][j] = oned[index];
            index++;
        }
        // bw
        for(int i = minr, j = minc+1;j<=maxc;j++){
            arr[i][j] = oned[index];
            index++;
        }
        // rw
        for(int i = maxr-1, j = maxc;i<= minr;i++){
            arr[i][j] = oned[index];
            index++;
        }
        //tw
        for(int i = minr,j=maxc-1;j<=minc;j++){
            arr[i][j] = oned[index];
            index++;
        }
        
    }
    public static int[] fillOnedFromShell(int[][] arr , int s){
        int minc = s-1;
        int minr = s-1;
        int maxr = arr.length-s;
        int maxc = arr.length-s;
        int size =  2*(maxr-minr +maxc-minc);
        int index =0;
        int[] oned = new int[size];
        //lw
        for(int i = minr,j = minc; i<=maxr;i++){
            oned[index] = arr[i][j];
            index++;
        }
        // bw
        for(int i = minr, j = minc+1;j<=maxc;j++){
            oned[index]  = arr[i][j];
            index++;
        }
        // rw
        for(int i = maxr-1, j = maxc;i<= minr;i++){
            oned[index] = arr[i][j];
            index++;
        }
        //tw
        for(int i = minr,j=maxc-1;j<=minc;j++){
            oned[index] = arr[i][j];
            index++;
        }
        return oned;
    }
    public static void rotate(int[] oned,int r){
        r = r%oned.length;
        if(r<0){
            r = r+oned.length;
        }
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void reverse(int[] arr, int li, int ri){
        while(li<ri){
            int temp = arr[li];
            arr[ri]  = arr[li];
            arr[li] = temp;
        }
        li++;
        ri--;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        shellRotate(arr,s,r);
        display(arr);
        
    }

}