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
    }
}

/*
 * 1) == → compares references (memory addresses).
 * 
 * 2) .equals() → compares string content/values.
 */