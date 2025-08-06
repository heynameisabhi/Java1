public class Practice5 {
    public static void main(String[] args) {
        int input = 10;
        for (int n = 2; n <= input; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    
}
