import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         for(int i = 3; i <= n; i += 8){
            System.out.print(i+" ");
        }
    }
}
