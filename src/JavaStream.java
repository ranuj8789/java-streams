import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {

        // squre the number in the array
        List<Integer> intTest = Arrays.asList(1, 2, 3, 4, 5, 8, 6, 12);
        intTest = intTest.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(intTest);

        // find all the string starts with a
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew");
        List<String> str = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(str);

        // capitalize whole string
        List<String> words = Arrays.asList("java", "stream", "api", "lambda");
        words = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(words);
        // find the max number from the solution

        List<Integer> numbers = Arrays.asList(3, 9, 2, 5, 12, 6);
        Integer intResult = numbers.stream().max(Integer::compareTo).get();
        System.out.println(intResult);

        List<Integer> numbers2 = Arrays.asList(5, 3, 9, 1, 7, 2);
        int threshold = 4;
        int result = numbers2.stream()
                .filter(x -> x > threshold)
                .findFirst()
                .get();
        System.out.println(result);

        // sort by length strings
        List<String> wordsTest = Arrays.asList("apple", "banana", "kiwi", "mango", "strawberry");
        System.out.println(wordsTest.stream().sorted((x, y) -> x.length()).collect(Collectors.toList()));

        // find average number
//        List<Integer> numbersCheck = Arrays.asList(1, 2, 3, 4, 5);
//        IntSummaryStatistics intSummaryStatistics = numbersCheck.stream().mapToInt(Integer::intValue).summaryStatistics();
//        intSummaryStatistics.getAverage();
//        intSummaryStatistics.getMax();
//        intSummaryStatistics.getMin();
//        intSummaryStatistics.getSum();

        List<Integer> numbersTest = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbersTest.stream().mapToInt(Integer::intValue).filter(x-> x== ma));
        System.out.println(numbersTest.stream().mapToInt(Integer::intValue).min());
        System.out.println(numbersTest.stream().mapToInt(Integer::intValue).average());

    }
}
