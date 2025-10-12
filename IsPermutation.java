
public class IsPermutation {

    public static boolean CheckPermuation(String string1, String string2) {

        if (string1.length() != string2.length()) 
            return false;
        

        char x;
        int[] arr = new int[256];
        int length = string1.length();
        int i;

        for (i = 0; i < length; i++) {
            x = string1.charAt(i);
            arr[x]++;

            x = string2.charAt(i);
            arr[x]--;
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            } 
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(CheckPermuation("ABCd", "BCA"));

    }
}
