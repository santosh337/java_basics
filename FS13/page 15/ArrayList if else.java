import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=1;i<=T;i++) {
            int cases = scn.nextInt();
            if (cases == 1) {
                    System.out.println(arr.size());
            } else if (cases == 2) {
                if (arr.size() != 0) {
                    int removed = arr.remove(arr.size() - 1);
                    System.out.println(removed);
                } else {
                    System.out.println("invalid-move");
                }
            } else if (cases == 3) {
                int optional = scn.nextInt();
                System.out.println(optional);
                arr.add(optional);
            } else if (cases == 4) {
                if (arr.size() != 0) {
                    int removed = arr.remove(0);
                    System.out.println(removed);
                } else {
                    System.out.println("invalid-move");
                }
            } else if (cases == 5) {
                int optional = scn.nextInt();
                System.out.println(optional);
                arr.add(0,optional);
                
            } else {
                if (arr.size() != 0) {
                    for (int k=0;k<arr.size();k++) {
                        System.out.print(arr.get(k)+" ");
                    }
                    System.out.println();
                } else {
                    System.out.println("invalid-move");
                }
            }
        }
    }
}
