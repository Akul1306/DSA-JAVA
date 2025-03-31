public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 4;
//        for (int i = 0; i <= n; i++) {
//            System.out.println(i + " " + isPrime(i));
//        }
        System.out.println(isPrime1(n));
    }
    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean isPrime1(int n) {
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
