package LeetCode.String;

class SolutionReverseword {
    public String reverseword(String s){
        String newStr = "";
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }
    
    public String reverseWords(String s) {
        String newReverseWords = "";

        int i=0;
        String [] arrstr = s.split(" ",s.length());
        for (String string : arrstr) {
            String sh = reverseword(string);
            if(i==0 || i==s.length()-1){
                newReverseWords+=sh;
            }
            else{
                newReverseWords = newReverseWords+" "+sh;
            }
            i++;
        }
        return newReverseWords;
        
    }
    
}


public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        SolutionReverseword sr = new SolutionReverseword();
        System.out.println(sr.reverseWords(s)); 
    }
}
