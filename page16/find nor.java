import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nfac = 1; 
        int rfac = 1;
        int nrFac = 1;
        
        for (int i=1;i<=n;i++) {
            nfac *= i;
        }
        for (int j=1;j<=(n-r);j++) {
            nrFac *= j;
        }
        for (int j=1;j<=r;j++) {
            rfac *= j;
        }
        System.out.println(nfac/(nrFac*rfac));
    }
}
