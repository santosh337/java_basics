import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        char ch = scn.next().charAt(0);
        
        if (ch>='A' && ch<='Z') {
            if (ch == 'A') {
                System.out.println(x+y);
            } else if (ch == 'S') {
                System.out.println(x-y);
            } else if (ch == 'M') {
                System.out.println(x*y);
            } else if (ch == 'D') {
                System.out.println(x/y);
            } else if (ch == 'R') {
                System.out.println(x%y);
            } else {
                System.out.println("Enter again");
            }
        } else {
            System.out.println("Enter again");
        }
        
    }
}
