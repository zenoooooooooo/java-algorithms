/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.speedcodingpractice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author akira
 */
public class SpeedCodingPractice {

    public static void main(String[] args) {
        String sentence = "Just an example here move along";
        String word = "JAVA";
        //arr = []
        int[] arr = {6, 3, 2, 41, 12};

        reverseString(sentence);
    }

    public static int countWords(String s) {
        int wordsNumber = 0;
        boolean spaceFlag = false;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
        System.out.println(wordsNumber);
        return wordsNumber - 1;
    }

    public static boolean isPalindromePossible(String str) {
        ArrayList<Character> letters = new ArrayList<Character>();
        ArrayList<Integer> numberOfIteration = new ArrayList<Integer>();
        int iteration = 0;
        int doubled = 0;
        int single = 0;
        boolean isRepeated = false;
        boolean isAlreadyRead = false;
        for (int i = 0; i < str.length(); i++) {
            letters.add(str.charAt(i));
        }
        for (int i = 0; i < letters.size(); i++) {
            isRepeated = false;
            isAlreadyRead = false;
            iteration = 0;
            for (int j = 0; j < letters.size(); j++) {
                if (str.charAt(i) == letters.get(j)) {
                    iteration++;
                }
            }
            numberOfIteration.add(iteration);
        }

        for (int i = 0; i < numberOfIteration.size(); i++) {
            if (numberOfIteration.get(i) % 2 == 0) {
                doubled++;
            } else {
                single++;
            }
        }

        if ((single == 1 && doubled % 2 == 0) || (single == 0 && doubled % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEnding(String str1, String str2) {
        ArrayList<Character> letters1 = new ArrayList<Character>();
        ArrayList<Character> letters2 = new ArrayList<Character>();
        int lengthTrue = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            letters1.add(str1.charAt(i));
        }
        for (int i = str2.length() - 1; i >= 0; i--) {
            letters2.add(str2.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if (letters1.get(i) == letters2.get(i)) {
                lengthTrue++;
            }
        }
        if (lengthTrue == letters2.size()) {
            return true;
        }
        return false;
    }

    public static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    
    public static String reverseString(String str) {
        String newStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        
        System.out.println(newStr);
        return newStr;
    }

}
