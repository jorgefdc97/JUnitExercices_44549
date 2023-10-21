import exercise_2.Numbers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {
    private static Numbers numbers;

    @BeforeAll
    public static void setUp(){
        numbers = new Numbers();
    }

    @ParameterizedTest
    @ValueSource(ints = {7,23,311,487,653,947})
    void isPrimeTest(int number){
        assertTrue(numbers.isPrime(number), "Not a prime number");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,64,2,20,33,26})
    void isEvenTest(int number){
        assertTrue(numbers.isEven(number), "Not an even number");
    }

    @ParameterizedTest
    @ValueSource(ints = {23,69,115,185,207,231})
    void isMultipleTest(int divisor){
        int number = 23;
        assertTrue(numbers.isMultiple(number,divisor), "Is not a multiple of "+number);
    }
}
