import java.util.Scanner;
import java.util.Stack;
public class Input {

    public static Object stackSetup() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("How many numbers do you want to input?");
        int maxSize = scanner.nextInt();
        Object[] numbers = new Object[maxSize];
        int size = 0;

        for (int i = 0; i < maxSize; i++) {
            System.out.println("Enter in the number: ");
            int nextPush = scanner.nextInt();
            numbers[size++] = nextPush;
        }
    return numbers;
    }
}
