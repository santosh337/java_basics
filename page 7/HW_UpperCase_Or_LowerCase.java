import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);
       
       if (Character.isUpperCase(x)) {
           System.out.println("Char is Uppercase");
       } else {
           System.out.println("Char is Lowercase");
       }
    }
}
