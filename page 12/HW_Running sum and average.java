import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i =0;i<=n;i++) {
            sum +=i;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}
