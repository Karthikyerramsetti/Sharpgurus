import java.util.Scanner;
public class NumbersReverseSum { 
public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        int reversedNumber = reverseNumber(number);
        int sumOfDigits = sumDigits(number);

        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
