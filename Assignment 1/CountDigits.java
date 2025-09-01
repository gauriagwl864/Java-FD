public class CountDigits {
    public static void main(String[] args) {
        int number = 98765;  // You can change this to test other inputs
        int count = 0;

        int temp = number;

        // Loop to count digits
        while (temp != 0) {
            temp /= 10;  // Remove the last digit
            count++;     // Increment count
        }

        // Output the result
        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
