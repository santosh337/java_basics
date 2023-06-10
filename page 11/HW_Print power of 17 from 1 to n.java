import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextInt();
        long sum = 17;
        long s = sum;
        long i = 1;
        while (i <=num) {
            System.out.print(s+" ");
            s = sum * s;
            i++;
        }
    }
}
