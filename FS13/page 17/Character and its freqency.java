import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++) {
            char ch = scn.next().charAt(0);
            min = Math.min(min,ch);
            max = Math.max(max,ch);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        // print 
        while (min <= max) {
            char key = (char) min;
            if (hm.containsKey(key)) {
                System.out.println(key+" "+hm.get(key));
            }
            min++;
        }
    }
}
