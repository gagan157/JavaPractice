package LeetCode.String;

// import java.util.*;

public class ReverseVowels {
    public static boolean checkvowerl(char ch){
        // char lowch = lowercase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;        
        
        Character arr[] = new Character[s.length()];

        boolean isvowelf = false;
        boolean isvowels = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        
          while(start <= end){
            char first = arr[start];
            char last = arr[end];
            
            if(checkvowerl(first)){               
                isvowelf = true;
            }
            else{
                start++;
            }
            
            if(checkvowerl(last)){
                isvowels = true;
            }
            else{
                end--;
            }
           
            // System.out.println(first+" "+last);
            if(isvowelf == true && isvowels == true){
               
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                            
                start++;
                end--;
                isvowelf = false;
                isvowels = false;
            }  
        }

        
        String newS = "";        
        for(int i=0; i<arr.length; i++){
            newS += arr[i]; 
        }
        return newS;
    }
    public static void main(String[] args) {
        String qus = "Marge, let's \"went.\" I await news telegram.";
        String ans = reverseVowels(qus);
        
        // char ans = lowercase('R');
        System.out.println(ans);
    }
}
