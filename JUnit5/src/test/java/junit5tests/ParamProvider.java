package junit5tests;

import org.junit.jupiter.params.provider.Arguments;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class ParamProvider {

    // Classe de teste estiver em classe separada de Classe de método -> utilizar o "static"

    static List<String> sourceString() {
        //processing done here
        return Arrays.asList("tomato", "carrot", "cabbage");
    }

    static Stream<String> sourceStringAsStream(){
        return  Stream.of("beetroot", "apple", "apple");
    }

    static List<Arguments> sourceList_StringDouble(){
        //processing
        return Arrays.asList(arguments("tomato",2.0),
                arguments("carrot", 4.5),
                arguments("cabbage", 7.8));
    }

    static Stream<Arguments> sourceStream_StringDouble(){
        return  Stream.of(arguments("apple", 8.9),
                arguments("pear", 1.9));
    }
}
