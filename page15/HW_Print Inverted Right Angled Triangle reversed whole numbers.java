import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i=n;i>=1;i--) {
            for (int j=n;j>(n-i);j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
