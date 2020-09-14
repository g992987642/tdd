
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MommifierTest {
    @Test
    void test_number_of_vowels_are_more_than_30(){
        Mommifier mommifier = new Mommifier();
        String vowelSpercentageOver30="keep";
        String changedStrings=mommifier.changedStringsAccordingVowels(vowelSpercentageOver30);
        Assertions.assertEquals("kemommyep",changedStrings);
    }
}
