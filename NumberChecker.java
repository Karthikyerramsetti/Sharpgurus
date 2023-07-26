import java.util.Scanner;
public class NumberChecker {
public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPerfectFactorial(int number) {
        int factorial = 1;
        int i = 1;

        while (factorial <= number) {
            if (factorial == number) {
                return true;
            }
            i++;
            factorial *= i;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        if (isPerfectFactorial(number)) {
            System.out.println(number + " is a perfect factorial.");
        } else {
            System.out.println(number + " is not a perfect factorial.");
        }
    }
}
