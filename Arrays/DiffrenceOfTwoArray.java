package Arrays;

import java.util.ArrayList;

public class DiffrenceOfTwoArray {
    public static ArrayList<Integer> subTwoArrays(int arr1[],int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int end1 = arr1.length-1;
        int end2 = arr2.length-1;

        // if(arr2.length > arr1.length){
           int sum = 0;
           while (end1 >= start || end2 >= start) {
                int num1 = 0;
                int num2 = 0;
                if(end1 >= start){
                    num1 = arr1[end1];
                }
                if(end2 >= start){
                    num2 = arr2[end2];
                }
                if(arr2.length > arr1.length){

                    if(num2 < num1){
                        num2 += 10;
                        arr2[end2-1] -= 1; 
                    }
                    sum = num2 - num1;
                }
                else{
                    if(num1 < num2){
                        num1 += 10;
                        arr1[end1-1] -= 1; 
                    }
                    sum = num1 - num2;
                }
                // if(sum != 0){

                    list.add(0, sum);
                // }

                end1--;
                end2--;
           }
        // }



        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {4,0,2};
        int arr2[] = {3,0,2}; 

        ArrayList<Integer> ans = subTwoArrays(arr1, arr2);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
