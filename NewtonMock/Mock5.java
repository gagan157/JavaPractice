package NewtonMock;

import java.util.ArrayList;


/*
 Reverse every odd index word in the string.

Test Case 2:

String s = "Saurav Anand is my interviewer today"

output : Saurav dnanA is ym interviewer yadot
 */
/**
 * InnerMock5
 */


public class Mock5 {
    public static String reverseWorld(String str){
       
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[i] = ""+ch;
        }

       int i = 0;
       int end = arr.length-1;
       while (i <= end) {

            String temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            i++;
            end--;
       }
    //    for (int j = 0; j < arr.length; j++) {
    //         System.out.print(arr[j]);
    //    }
    //    System.out.println();
       String newstr = "";
       for (int j = 0; j < arr.length; j++) {
            String ch = arr[j];
            newstr += ch;
       }
    //    System.out.println(newstr);
       return newstr;
    }
    public static void reverseStringOdd(ArrayList<String> arr){
        
        for (int i = 0; i < arr.size(); i++) {            
            if(i % 2 != 0){
                String str = arr.get(i);
                String newstr = reverseWorld(str);
                arr.set(i, newstr);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "Saurav Anand is my interviewer today";
        ArrayList<String> arr = new ArrayList<>();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch  =  str.charAt(i);
            if(ch != ' '){
                newstr += ""+ch;
            }
            else{
                arr.add(newstr);
                newstr = "";
            }

        }
        arr.add(newstr);        
        reverseStringOdd(arr);
    }



}
