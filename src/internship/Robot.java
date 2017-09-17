/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

/**
 *
 * @author Ayman
 */
public class Robot {
    static char u,d,l,r,a;
    static int x=0, y=0 ;
    static String move ="rurdldlu";
    static String attendence="PLPPPLA";
    public static void main(String args[]){
        char[] A = new char[8]; 
        A = move.toCharArray();
        for(int i=0;i<8; i++)
           a=A[i];
            move(x,y,a);
            position();
            attendence();
    }
   
    static void move(int x, int y, char direction){
        if(direction =='u')
            y++;
        if(direction =='d')
            y--;
        if(direction =='l')
            x--;
        if(direction == 'r')
            x++;
    }
  static  void position (){
       if(x==0 && y==0){
           System.out.println("The robot is at starting position");
       }
       else
          System.out.println("The robot is not at starting position"); 
   }
  static void attendence(){
      char[] att = new char[10];
      att=attendence.toCharArray();
      for(int i=0; i<att.length-1;i++){
          if(att[i]=='A'||att[i+1]=='A')
              x++;
              //System.out.println("shouldn't give award");
          else if(att[i]=='L' && att[i+1]=='L')
              x++;         
         
      }
      if(x == 0)
              System.out.println("should give award");
          else 
              System.out.println("don't give award");
  }
    
}
