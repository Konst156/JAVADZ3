import java.util.ArrayList;
import java.util.Random;

public class task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println(numbers);
    }
}