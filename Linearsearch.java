import java.util.Scanner;
public class Linearsearch {
public static int linearSearch(int[] arr, int target) {
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        return i;
                }
            }
        return -1; //
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = { 10, 9, 8, 3, 51, 20, 52, 21 };
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        int index = linearSearch(vector, target);
        if (index != -1) {
        System.out.println("Element found at index: " + index);
        } else {
        System.out.println("Element not found in the vector.");
        }
    
        scanner.close();
        }
    }
