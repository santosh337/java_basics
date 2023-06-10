import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for (int i=num;i>0; i-=5) {
            System.out.print(i+" ");
        }
    }
}
