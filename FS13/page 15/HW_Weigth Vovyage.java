import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int days = scn.nextInt();
        
        int right=0,left=0;
        for(int i: arr){right+=i;left=Math.max(left,i);}
        while(left<right)
        {
            int mid=(left+right)/2;
            int i=0,sum=0;
            int cur=0;
            while(i<arr.length)
            {
                sum+=arr[i];
                if(sum==mid){
                    cur++;
                    sum=0;
                }else if(sum>mid){
                   cur++;
                   sum=arr[i];
                }
                i++;
            }

            if(sum!=0)cur++;

            if(cur<=days){
                right=mid;
            }else if(cur>days){
                left=mid+1;
            }
        }
        System.out.println(left);

    }
}
