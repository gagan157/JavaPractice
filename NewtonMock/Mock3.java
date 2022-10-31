package NewtonMock;
//1,3,4,7,10



// x = 15
public class Mock3 {
    public static void findClosetSum(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;

        int min = Integer.MAX_VALUE;
        int par1 = 0;
        int par2 = 0;
        while (start < end) {
           int sum = arr[start] + arr[end];

           int sub = sum - target;
           if(sub < 0){
             sub *= -1;             
           }
           if(sub < min){
            min = sub;
            par1 = arr[start];
            par2 = arr[end];
           }

           if(sum < target){
            start++;
           }
           else{
            end--;
           }
          
        }

        System.out.print(par1+" "+par2);
    }
    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int target = 54;
        findClosetSum(arr, target);
    }
}
