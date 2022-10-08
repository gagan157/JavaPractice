package Arrays;
import java.util.*;


public class SumOfTwoArrays {
    public static ArrayList<Integer> sumOftwoArrays(int arr1[],int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int arr1end = arr1.length-1;
        int arr2end = arr2.length-1;

        int carry = 0;
        while (arr2end >= start || arr1end >= start) {
            int arr1num = 0;
            int arr2num = 0;
            int sum = 0;
            if(arr2end >= start){
                arr2num = arr2[arr2end];
            }
            if(arr1end >= start){
                arr1num = arr1[arr1end];
            }

            sum = arr1num + arr2num + carry;
          
           
            int  rem = sum % 10;
            carry = sum/10;
            

            list.add(0,rem);

            arr2end--;
            arr1end--;
        }


        return list;
    }
    public static void main(String[] args) {

        int arr1[] = {3,1,0,7,5};
        int arr2[] = {5,5,5,5,5,5,5};

        ArrayList<Integer> ans = sumOftwoArrays(arr1, arr2);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
