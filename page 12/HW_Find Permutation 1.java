import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int i = 1;
        int nFac = 1 , rFac = 1;
        for (int k =1;k<=n;k++) {
            nFac = nFac*k;
        }
        
        for (int k =1;k<=n-r;k++) {
            rFac = rFac*k;
        }
        
        System.out.println(nFac/rFac);
    }
}
