package org.example;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(getXO("ox"));
    }

    public static boolean getXO (String str) {
        return letterCount(str, 'o') == letterCount(str, 'x');
    }

    private static int letterCount(String str, char c) {
        char[] charArray = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == c) {
                counter++;
            }
        }
        return counter;
    }
}