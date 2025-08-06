
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms to generate: ");
            int input = sc.nextInt();

            int count = 0; 

            for (int i = 1;; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                    count++;
                    if (count == input) {
                        return; 
                    }
                    System.out.print(",");
                }

            }
        }
        
        
    }

}
