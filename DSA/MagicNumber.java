public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumber(6));
    }

    public static int magicNumber(int n){
        int sum = 0;
        int base = 5;
        while(n>0){
            int a = n&1;
            n=n>>1;
sum += a*base;
base *= 5;
        }
        return sum;
    }
}
