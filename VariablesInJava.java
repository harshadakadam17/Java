public class VariablesInJava {

    public static String name = "Harshada"; // Static Variable
    int rollno = 73; // Instance Vaiable

    public void show() {
        String stream = "IT";// Local variables
        System.out.println("Static Variable :" + name);
        System.out.println("Instance Vaiable :" + rollno);
        System.out.println("Local variables :" + stream);
    }

    public static void main(String[] args) {

        VariablesInJava variables = new VariablesInJava();
        variables.show();

    }
}
