import java.util.Scanner;
public class Vectorreverse {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the size of the vector: ");
     int size = scanner.nextInt();
     int[] vector = new int[size];
     System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }
        reverseVector(vector);
        System.out.println("Reversed vector:");
        for (int i = 0; i < size; i++) {
            System.out.print(vector[i] + " ");
        }
        scanner.close();
    }
    public static void reverseVector(int[] vector) {
        int start = 0;
        int end = vector.length - 1;
         while (start < end) {
         vector[start] = vector[start] + vector[end];
         vector[end] = vector[start] - vector[end];
         vector[start] = vector[start] - vector[end];
         start++;
         end--;
        }
    }
}
