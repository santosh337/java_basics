import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int rem = 0;
        int count = 0;
        while (n>0) {
            count ++;
            n /= 10;
        }
        System.out.println(count);
        
        while (temp >0) {
            int digit = temp%10;
            System.out.println(digit);
            temp /= 10;
        }
    }
}
