package StreamApi;
import java.sql.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> surNames = Stream.of("Andrushko", "Bulavin", "Gents","Andrushko", "Bulavin", "Gents",
                "Andrushko", "Bulavin", "Gents","Andrushko", "Bulavin", "Gents").toList();
        List<String> stream = surNames.stream()
                .collect(Collectors.toMap(str -> str, str -> str./*?думав_2_дня_і_не_придумав?*/));



        List<Integer> numbers = Arrays.asList(2, 3, 4, 4, 45, 6, 7, 8);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}

