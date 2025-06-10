import m01.Module01;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

// Todo: Add JDoc for class
public class Module01Test {
    // Challenge 1 Tests

    @Test
    public void challenge1_strIsEmpty_emptyString() {
        String expected = "";
        String actual = Module01.challenge1("");

        assertEquals(expected, actual);
    }

    @Test
    public void challenge1_strIsNormalSentence_camelCasedString() {
        String expected = "goodMorningWorldItsAGreatDayToday";
        String actual = Module01.challenge1("Good morning, world! It's a great day today!");

        assertEquals(expected, actual);
    }

    @Test
    void challenge1_strHasRandomSpacesAndRandomCasesAndRandomNumbers_stringWithCharacters() {
        String expected = "f4zeCl4nIsAwes0me";
        String actual = Module01.challenge1("F4Ze Cl4n iS AwEs0mE!$!$!");

        assertEquals(expected, actual);
    }

    // Challenge 2 Tests

    @Test
    void challenge2_numberListIsEmpty_stringSayingNothingToCalculate() {
        String expected = "Nothing to calculate...";
        ArrayList<Integer> input = new ArrayList<>();
        String actual = Module01.challenge2(input);

        assertEquals(expected, actual);
    }

    @Test
    void challenge2_numberListHasOneNumber_stringThatContainsEqualsButNoPlusSigns() {
        String expected = "10 = 10";
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        String actual = Module01.challenge2(input);

        assertEquals(expected, actual);
    }

    @Test
    void challenge2_numberListHasManyNumbers_stringThatContainsAllNumbersAndSum() {
        String expected = "40 + 10 + 2 + 3 = 55";
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(40, 10, 2, 3));
        String actual = Module01.challenge2(input);

        assertEquals(expected, actual);
    }

}
