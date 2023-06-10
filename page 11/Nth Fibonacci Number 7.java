import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1;
        int b = 1;
        int sum = 0;
        
        for (int i = 2;i<n;i++) { //6<6
            sum = a + b;
            b = a;
            a = sum;
        }
        System.out.print(a);
    }
}
