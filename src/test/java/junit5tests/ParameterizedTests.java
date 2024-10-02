package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

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

    @ParameterizedTest
    @CsvSource(value = {"steves,rogers", "captain,marvel", "bucky,barnes"})
    void csvSourse_StringString(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,32,true", "captain,21,false", "bucky,5,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }
}
