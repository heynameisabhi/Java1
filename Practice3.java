public class Practice3 {
    public static void main(String[] args) {
        int a[] = {45,2,75,32,66,70};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
