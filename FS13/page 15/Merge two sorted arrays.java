import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int [] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = scn.nextInt();
        }
        
        //logic
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        if(A[i] > B[j]){
            arr.add(B[j]);
            j++;
        }
        else{
            arr.add(A[i]);
            i++;
        }
        
        while(i < n && j < m){
           int lastVal = arr.get(arr.size()-1);
            
            if(A[i] > B[j]){
                if(B[j] != lastVal){
                    arr.add(B[j]);
                }
                j++;
            }else{
                if(A[i] != lastVal){
                    arr.add(A[i]);
                }
                
                i++;
            }
        }
        
        while(i < n){
             int lastVal = arr.get(arr.size()-1);
            if(lastVal != A[i]){
                arr.add(A[i]);
              
            }
              i++;
        }
         while(j< m){
             int lastVal = arr.get(arr.size()-1);
            if(lastVal != B[j]){
                arr.add(B[j]);
              
            }
              j++;
        }
        
        
        for(int ele : arr){
            System.out.print(ele + " ");
            
        }
        
    }
}
