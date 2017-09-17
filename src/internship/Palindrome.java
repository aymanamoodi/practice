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
public class Palindrome {
    public static void main(String args[]){
        System.out.println("Enter the number to be reversed");
        Scanner sc= new Scanner(System.in);
        int a,sum=0;
        a=sc.nextInt();
        int temp=a;
        while(a>0){
          int r =a%10; 
          sum= (sum*10)+r;
          a=a/10;
        }
        if(temp==sum)
            System.out.println("The number is a palindrome");
        else 
            System .out.println("The number is not a palindrome");
    }
}
