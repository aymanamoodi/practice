/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;
import java.util.*;
/**
 *
 * @author Ayman
 */
public class BinaryNumber {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        toBinaryNumber(n);
    }
    static void toBinaryNumber(int n){
        String binary="";
        for(int i=0;i<4;i++){
            if(n%2==0){
                binary="0"+binary;
            }
            else
                binary="1"+binary;
            n=n/2;
            System.out.println(binary);
        }
        System.out.println("The binary of the number is "+binary); 
    }
}
