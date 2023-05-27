import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int number = 2;
        for (int j = 0 ; j<input ;j++) {
            if (number <= input) {
                System.out.println(number);
                number += 7;
            }
        }
    }
}
