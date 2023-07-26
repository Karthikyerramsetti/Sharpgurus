public class SequenceCalculator3 {

    public static double calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1.0;
            }
    
            double factorial = 1.0;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
    
            return factorial;
        }
    
        public static double calculateSequenceSum(int n) {
            double sum = 0.0;
            for (int i = 0; i <= n; i++) {
                sum += 1.0 / calculateFactorial(i);
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int n = 5; // Replace this with the desired number of terms in the sequence
            double sum = calculateSequenceSum(n);
            System.out.println("Sum of the sequence: " + sum);
        }
    }
