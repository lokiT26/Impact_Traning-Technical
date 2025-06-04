import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create and initialize ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(3, 7); // Insert 7 at index 3
        System.out.println("Initial list: " + nums);

        // 2. Set element at index 3 to 3
        nums.set(3, 3);
        System.out.println("After setting index 3 to 3: " + nums);

        // 3. Access element at index 0
        System.out.println("Element at index 0: " + nums.get(0));

        // 4. Remove element at index 2
        nums.remove(2);
        // nums.remove(Integer.valueOf(5));
        System.out.println("After removing index 2: " + nums);

        // 5. Get size of the list
        System.out.println("Size: " + nums.size());

        // 6. Sort the list
        nums.sort(null); // Sorts in natural order
        System.out.println("Sorted: " + nums);

        // 7. Check if list contains 2
        System.out.println("Contains 2? " + nums.contains(2));

        // 8. Get index of 2
        System.out.println("Index of 2: " + nums.indexOf(2));

        // 9. Add multiple elements
        nums.addAll(Arrays.asList(5, 6, 7));
        System.out.println("After addAll: " + nums);

        // 10. Check if list is empty
        System.out.println("Is empty? " + nums.isEmpty());

        // 11. Ensure capacity (optional)
        nums.ensureCapacity(20);
        System.out.println("Capacity ensured for 20 elements.");

        // 12. Trim to size (optional)
        nums.trimToSize();
        System.out.println("Trimmed to size.");

        // 13. Iterate and print elements
        nums.forEach(n -> System.out.println("Element: " + n));

        // 14. Clear the list
        nums.clear();
        System.out.println("After clear: " + nums);
    }
}
