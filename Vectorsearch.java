import java.util.Scanner;
public class Vectorsearch{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the vector: ");
    int size = scanner.nextInt();
    int[] vector = new int[size];
    System.out.println("Enter the elements of the vector:");
    for (int i = 0; i < size; i++) {
        vector[i] = scanner.nextInt();
    }
    System.out.print("Enter the element to search: ");
    int elementToSearch = scanner.nextInt();
    int foundIndex = searchElement(vector, elementToSearch);
    if (foundIndex != -1) {
        System.out.println("Element " + elementToSearch + " found at index " + foundIndex);
    } else {
        System.out.println("Element not found in the vector.");
        }
    scanner.close();
    }
    public static int searchElement(int[] vector, int target) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
