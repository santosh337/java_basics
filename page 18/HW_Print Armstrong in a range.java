import java.io.*;
import java.util.*;

public class Solution {
public static boolean isArmstrong(int a) {
    if (a<10) {
            return true;
        }
        int sum = 0;
        for (int idx = a;idx >0;idx/=10) {
            int digit = idx %10;
            int cube = digit * digit * digit;
            sum += cube;
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        
        for (int i=x;i<=y;i++) {
            boolean result = isArmstrong(i);
            if (result == true) {
                System.out.println(i);
            }
        }
    }
}
