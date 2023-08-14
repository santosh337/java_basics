import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         
        HashMap<String,String> hm = new HashMap<>();
        // for (int i=1;i<=T;i++) {
        while (true) {
            int T = scn.nextInt();
            if (T==1) {
                String word = scn.next();
                String meaning = scn.next();
                hm.put(word,meaning);
            } else if (T==2){
                String word = scn.next();
                System.out.println(hm.getOrDefault(word,"-1"));
            } else if (T==3){
                String word = scn.next();
                hm.remove(word);
            } else {
                break;
            }
        }
       // }
    }
}
