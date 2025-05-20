public class strings {
    public static void main(String[] args) {
        // String literals are stored in the string pool
        String s = "Hello";
        String s1 = "Hello";

        // String objects created with 'new' are stored in the heap
        String o = new String("Hello");
        String o1 = new String("Hello");

        // Compares references, returns true because both point to the same string pool object
        System.out.println(s == s1);

        // Compares references, returns false because both are different objects in the heap
        System.out.println(o == o1);

        // Compares references, returns false because 's' is from the pool, 'o' is from the heap
        System.out.println(s == o);

        // Compares values, returns true because both have the same content
        System.out.println(s.equals(o));

        // Compares values, returns true because both have the same content
        System.out.println(o.equals(o1));
    }    
}
