package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @NullSource //Adiciona um parametro nulo no teste
    @EmptySource //Adiciona um parametro vazio no teste
    @NullAndEmptySource // Adiciona um parametro vazio e um parametro nulo no teste
    @ValueSource(strings = {"firstString", "secondString"})
    void stringsValues(String theParams){
        System.out.println("theParams = " + theParams);
    }
}
