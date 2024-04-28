import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Stack<Integer> stack = new Stack<>();
        stack = input.stackSetup();

        Processing processing = new Processing();
        processing.average(stack);


    }
}