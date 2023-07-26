import java.util.Scanner;
public class DivisibleByM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.println("Integers between 1 and " + upperLimit + " divisible by " + m + ":");
        printDivisibleByM(upperLimit, m);

        scanner.close();
    }

    public static void printDivisibleByM(int upperLimit, int m) {
        for (int i = 1; i <= upperLimit; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
    }
}