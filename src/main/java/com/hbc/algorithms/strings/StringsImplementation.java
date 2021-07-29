package com.hbc.algorithms.strings;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public boolean isStringAPalindrome(String inputString) {
        if (inputString.length() == 0 || inputString==null) {
            return false;
        }
        char [] strArray = inputString.toCharArray();
        int startPosition =0;
        int endPosition = strArray.length - 1;
        char startChar = ' ';
        char endChar = ' ';

        while (startPosition <= endPosition) {
            startChar = strArray[startPosition++];
            endChar = strArray[endPosition--];
            if (startChar != endChar && startChar!=' ' && endChar!=' ')
                return false;
        }
        return true;
    }

    @Override
    public boolean isStringPermutationOfAPalindrome(String inputString) {
        if (inputString.length()==0)
            return false;
        char [] charsOfString = inputString.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch: charsOfString) {
            int count = 1;
            if (map.containsKey(ch)) {
                count = map.get(ch);
                count++;
            }
            map.put(ch,count);
        }
        boolean foundOdd = false;
        // return false if more than one odd found
        for (char ch : map.keySet()) {
            int value = map.get(ch);
            if (value % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    @Override
    public boolean oneEditAway(String inputStringOne, String inputStringTwo) {
        return false;

    }
}
