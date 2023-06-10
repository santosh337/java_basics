import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String str = "";
        for (int i = 1;i<=num;i++) {
            if (i%3==0 && i%7==0) {
                str += "FizzBuzz"+" ";
            } 
            else if (i%7==0) {
                str += "Buzz"+" ";
            }
            else if (i%3==0)  {
                str += "Fizz"+" ";
            } else {
                str += (int)i+" ";
             }
        }
        System.out.print(str);
    }
}
