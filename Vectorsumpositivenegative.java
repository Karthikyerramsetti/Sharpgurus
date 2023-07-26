public class Vectorsumpositivenegative {
public static void main(String[] args) {
    int[] vector = { 3, -5, 7, -2, 0, 9, -1 };
    int positiveSum = 0;
    int negativeSum = 0;
    for (int num : vector) {
        if (num > 0) {
            positiveSum += num;
            } else if (num < 0) {
            negativeSum += num;
            }
        }
    System.out.println("Positive sum: " + positiveSum);
    System.out.println("Negative sum: " + negativeSum);
        }
    }
