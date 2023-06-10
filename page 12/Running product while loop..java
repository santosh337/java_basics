import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        int sum = 1;
        while (i<=n) {
            int s = scn.nextInt();
            sum *= s;
            System.out.print(sum+ " ");
            i++;
        }
    }
}
