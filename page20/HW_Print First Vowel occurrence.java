import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //input for A array
        char [] A = new char[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.next().charAt(0);  
        }
        
        for (int j=0;j<n;j++) {
            if (A[j] == 'a' || A[j] == 'e' || A[j] == 'i' || A[j] == 'o' || A[j] == 'u') {
                System.out.println(j);
                break;
            }
        }
    }
}
