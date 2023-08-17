package StreamApi;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> surNames = Stream.of("Andrushko", "Bulavin", "Gents","Andrushko", "Bulavin", "Gents",
                "Andrushko", "Bulavin", "Gents","Andrushko", "Bulavin", "Gents","Pavlenko","Pavlenko","Pavlenko","Andrushko", "Bulavin", "Gents","Andrushko", "Bulavin").toList();
        Map<String, Long> result = surNames.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);


        List<Integer> numbers = Arrays.asList(2, 3, 4, 4, 45, 6, 7, 8);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}

