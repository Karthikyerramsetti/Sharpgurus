public class SequenceSumCalculator {

        public static double calculateSequenceSum(int n) {
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum += 1.0 / i;
                } else {
                    sum -= 1.0 / i;
                }
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int n = 10; // Replace this with the desired number of terms in the sequence
            double sum = calculateSequenceSum(n);
            System.out.println("Sum of the sequence: " + sum);
        }
    }
