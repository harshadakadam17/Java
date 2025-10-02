public class MathLibraryExample {
    public static void main(String[] args) {
        int i = 7, j = -9;
        double x = 72.3, y = 0.34;

        // Absolute value
        System.out.println("|" + i + "| = " + Math.abs(i));  // 7
        System.out.println("|" + j + "| = " + Math.abs(j));  // 9

        // Rounding
        System.out.println(x + " rounded = " + Math.round(x));  // 72
        System.out.println(y + " rounded = " + Math.round(y));  // 0

        // Ceiling and Floor
        System.out.println("Ceil of " + x + " = " + Math.ceil(x));   // 73
        System.out.println("Floor of " + x + " = " + Math.floor(x)); // 72

        // Min and Max
        System.out.println("min(" + i + "," + j + ") = " + Math.min(i, j)); // -9
        System.out.println("max(" + i + "," + j + ") = " + Math.max(i, j)); // 7

        // Trigonometry
        double angle = Math.toRadians(45);
        System.out.println("sin(45°) = " + Math.sin(angle)); // 0.7071
        System.out.println("cos(45°) = " + Math.cos(angle)); // 0.7071

        // Exponential and Logarithm
        System.out.println("exp(1) = " + Math.exp(1)); // 2.71828
        System.out.println("log(Math.E) = " + Math.log(Math.E)); // 1

        // Power and Square Root
        System.out.println("pow(2,3) = " + Math.pow(2,3));   // 8
        System.out.println("sqrt(16) = " + Math.sqrt(16));   // 4

        // Random
        System.out.println("Random number: " + Math.random());
    }
}
