import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int key = scn.nextInt();
            
            min = Math.min(min, key);
            max = Math.max(max, key);
            
            if(freq.containsKey(key)){
                int val = freq.get(key);
                freq.put(key, val + 1);
            }
            else{
                freq.put(key, 1);
            }
        }
        
       while(min <= max){
           if(freq.containsKey(min)){
             if(Math.abs(min) == freq.get(min)){
                System.out.println(min);
            }  
           }
            
           min++;
        }
        
    }
}
