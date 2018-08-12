import java.util.*;

public class Math {


    public static void random(Set<Integer> numbers, int length) {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            numbers.add(rand.nextInt(1000));
        }
        System.out.println(numbers);
    }


    public static int average(Set<Integer> numbers) {
        int length = 0;
        int sum = 0;
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer number = (Integer) iterator.next();
            sum = sum + number;
            length++;
        }

        return sum / length;

    }


    public static Set printNumbers(Set<Integer> numbers) {
        int average = average(numbers);
        Set<Integer> print = new TreeSet<>();
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = (Integer) iterator.next();
            if (number > average) {
                print.add(number);
            }
        }
        return print;
    }

}








