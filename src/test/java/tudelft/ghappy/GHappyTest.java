package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void testgHappyWithdoubleG() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void testgHappyWithSingleG() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void testgHappyWithDoubleAndSingleG() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxggxxg");
        Assertions.assertFalse(result);
    }
}
