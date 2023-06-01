import java.io.*;
import java.util.*;

public class Solution {
 public static boolean isPrime(int i) {
        if (i<=1) {
            return false;
        }
        
        for (int j=2;j<i;j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1;i<=n;i++) {
            if (n%i==0 && isPrime(i)==true) {
                System.out.println(i);
            }
        }
    }
}
