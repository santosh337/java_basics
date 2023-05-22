import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for (int i = 0;i<str.length();i++) {
            if (i%2==0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
