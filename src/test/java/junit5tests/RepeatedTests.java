package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {
    
    @RepeatedTest(5)
    void firstRepatedMethod(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(value = 3, name = "Running repetitions: {currentRepetition}." +
            " Total is: {totalRepetitions}")
    void secondRepeatedMethod(){
        System.out.println("We are repeating a new test");
    }

    @RepeatedTest(3)
    void thirdRepatedMethod(RepetitionInfo repetitionInfo){
        System.out.println("This code will run at each repetition");
        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 3,
                () -> System.out.println("This code only runs for repetition " + "3"));
    }
}
