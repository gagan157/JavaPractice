package Recusrion;

import java.util.ArrayList;

public class CombiofaPhoneNum {
    static String pnum [] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static ArrayList<String> letterCombinations(String num) {
        
        if(num.length() == 0){
            ArrayList<String> re = new ArrayList<>();
            re.add(num);
            return re;
        }


        char firstnum = num.charAt(0);

        String resnum = num.substring(1);
        
        ArrayList<String> rearr = letterCombinations(resnum);

        ArrayList<String> newarr = new ArrayList<String>();
        
        String codech = pnum[firstnum - '0'];
        for (int i = 0; i < codech.length(); i++) {
            char ch = codech.charAt(i);
            for (String rearrs : rearr) {
                newarr.add(ch+rearrs);

            }
        }

        return newarr;
        
    }
    public static void main(String[] args) {
        ArrayList<String> ans = letterCombinations("568");
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
