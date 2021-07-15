package com.hbc.algorithms.strings;

/**
 * A class to abstract typical operations done on strings, this includes
 * 1) Write a function to check if a string has all unique characters
 * 2) Given two strings write a method to decide if one is a permutation of the other
 * 3) Write a method to replace all spaces in a string with %20, you may assume that the string has sufficient
 * space in the end to hold all the characters
 * 4) Given a string write a function to check if its a permutation of a palindrome
 * 5) There are three edits that can be performed on strings: 1) insert a character 2) remove a character
 * replace a character, given two strings write a function to check if they are one edit or zero edits away
 */
public interface StringsInterface {

    /**
     * Given an input string figure out whether the string has unique characters.
     * @param inputString the string to parse
     * @return a boolean flag indentifying if a string has all unique characters
     */
    public boolean doesStringHaveUniqueChars(String inputString);

    /**
     * Given two strings figure out if one string is a permutation of the other.
     * @param inputStringOne the first string
     * @param inputStringTwo the second string
     * @return a boolean flag deciding whether one string is a permutation of the other
     */
    public boolean decidePermutation(String inputStringOne, String inputStringTwo);

    /**
     * Given a string replace all the spaces in the string with %20 , this assumes that the string
     * has enough spaces to hold the extra characters.
     * @param inputString the string to iterate over.
     * @return
     */
    public String replaceAllSpaces(String inputString);


    /**
     * Given a string determine whether or not its a palindrome
     * @param inputString the string which we need to evaluate
     * @return whether or not the string is a valid palindrome
     */
    public boolean isStringAPalindrome(String inputString);
}
