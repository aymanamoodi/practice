/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;
import java.io.*;
import java.util.*;
/**
 *
 * @author Ayman
 */
public class fibbonaci {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x= n;
        int sum=0;
        for(int i=0;i<x;i++){
            System.out.println(sum);
             sum= sum +(n-i);
        }
        System.out.print("fibbonaci value is "+sum);
    }
}
