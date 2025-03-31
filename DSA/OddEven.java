public class OddEven {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(findUnique(arr));

    }
    static void oddEven(int n) {
        if((n&1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
//        System.out.println(n.charAt(n.length()-1));
    }

    static int findUnique(int[] arr){
        int unique = 0;

        for (int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
