import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args){

        List<String> input = Arrays.asList("one", "two", "three", "four", "five");

        long count = input.stream().filter(element -> element.isEmpty()).count();
        System.out.println("number of empty elements is: " + count);
    }
}
