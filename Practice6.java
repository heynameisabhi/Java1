import java.util.Scanner;

public class SimpleChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of children: ");
        int n = sc.nextInt();

        
        int[] ages = new int[n];
        System.out.println("Enter the ages of the children:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Everyone gets at least 1 chocolate
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = 1;
        }

        /


        for (int i = 1; i < n; i++) {
            if (ages[i] > ages[i - 1]) {
                chocolates[i] = chocolates[i - 1] + 1;
            }
        }

        
        for (int i = n - 2; i >= 0; i--) {
            if (ages[i] > ages[i + 1]) {
                if (chocolates[i] <= chocolates[i + 1]) {
                    chocolates[i] = chocolates[i + 1] + 1;
                }
            }
        }

        // Calculate total chocolates
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += chocolates[i];
        }

        // Output result
        System.out.println("Minimum chocolates needed: " + total);
    }
}
