package chapter4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindMaxAlgorithmTest {

    FindMaxAlgorithm findMaxAlgorithm;

    @BeforeAll
    void setUp() {
        findMaxAlgorithm = new FindMaxAlgorithm();
    }

    @Test
    void givenTwoElementsArrayThenSuccess(){
        int[] array = {1, 5};

        int max = findMaxAlgorithm.getMax(array);

        assertEquals(5, max);
    }

    @Test
    void givenThreeElementArrayThenSuccess(){
        int[] array = {4, 15, 11};

        int max = findMaxAlgorithm.getMax(array);

        assertEquals(15, max);
    }

    @Test
    void givenFourElementArrayThenSuccess(){
        int[] array = {16, 4, 15, 11};

        int max = findMaxAlgorithm.getMax(array);

        assertEquals(16, max);
    }

}
