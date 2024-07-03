// !Occurrences of a word in a string
// input: hello papa rajesh singh prashant singh, singh
// output: 2

package CollectionsJava;

import java.util.Arrays;

/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        String source =  "Here is an example. Right here.";
        String word = "here";
        calTheOccurence(source, word);
    }

    private static void calTheOccurence(String source, String word) {

        //todo
        // todo how to write a basic regex
        // todo replaceALl
        // todo stream

        //todo count()

        String cleanedUpString = source.replaceAll("\\.", "");

        int count = (int)(Arrays.stream(cleanedUpString.split(" ")).filter(element -> element.equalsIgnoreCase(word)).count());
        System.out.println("Number of occurences ==> "+ count);

        // now you have words separated by spaces

    }
}