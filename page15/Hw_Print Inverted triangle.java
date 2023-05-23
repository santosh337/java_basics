import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = n;
        int space = 0;
        
        
        for(int row = 1; row <= (n/2)+1; row++){
            for(int csp = 1; csp <= space; csp++){
                System.out.print("\t");
            }
            
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*\t");
            }
            
                star -= 2;
                space ++;
            System.out.println();
        }
    }
}
