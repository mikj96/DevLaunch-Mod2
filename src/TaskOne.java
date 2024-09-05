import java.util.Scanner;

public class TaskOne {
    public TaskOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number >0)

        {
            System.out.println("Your number is higher than 0");
        } else

        {
            System.out.println("Your number is lower than 0");
        }
    }
}