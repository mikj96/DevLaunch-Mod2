import java.util.Scanner;

public class TaskNine {
    public TaskNine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word");
        String word = sc.nextLine();
        boolean Palindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {

            } else {
                Palindrome = false;
            }

        }
        System.out.println(Palindrome);
    }
}