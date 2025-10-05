package String;
import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter string :"); // show prompt first

        String str = a.nextLine(); // then take input
        str=str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        boolean flag = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;

        }

        if (flag) {
            System.out.println("String is Palindrome");

        } else {
            System.out.println("String is Not Palindrome");
        }

        a.close();
    }
}
