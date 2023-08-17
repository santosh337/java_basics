import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = scn.next();
        }
        for(int i=0; i<arr.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            sb.reverse();
            if(arr[i].equals(sb.toString())){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("empty");
    }
}
