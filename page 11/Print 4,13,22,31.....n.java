import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for (int i=4;i <=num;i+= 9) {
            System.out.println(i);
        }
    }
}
