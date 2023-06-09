import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if (str.length() >= 4) {
            System.out.println(str.charAt(3));
        } else {
           System.out.println("Small string");
        }
    }
}
