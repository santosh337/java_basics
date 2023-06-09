import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char gender = scn.nextLine().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("You are a male");
                break;
            case 'm':
                System.out.println("You are a male");
                break;
            case 'F':
                System.out.println("You are a female");
                break;
            case 'f':
                System.out.println("You are a female");
                break;
            default:
                System.out.println("Type again");
                break;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
