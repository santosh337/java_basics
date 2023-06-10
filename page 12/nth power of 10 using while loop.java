import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int power = 10;
        int out = 1;
        int i = 1;
        while (i<=num) {
            out = out*power;
            i++;
        }
        System.out.println(out);
    }
}
