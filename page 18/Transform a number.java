import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int temp1 = n;
        int power = 1;
        int out = 0;
        while (temp>0) {
            temp = temp/10;
            power = power *10;
        }
        power = power/10;
        
        for (int j = 1;j<=2;j++) {
        int a = temp1/10;
        int b = temp1%10;
         out = a + (b * power);
         temp1 = out;
        }
        System.out.println(out);
    }
}
