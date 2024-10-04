package junit5tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Colocando esta anotação, não é necessario utilizar "static" no BeforeAll e BeforeEach
public class TaggedTestClass {

    @BeforeAll //Primeiro de toda a classe
    void beforeAll(){
        System.out.println("--This is the before All method");
    }

    @BeforeEach //Primeiro de toda o método
    void beforeEach(){
        System.out.println("----This i the before each method");
    }

    @AfterAll //Ultimo de toda a classe
    void afterAll(){
        System.out.println("--This is the after All method");
    }

    @AfterEach //Ultimo de to-do metodo
    void afterEach(){
        System.out.println("----This is the after each method");
    }

    @Test
    @Tag("sanity")
    // acessModifier returnType nameOfMethod (params){}
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @Tag("sanity")
    @Tag("acceptance")
    @DisplayName("US1 - TC1 - this method is the second one")
    void secondMethod(){
        System.out.println("This is the second test method");
    }


    @Test
    @Tag("acceptance")
    void thirdMethod(){
        System.out.println("this is the third test method");
    }

    @Tag("acceptance")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

}
