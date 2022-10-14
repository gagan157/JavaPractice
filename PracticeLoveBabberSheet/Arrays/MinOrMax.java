package PracticeLoveBabberSheet.Arrays;



class Pair {
    int max;
    int min;    
}
//Another method = tournament method
public class MinOrMax {
    public static Pair minOrMax(int arr[]) {
        Pair minmax = new Pair();
        if(arr.length == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];

            return minmax;
        }

        if(arr[0] > arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }
            else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }

        return minmax;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = minOrMax(arr);
        System.out.print(minmax.min+" "+minmax.max);
    }
}
