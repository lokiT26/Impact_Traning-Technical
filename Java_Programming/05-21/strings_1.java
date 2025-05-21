public class strings_1 {
    public static void main(String[] args) {
        // String is immutable: any modification creates a new object
        String s = "Hello";
        System.out.println("Original String: " + s);
        System.out.println("After concat: " + s.concat(" World")); // s is unchanged
        System.out.println("String after concat (original): " + s);

        // StringBuilder is mutable: modifications change the same object
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + sb);

        // append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // delete
        sb.delete(2, 3);
        System.out.println("After delete: " + sb);

        // reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity and length
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        // StringBuilder is mutable and efficient for frequent modifications,
        // while String is immutable and creates new objects on changes.

        // StringBuffer is also mutable like StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("\nStringBuffer after append: " + stringBuffer);

        // StringBuffer is thread-safe (synchronized), while StringBuilder is not
        // Both are mutable and efficient for modifications
    }
}
