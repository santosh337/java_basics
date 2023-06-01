import java.io.*;
import java.util.*;

public class Solution {
public static String isPrime(int n) {
        for (int factorial = 2;factorial< n;factorial++) {
            if (n %factorial ==0) {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++) {
            int tst = scn.nextInt();
            System.out.println(isPrime(tst));
        }
    }
}
