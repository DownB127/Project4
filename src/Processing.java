import java.util.Stack;
public class Processing {

    public Integer average(Stack<Integer> numbers) {
        int i = 0;
        int total = 0;
        int average = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            if (numbers.isEmpty()) {
                average = total / i;
                keepGoing = false;
            } else {
                i = i + 1;
                int nextNumber = numbers.peek();
                total = total + nextNumber;
                numbers.pop();
            }
        }
        return average;
    }

}
