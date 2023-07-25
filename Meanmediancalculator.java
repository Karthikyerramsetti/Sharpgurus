import java.util.Arrays;
import java.util.Scanner;
public class Meanmediancalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the vector: ");
int n = scanner.nextInt();
int[] vectorA = new int[n];
    System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < n; i++) {
            vectorA[i] = scanner.nextInt();
        }
double mean = calculateMean(vectorA);
double median = calculateMedian(vectorA);
System.out.println("Mean: " + mean);
System.out.println("Median: " + median);
scanner.close();
    }
public static double calculateMean(int[] vector) {
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        return (double) sum / vector.length;
    }
    public static double calculateMedian(int[] vector) {
        Arrays.sort(vector);
        if (vector.length % 2 == 0) {
            int mid1 = vector.length / 2 - 1;
            int mid2 = vector.length / 2;
            return (double) (vector[mid1] + vector[mid2]) / 2;
        } else {
            int mid = vector.length / 2;
            return vector[mid];
        }
    }
}
