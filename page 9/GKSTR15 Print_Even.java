import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int star = scn.nextInt();
        
        for (int i=0;i<=star;i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
