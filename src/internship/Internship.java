/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;
import java.util.*;
class Tuples{
    String v1,v2;
    Tuples(String v1, String v2){
        this.v1=v1;
        this.v2=v2;
    }
}
class Tweets{
    String v1,E1;
    Tweets(String v1, String E1){
        this.v1=v1;
        this.E1=E1;
    }
}
/**
 *
 * @author Ayman
 */
public class Internship {
    
public static List getRecommendedTweets(List<Tuples> followGraph_edges, List<Tweets> likeGraph_edges, 
        String targetUser, int  minLikeThreshold){
    
    for(Tuples i : followGraph_edges){
        
    }
    
    for(Tweets t : likeGraph_edges){
        //
    }
    return likeGraph_edges;
}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user ="A";
        int threshold = 2;
            List<Tuples> list = new ArrayList <Tuples>();
    Tuples t1= new Tuples("A","B");
    Tuples t2 = new Tuples("A","C");
    Tuples t3 = new Tuples("B","B");
    list.add(t1);
    list.add(t2);
    list.add(t3);
    List <Tweets> list1= new ArrayList <Tweets>();
    list1.add(new Tweets("A","T1"));
    list1.add(new Tweets("B","T2"));
    list1.add(new Tweets("B","T2"));   
    Internship i = new Internship();
    getRecommendedTweets(list,list1, user, threshold);
        // TODO code application logic here
    }
    
}
