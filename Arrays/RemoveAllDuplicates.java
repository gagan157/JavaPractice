package Arrays;

import java.util.HashMap;
import java.util.HashSet;

//1.using new array | only work sorted array
//2.using same array but return j size; | only work sorted array
//3.using hashset
//4.using hashmap
public class RemoveAllDuplicates {

    public static void printArray(int arr[],int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static  int[] solution1(int[]arr) {
        int temp[] = new int[arr.length];

        int j=0;
        for (int i = 0; i < temp.length-1; i++) {
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j] = arr[arr.length-1];
        return temp;
    }

    //need sorting array 
    public static int solution2(int[]arr) {
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1]; 
        return j;
    }

    public static void solution3(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (Integer integer : hs) {
            System.out.print(integer+" ");
        }
    }

    public static void solution4(int[]arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
            }
            else{
                int val = hm.get(arr[i]);
                val++;
                hm.put(arr[i], val);
            }
        }

        hm.forEach((k, v)
                       -> System.out.println(k));

    }
    public static void main(String[] args) {
        int[] arr = {2,5,2,3,3,1};

        // int[] newarr = solution1(arr);

        // int size = solution2(arr);
        
        int ans = solution2(arr);
        printArray(arr,ans);

        // solution4(arr);

    }
}
