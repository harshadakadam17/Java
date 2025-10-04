public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb); // Hello World

        sb.insert(5, " Java");
        System.out.println(sb); // Hello Java World

        sb.replace(6, 10, "C++");
        System.out.println(sb); // Hello C++ World

        sb.delete(5, 9);
        System.out.println(sb); // Hello World

        sb.reverse();
        System.out.println(sb); // dlroW olleH
    }
}
