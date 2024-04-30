import java.util.Scanner;
import java.util.Stack;
public class Input {


    public Stack<Integer> stackSetup() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("How many numbers do you want to input?");
        int maxSize = scanner.nextInt();


        for (int i = 0; i < maxSize; i++) {
            System.out.println("Enter in the number: ");
            int nextPush = scanner.nextInt();
            stack.push(nextPush);
        }
    return stack;
    }
}
