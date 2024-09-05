import java.util.Scanner;

public class TaskSeven {
    public TaskSeven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Must be higher than 0");
            return;
        }
        int a = 0, b = 1;
        System.out.print(a);
        if (num == 1) {
            return;
        }
        System.out.print(", " + b);
        for (int i = 2; i < num; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}