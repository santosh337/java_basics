import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arrLst = new ArrayList<>();
        for (int i=0;i<n;i++) {
            arrLst.add(scn.nextInt());
        }
        
        for (int j=0;j<n;j++) {
            System.out.print(arrLst.get(j)+" ");
        }
        System.out.println();
        
        for (int val:arrLst) {
            System.out.print(val+" ");
        }
    }
}
