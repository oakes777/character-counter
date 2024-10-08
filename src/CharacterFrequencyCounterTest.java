import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test //annotations - extra tag tells testing to treat it different
    void testGetFrequencyCaseSensitivity() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");

        //Act
        int actualCount = counter.getFrequency('s');

        //Assert (I expect to get 3 back)
        assertEquals(3, actualCount);


    }

    @Test
    void testGetFrequencyMissingCharacter() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        //Act
        int actualCount = counter.getFrequency('s');

        //Assert (I expect to get 3 back)
        assertEquals(0, actualCount);


    }

    @Test
    void testGetRelativePercentageMissingCharacter() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");


        //Act
        double actualPercentage = counter.getRelativePercentage('z');

        //Assert
        assertEquals(0.0, actualPercentage, .001);

    }
}
