package com.hbc.algorithms;


import com.hbc.algorithms.strings.StringsImplementation;
import com.hbc.algorithms.strings.StringsInterface;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * A set of tests calling the StringsImplementation methods
 */
public class StringsImplementationTest {

    @Test
    public void testWhetherStringsContainUniqueCharsHappyPath()
    {
        StringsImplementation curImpl = new StringsImplementation();
        String stringToTest="foobar";
        boolean result = curImpl.doesStringHaveUniqueChars(stringToTest);
        assert(result);
    }

    @Test
    public void testWhetherStringsContainUniqueCharsUnHappyPath()
    {
        StringsImplementation curImpl = new StringsImplementation();
        String stringToTest="abbde";
        boolean result = curImpl.doesStringHaveUniqueChars(stringToTest);
        assertFalse(result);
    }

    @Test
    public void testWhetherStringsArePermutationsOfEachOtherHappyPath()
    {
        StringsImplementation curImpl = new StringsImplementation();
        String stringToTest="abde";
        String otherStringToTest="baed";
        boolean result = curImpl.decidePermutation(stringToTest, otherStringToTest);
        assert(result);
    }

    @Test
    public void testWhetherStringsArePermutationsOfEachOtherUnHappyPath()
    {
        StringsImplementation curImpl = new StringsImplementation();
        String stringToTest="abdef";
        String otherStringToTest="baedg";
        boolean result = curImpl.decidePermutation(stringToTest, otherStringToTest);
        assertFalse(result);
    }
}
