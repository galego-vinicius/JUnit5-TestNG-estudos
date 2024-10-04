package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisabledEnableTest {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of" +
            "@DisabledOnOs")
    void secondTest(){
        System.out.println("This is the second test method");
    }

    @Test
    // @DisabledIfSystemProperty(Colocar VM args)
    void thirdTest(){
        System.out.println("This is the third test method");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of" +
            "@DisabledIf")
    void fourthTest(){
        System.out.println("This is the fourth test method");
    }

    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(
                DayOfWeek.MONDAY);
    }

    @Test
    @EnabledOnOs
    void fifthTest(){
        System.out.println("This is the fourth test method");
    }

}
