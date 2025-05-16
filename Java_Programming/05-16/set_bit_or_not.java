// Check if the i'th element of a binary number is Set or not.

public class set_bit_or_not {
    public static void main(String[] args) {
        int num = 10; // 1010 in binary
        int index = 2; 

        // boolean isSet = (num & (1 << index)) != 0; // Left shift
        boolean isSet = (1 & (num >> index)) != 0; // Right shift
        System.out.println(isSet); // true (since 2nd bit is 1)
    }
}
