/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

/**
 *
 * @author Ayman
 */
public class BubbleSort {
    public static void sorting(int[] arr){
        //outer for loop is for no of passes
        for(int i=0;i<arr.length-1;i++){
            //inner loop is for no of comparisions j<len-1-i because if it is len -i it will be array index out of bound as j+1 element will be null
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
        }
    }
    }
    public static void display(int[] arr){
        for (int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        
        //int[] arr = new int[10];
        int[] arr = {4,33,26,1,12,11};
        
        sorting(arr);
        display(arr);
    }
}
