import java.util.Scanner;

public class TaskEight {
    public TaskEight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int silnia = 1;
        if (num >= 0) {
            for (int i = 1; i <= num; i = i + 1) {
                silnia = silnia * (i);
                System.out.println(silnia);
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}