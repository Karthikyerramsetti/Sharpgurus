import java.util.Scanner;
public class Leastcommondivisor {
public static int findGCD(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return findGCD(b, a % b);
            }
        }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
    
            scanner.close();
    
            int gcd = findGCD(num1, num2);
    
            System.out.println("The least common divisor of " + num1 + " and " + num2 + " is: " + gcd);
        }
    } 
