import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        if (str1.length() < str2.length()) {
            System.out.print(str1 + str2 + str1);
        } else {
            System.out.print(str2 + str1 + str2);
        }
    }
}
