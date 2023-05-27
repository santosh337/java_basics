import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 9; i <= (n*9); i += 9){
            System.out.print(i+" ");
        }
    }
}
