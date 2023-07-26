public class Arraydifference {
public static void main(String[] args) {
int[] array = {99, 30, 17, 18, 24, 55};
int[] result = findLargestAndSmallestDifference(array);
System.out.println("Largest Difference: " + result[0]);
System.out.println("Smallest Difference: " + result[1]);
}
public static int[] findLargestAndSmallestDifference(int[] arr) {
    int[] result = new int[2];
    if (arr == null || arr.length < 2) {
    throw new IllegalArgumentException("Array must have at least two elements.");
    }
    int smallest = arr[0];
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
    if (arr[i] < smallest) {
    smallest = arr[i];
    }
    if (arr[i] > largest) {
    largest = arr[i];
    }
    }
    int largestDiff = largest - smallest;
    int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                    int diff = Math.abs(arr[i] - arr[j]);
                    smallestDiff = Math.min(smallestDiff, diff);
                }
            }
         result[0] = largestDiff;
        result[1] = smallestDiff;
    
        return result;
        }
    }      

