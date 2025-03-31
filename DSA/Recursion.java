public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));

    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

            int num = fibonacci(n-2) + fibonacci(n-1);
            return num;
    }
}
