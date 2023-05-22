import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int value = (char)('Z');
        for (int i=value;i>=(char)('A');i--) {
            char ch = (char)i;
            char lower = Character.toLowerCase(ch);
            System.out.print(ch+" "+ lower+" ");
        }
        
    }
}
