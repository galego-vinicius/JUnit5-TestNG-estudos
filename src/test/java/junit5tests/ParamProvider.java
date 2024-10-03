package junit5tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    // Classe de teste estiver em classe separada de Classe de método -> utilizar o "static"
    static Stream<Arguments> sourceStream_StringDouble(){
        return  Stream.of(arguments("apple", 8.9),
                arguments("pear", 1.9));
    }
}
