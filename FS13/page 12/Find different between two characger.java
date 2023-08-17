import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char first = scn.next().charAt(0);
        char second = scn.next().charAt(0);
        
        int idx1 = str.indexOf(first);
        int idx2 = str.indexOf(second);
        System.out.println((idx2-idx1)-1);
    }
}
