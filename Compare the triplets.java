import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /** This method is implemented to calculate Alice(a) and Bob(b) score increase when compared*/
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {    
    
    List<Integer> results = new ArrayList<Integer>();
    int aliceScore=0;
    int bobScore=0;
       
    for (int i=0;i<a.size();i++){
        if (a.get(i)>b.get(i)){
           aliceScore++; 
        //When a is greater than b aliceScore variable increases its value by 1  
        }
        else if (a.get(i)==b.get(i)){    
        //When both are equal the values keep the same.    
        }
        else if (a.get(i)<b.get(i)){
          bobScore++; 
        //When b is greater than a bobScore variable increases its value by 1           
        }
           
    }
    results.add(aliceScore);
    results.add(bobScore);
    return results;     
    }


}