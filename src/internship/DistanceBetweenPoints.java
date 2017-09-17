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
public class DistanceBetweenPoints {
    public static void main(String args[]){
        System.out.println("Enter the points");
        Scanner s = new Scanner(System.in);
        int[] A = new int [5];
        int g =s.nextInt();
        for(int i=0; i<g;i++){
          A[i] = s.nextInt();
        }
        double distance=0;
        distance= Math.sqrt((A[0]- A[2])*(A[0]-A[2])-(A[1]-A[3])*(A[1]-A[3]));
    
    System.out.println("The distance between the points is "+distance);
            }
}
