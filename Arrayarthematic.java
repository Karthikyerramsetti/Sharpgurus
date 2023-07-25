import java.util.Arrays;
public class Arrayarthematic {
public static void main(String[] args) {
    int[] array1 = { 1, 2, 3, 4, 5 };
    int[] array2 = { 6, 7, 8, 9, 10 };
    if (array1.length != array2.length) {
        System.out.println("Arrays must have the same size to perform arithmetic operations.");
            return;
        }
        int[] sumArray = new int[array1.length];
        int[] differenceArray = new int[array1.length];
        int[] productArray = new int[array1.length];
        int[] quotientArray = new int[array1.length];
        int[] remainderArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
            differenceArray[i] = array1[i] - array2[i];
            productArray[i] = array1[i] * array2[i];
            quotientArray[i] = array1[i] / array2[i];
            remainderArray[i] = array1[i] % array2[i];
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(sumArray));
        System.out.println("Difference Array: " + Arrays.toString(differenceArray));
        System.out.println("Product Array: " + Arrays.toString(productArray));
        System.out.println("Quotient Array: " + Arrays.toString(quotientArray));
        System.out.println("Remainder Array: " + Arrays.toString(remainderArray));
    }
}
