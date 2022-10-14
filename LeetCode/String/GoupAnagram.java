package LeetCode.String;

import java.util.*;


public class GoupAnagram {
    public static String sortstring(String str){
        int strarr[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            strarr[i] = str.charAt(i);
        }
        Arrays.sort(strarr);
        String newstr = "";
        for(int i=0;i<str.length();i++){
           newstr += strarr[i];
        }
        return newstr;
    }
    public static void groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            String cpystr = sortstring(str);
            if(!map.containsKey(cpystr)){
                List<String> nstr = new ArrayList<>();
                nstr.add(str);
                 map.put(cpystr, nstr);
            }
            else{
                List<String> nstr = map.get(cpystr);
                nstr.add(str);
                map.put(cpystr,nstr);
            } 
           
        }
        List<List<String>> newlist = new ArrayList<List<String>>();
        for (Map.Entry<String,List<String>> entry : map.entrySet())  {

            // System.out.println("Key = " + entry.getKey() + 
            // ", Value = " + entry.getValue()); 
            newlist.add(entry.getValue());
        }

        System.out.println(newlist);
        
    }
    public static void main(String[] args) {
        String arr[]={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(arr);
    }
}
