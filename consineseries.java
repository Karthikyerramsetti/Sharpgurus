import java.util.Scanner;
public class consineseries {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of x in degrees: ");
    double xDegrees = scanner.nextDouble();
    double x = Math.toRadians(xDegrees);
    System.out.print("Enter the number of terms to use in the series: ");
    int terms = scanner.nextInt();
    double result = cosineSeries(x, terms);
    System.out.println("cos(" + xDegrees + ") = " + result);
    scanner.close();
        }
        public static double cosineSeries(double x, int terms) {
            double result = 1.0;
            double term = 1.0;
            double sign = -1.0;
    
            for (int i = 1; i < terms; i++) {
                term *= (x * x) / ((2 * i) * (2 * i - 1));
                result += sign * term;
                sign *= -1;
            }
    
            return result;
        }
    }
