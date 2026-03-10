package Task2;

import java.util.ArrayList;
import java.util.List;

import static Task2.Main2.*;

public class Main22 {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Alice", "Bob", "Eve", "Charlie");
        List<String> emptyList = new ArrayList<>();
        System.out.println(firstOrNull(names));
        System.out.println(firstOrNull(emptyList));

        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println(sum(numbers));

        List<Integer> numbers2 = new ArrayList<>();
        addDefaultIds(numbers2);
        System.out.println(numbers2);
    }
}
