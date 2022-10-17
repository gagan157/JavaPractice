package NewtonMock;
import java.util.*;
public class mock2 {
    public static int findElement(int arr[],int key) {
        int start = 0;
        int end = arr.length-1;

                
        if(arr[end] <= key){
            return end+1;
        }
        // int ans = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
                // ans = mid;
            }
            else{

                end = mid-1;
            }
               
        }
        return start;
    }

    public static void maxOc(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }
        }

        //Element which is occuring most times is:20 having frequency: 4
        int maxelement = 0;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxelement = entry.getKey();
            }
        }
        System.out.print("Element which is occuring most times is: " + maxelement +" having frequency: "+ max);
    }
    public static void main(String[] args) {
        // int arr[] = {2,3,5,7,8,9,11};
        // int key = 1;
        // int ans = findElement(arr,key);
        // System.out.print(ans);

        int arr[] = {10, 10, 10, 20, 30, 20, 10,30, 30,40, 30};
        maxOc(arr);
    }
}
