package Program;

public class SequenceSum2 {
 public static double calculateSequenceSum(int n) {
            double sum = 0.0;
            int denominator = 9;
            int sign = 1;
    
            for (int i = 1; i <= n; i++) {
                double term = (double) sign * (double) i / denominator;
                sum += term;
                denominator += 4;
                sign = -sign;
            }
            
            return sum;
        }
    
        public static void main(String[] args) {
            int n = 5; // Replace this with the desired number of terms in the sequence
            double sum = calculateSequenceSum(n);
            System.out.println("Sum of the sequence: " + sum);
        }
    }
