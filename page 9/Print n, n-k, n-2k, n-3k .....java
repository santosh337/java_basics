import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        
        for(int i = 0; i <=N/K; i++){
            System.out.println(N - (i*K));
        }
    }
}
