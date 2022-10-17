package NewtonMock;

import java.util.*;

public class Mock4 {
    public static void removeDupEle(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i]) && arr[i] > 0){
                set.add(arr[i]);
            }
        }

        // print Array
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
        System.out.println();
        //find second largest value
        // int fisrtmax = Integer.MIN_VALUE;

        // for (Integer integer : set) {
        //     if(integer > fisrtmax){
        //         fisrtmax = integer;
        //     }
        // }

        // int secondmax = Integer.MIN_VALUE;
        // for (Integer integer1 : set) {
        //     if(integer1 > secondmax && integer1 != fisrtmax){
        //         secondmax = integer1;
        //     }
        // }
        // System.out.println();
        
        Queue<Integer> qp = new PriorityQueue<>(Comparator.reverseOrder());
        int largestelement = 3;
        for (Integer integer : set) {
            qp.offer(integer);
        }
        
        for (int i = 0; i < largestelement-1; i++) {
            qp.poll();
        }
        
        System.out.println("second max value = "+qp.peek());
        

    }

    //NewtonSchool

    public static void findIndex(String str,char fstr) {       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == fstr){
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // removeDupEle(arr);

        String str = sc.next();
        char fstr = 's';
        findIndex(str,fstr);
        sc.close();
    }
}
