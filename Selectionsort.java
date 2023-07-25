import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] array = {46, 52, 21, 22, 11};
        System.out.println("Original array: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
