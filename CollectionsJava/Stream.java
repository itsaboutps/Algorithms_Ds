package CollectionsJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> result = words.stream()       // Source: Creates a stream from the list
            .filter(s -> s.startsWith("a"))       // Intermediate Operation: Filters words starting with 'a'
            .map(String::toUpperCase)             // Intermediate Operation: Converts words to uppercase
            .sorted()                             // Intermediate Operation: Sorts the filtered words
            .collect(Collectors.toList());        // Terminal Operation: Collects the result into a list

        System.out.println(result);               // Output: [APPLE]
    }
}