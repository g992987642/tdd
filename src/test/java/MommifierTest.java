
import exception.NullStringsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MommifierTest {
    @Test
    void test_percentage_of_vowels_is_over_30() {
        Mommifier mommifier = new Mommifier();
        String vowelSpercentageOver30 = "keep";
        String changedStrings = mommifier.changedStringsAccordingVowels(vowelSpercentageOver30);
        Assertions.assertEquals("kemommyep", changedStrings);
    }

    @Test
    void test_percentage_of_vowels_is_no_more_than_30() {
        Mommifier mommifier = new Mommifier();
        String vowelSpercentageNoMoreThan30 = "key";
        String changedStrings = mommifier.changedStringsAccordingVowels(vowelSpercentageNoMoreThan30);
        Assertions.assertEquals("key", changedStrings);
    }

    @Test
    void test_strings_is_null() {
        Mommifier mommifier = new Mommifier();
        String nullStrings = null;
        Assertions.assertThrows(NullStringsException.class, () -> {
            mommifier.changedStringsAccordingVowels(nullStrings);
        });
    }

}
