import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task_02 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);

        int min = Collections.min(numbers);
        System.out.println("Min: " + min);

        int max = Collections.max(numbers);
        System.out.println("Max: " + max);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.size();
        System.out.println("Avg: " + avg);
    }
}
