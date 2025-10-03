public class StringInJava {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // new String("Hello") → Always creates a new object in heap, even if the same
        // string exists in the String Pool.
        System.out.println(s1 == s2);// false

        String a1 = "Hello";
        String a2 = "Hello";
        // String Literals ("Hello") → Stored in String Constant Pool. If the same
        // literal already exists, Java reuses the reference.
        System.out.println(a1 == a2); // true

        // it is a String constructor in Java that creates a new string from a part of a
        // character array.

        /*
         * Parameters:
         * 
         * 1) value → the source character array
         * 2) offset → starting index in the array
         * 3) count → number of characters to copy
         */
        char[] arr = { 'H', 'A', 'R', 'S', 'H', 'A', 'D', 'A' };
        String newarr = new String(arr, 0, 4);
        System.out.println(newarr);
    }
}

/*
 * 1) == → compares references (memory addresses).
 * 
 * 2) .equals() → compares string content/values.
 */