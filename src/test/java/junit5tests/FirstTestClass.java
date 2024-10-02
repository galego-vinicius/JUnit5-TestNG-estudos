package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Colocando esta anotação, não é necessario utilizar "static" no BeforeAll e BeforeEach
public class FirstTestClass {

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
    // acessModifier returnType nameOfMethod (params){}
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1 - TC1 - this method is the second one")
    void secondMethod(){
        System.out.println("This is the second test method");
    }

}
