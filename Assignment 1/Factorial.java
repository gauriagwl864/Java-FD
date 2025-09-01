public class Factorial {
    public static void main(String[] args) {
        int N = 5;  
        int fact = 1;

        for (int i = 1; i <= N; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + N + " is: " + fact);
    }
}