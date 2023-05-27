import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int odd = 0;
        int value = 0;
        if (num%2==0) {
            odd = num - 1;
            value = num / 2;
        } else {
            odd = num;
            value = (num / 2) + 1;
        }
        
        for (int j = value ; j>=1;j--) {
        System.out.println(odd);
        odd -= 2;
        }
    }
}
