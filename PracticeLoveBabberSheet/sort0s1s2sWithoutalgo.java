package PracticeLoveBabberSheet;

import java.util.*;

public class sort0s1s2sWithoutalgo {
    public static void sortWithoutUsiAlogo(int arr[]) {
        List<Integer> lt = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                lt.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                lt.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                lt.add(arr[i]);
            }
        }

        int i=0;
        for (Integer integer : lt) {
            arr[i++] = integer;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,1,2,0,1,0};
        sortWithoutUsiAlogo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
