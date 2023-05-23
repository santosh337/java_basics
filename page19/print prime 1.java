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
        int x = scn.nextInt();
        int y = scn.nextInt();

        for (int i=x;i<=y;i++) {
            String str = isPrime(i);
            if (str == "Yes") {
                System.out.print(i+" ");
            }
        }
    }
}
 
