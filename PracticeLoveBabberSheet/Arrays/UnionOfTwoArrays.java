package PracticeLoveBabberSheet.Arrays;

import java.util.*;

public class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0; i<n; i++){
            set.add(a[i]);
        }
        for(int i= 0; i<m; i++){
            set.add(b[i]);
        }
        
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={85, 25, 1, 32, 54, 6};
        int arr2[] = {85, 2 };
        int ans = doUnion(arr, 6, arr2, 2);
        System.out.println(ans);
    }
}
