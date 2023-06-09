import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int value = (char)('A');
        for (int i=value;i<=value+25;i++) {
            char ch = (char)i;
            if (i%2==0) {
                char lower = Character.toLowerCase(ch);
                String str = Character.toString(lower);
                System.out.println(str+str);
            } else {
                String str = Character.toString(ch);
                System.out.println(str+str+str);
            }
        }
    }
}
