import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 11; i <= (n*11); i += 11){
            System.out.print(i+" ");
        }
    }
}
