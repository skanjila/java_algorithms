package com.hbc.algorithms.strings;


import java.util.Arrays;

public class StringsImplementation implements StringsInterface {

    @Override
    public boolean doesStringHaveUniqueChars(String inputString) {
        if (inputString.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i=0;i<inputString.length();i++) {
            int val = inputString.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    @Override
    public boolean decidePermutation(String inputStringOne, String inputStringTwo) {
        if (inputStringOne.length() != inputStringTwo.length())
            return false;
        return sortString(inputStringOne).equals(sortString(inputStringTwo));
    }

    private String sortString(String inputString) {
        char [] content = inputString.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    @Override
    public String replaceAllSpaces(String inputString) {
        return null;
    }
}
