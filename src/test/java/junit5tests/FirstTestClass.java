package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    // acessModifier returnType nameOfMethod (params){}
    public void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1 - TC1 - this method is the second one")
    public void secondMethod(){
        System.out.println("This is the second test method");
    }

}
