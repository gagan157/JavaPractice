public class GCD {
    public static int gcd(int a,int b) {
        if(b == 0)
            return a;
        return gcd(b,a%b);    
    }

    public static void gcdUsingloop(int a,int b) {
        while (a != 0 || b!= 0) {
            if(a == b){
                System.out.println(b);
                break;
            }
            if(a>b){
                a = a-b;
            }
            else if(b>a){
                b = b-a;
            }
        }
        
    }
    public static void main(String[] args) {
       gcdUsingloop(36,60);
       
    }
}
