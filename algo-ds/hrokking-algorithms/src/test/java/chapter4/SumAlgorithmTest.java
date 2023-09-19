package chapter4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SumAlgorithmTest {

    SumAlgorithm sumAlgorithm;

    @BeforeAll
    void beforeAll(){
        this.sumAlgorithm = new SumAlgorithm();
    }

    @Test
    void sumEmptyArrayThen0() {
        int[] array = {};

        int sum = sumAlgorithm.sum(array);

        assertEquals(0, sum);
    }

    @Test
    void sumOneElementArrayThenValue() {
        int[] array = {5};

        int sum = sumAlgorithm.sum(array);

        assertEquals(5, sum);
    }

    @Test
    void sumTwoElementArrayThenCorrect(){
        int[] array = {2, 4};

        int sum = sumAlgorithm.sum(array);

        assertEquals(6, sum);
    }

    @Test
    void sumThreeElementArrayThenCorrect(){
        int[] array = {2, 4, 3};

        int sum = sumAlgorithm.sum(array);

        assertEquals(9, sum);
    }

    @Test
    void sumFourElementArrayThenCorrect(){
        int[] array = {2, 4, 3, 11};

        int sum = sumAlgorithm.sum(array);

        assertEquals(20, sum);
    }
}
