import java.util.Stack;
public class Output extends Processing{

    public void printAverage(Stack<Integer> numbers){
        Processing processing = new Processing();

        int totalAverage = processing.average(numbers);

        System.out.println("The total average of the numbers listed is: "+totalAverage);
    }
}
