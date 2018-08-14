import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        Math.random(numbers, 50);

        System.out.println("Najmniejsza" + " " + numbers.first());
        System.out.println("Najwieksza" + " " + numbers.last());
        System.out.println("Srednia wynosi:" + " " + Math.average(numbers));
        Set<Integer> average = Math.printNumbers(numbers);
        System.out.println(average);


    }
}
