import java.util.ArrayList;
import java.util.HashSet;
public class Deleteduplicatesinvector {
    public static void deleteDuplicates(ArrayList<Integer> vector) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : vector) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                result.add(num);
            }
        }
        vector.clear();
        vector.addAll(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(2);
        vector.add(4);
        vector.add(1);
        vector.add(5);

        System.out.println("Original vector: " + vector);

        deleteDuplicates(vector);

        System.out.println("Vector after removing duplicates: " + vector);
    }
}
