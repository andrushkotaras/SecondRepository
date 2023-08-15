package StreamApi;
import java.sql.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,4,45,6,7,8);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}

