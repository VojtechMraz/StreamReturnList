import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> numbers = List.of(-5, 3, 2, -8, 0, 7, -1);
        List<Integer> positiveNumbers = positive(numbers);
        
        System.out.println("Positive numbers: " + positiveNumbers);
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                      .filter(number -> number > 0)
                      .collect(Collectors.toCollection(ArrayList::new));
    }

}
