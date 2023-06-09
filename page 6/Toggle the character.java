import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        if (Character.isLowerCase(ch)) {
            System.out.println(Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(Character.toLowerCase(ch));
        }
    }
}
