import java.util.ArrayList;
import java.util.List;
    
    public class DivisorsGenerator {
    
        public static List<Integer> findDivisors(int n) {
            List<Integer> divisors = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    int pairFactor = n / i;
                    if (pairFactor != i) {
                        divisors.add(pairFactor);
                    }
                }
            }
            return divisors;
        }
    
        public static void main(String[] args) {
            int num = 36;
            List<Integer> result = findDivisors(num);
            System.out.println("Divisors of " + num + ": " + result);
        }
    } 
