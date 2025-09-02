import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                int cSq = a * a + b * b;
                int c = (int)Math.sqrt(cSq);
                if (c * c == cSq && c < limit) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }

        scanner.close();
    }
}
