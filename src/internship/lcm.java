/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;
import java.util.*;
/**
 * @author Ayman
 */
public class lcm {
 public static void main(String args[]){
     Scanner s =new Scanner(System.in);
     int a= s.nextInt();
     int b= s.nextInt();
     int max=0, min=0,lcm=0;
     if(a>b){
         max=a;
         min=b;
     }
     else{
         min=a;
         max=b;
     }
     for(int i=1;i<min;i++){
         lcm=max*i;
         if(lcm%min==0)
             break;
     }
     System.out.println("The lcm of two numbers is "+lcm);
     
 }
}
