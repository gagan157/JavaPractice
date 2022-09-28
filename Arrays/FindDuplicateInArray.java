package Arrays;

import java.util.*;

public class FindDuplicateInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer>  hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        
        
        for(int i = 0; i < n; i++){
            
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                int val = hm.get(arr[i]);
                val++;
                hm.put(arr[i],val);
            }
            
        }
        
        for (Map.Entry<Integer, Integer> e : hm.entrySet()){
            int val = e.getValue();
            if(val > 1){
                ar.add(e.getKey());
            }
        }
        Collections.sort(ar);
        if(ar.isEmpty()){
            ar.add(-1);
            return ar;
        }
        return ar;
            
    }
    public static void main(String[] args) {
        int arr[] = {};
        ArrayList<Integer> ans = duplicates(arr, 5);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
        }
    }
}
