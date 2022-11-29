package Recusrion;

import java.util.*;

public class SubSequence {
    public static void solution(String name,int i,String newname,ArrayList<String> ans) {
        if(i == name.length()){
            // System.out.println(newname);  
            ans.add(newname);       
            return;
        }
        char currname = name.charAt(i);
        solution(name, i+1,newname+currname,ans);

        solution(name, i+1,newname,ans);
    }

    public static ArrayList<String> solution2(String str) {
        if(str.length() == 0){
            ArrayList<String> sh = new ArrayList<>();
            sh.add("");
            return sh;
        }

        char fstr = str.charAt(0);

        String remstr = str.substring(1);

        ArrayList<String> restr = solution2(remstr);
        
        ArrayList<String> newarr = new ArrayList<>();
        
        for (String string : restr) {
            
            newarr.add(""+string);
            
        }
        for (int i = 0; i <restr.size(); i++) {
            newarr.add(fstr+restr.get(i));
        }
        
        return newarr;
    }
    
    public static void PrintsubSequence(String str,String path,ArrayList<String> ans) {
        if(str.length() == 0){
            // for print
            System.out.println(path);

            // for save data
            // ans.add(path);
            return;
        }

        char fischar = str.charAt(0);
        String latestStr = str.substring(1);
        // System.out.println("got = "+fischar+" rem ="+latestStr);
        PrintsubSequence(latestStr, path+fischar,ans);
        PrintsubSequence(latestStr, path,ans);
    }
    public static void main(String[] args) {
        String name = "abc";
        // ArrayList<String> ans = solution2(name);
        ArrayList<String> ans = new ArrayList<>();
        // solution(name,0,"",ans);   

        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.println(ans.get(i));
        // }

        PrintsubSequence(name, "",ans);
        // System.out.println(ans);
    }
}
