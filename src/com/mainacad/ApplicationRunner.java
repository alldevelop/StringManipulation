package com.mainacad;

import com.mainacad.service.StringManipulation;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {

//multiplication in column
       int multiplicand = 191919;
       int multiplier = 199;
        LOGGER.info("Here you can see the result of multipication in column of 191919 and 199\n" +
                StringManipulation.getColumnMultiplication(multiplicand, multiplier));

// max anagramm of 4-digit product
        int number1 = 1000;
        int number2 = 9999;
        LOGGER.info("Here is Anagramm of 4-digit product: " +
                StringManipulation.getAnagrammMax(number1, number2));


//string reverse
     /*   String original = "ab1c d2 fg4 5 89 90jk6";
        LOGGER.info("Original String looks like: " + original);
        String originalAr = StringManipulationService.reverseOriginal(original);
        LOGGER.info("Letters revers of the String looks like" + originalAr);
*/
    }
}
