import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String target = scn.nextLine();
        
        System.out.println(str.indexOf(target));
//         boolean found = false;
//         for (int i=0;i<str.length();i++) {
//             if (str.charAt(i) == target.charAt(0)) {
//                 System.out.print(i);
//                 found = true;
//                 break;
//             }
//         }
        
//         if (found == false) {
//             System.out.print("-1");
//         }
    }
}
