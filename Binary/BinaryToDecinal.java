package Binary;



public class BinaryToDecinal {
    public static int BinaryConvToDec(int bin){
        int i = 0;
        int sum = 0;
        while (bin != 0) {
            int rem = bin % 10;
            if(rem == 0){
                i++;
            }
            else{
                sum += Math.pow(2, i);
                i++;
            }
            bin /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int binaryo = 101;
        int ans = BinaryConvToDec(binaryo);
        System.out.print(ans);
    }
}
