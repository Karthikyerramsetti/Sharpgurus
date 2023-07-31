import java.util.Arrays;
public class Mergeandsort {
public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9};
    int[] arr2 = {2, 4, 6, 8, 10};

    int[] mergedArray = mergeArrays(arr1, arr2);
    int[] sortedArray = sortArray(mergedArray);

     System.out.println("Merged and Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
