package sw1;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Rating {
    private double rate;
    static int count=0;
    static int length=0;
    double avgRatings;
    
    public Rating(){
        rate=0;
    }
   public Rating(double R){
       rate=R;
       count++;
    }
   
    public void setRate(double r) {
        rate=r;
        length+=r;
    }
    public double getRate(){
        return rate;
    }
    
    
    public double avgRatings(){
        avgRatings=length/count;
        return avgRatings;
        
    }
    

}

