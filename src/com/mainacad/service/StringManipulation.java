package com.mainacad.service;

public class StringManipulation {

    //multiplication in column
    public static StringBuilder getColumnMultiplication(int multiplicand, int multiplier) {

        int finalProduct = getMultiplicationResult(multiplicand, multiplier);
        StringBuilder stringBuilderResult = new StringBuilder();
        stringBuilderResult.append(getIndent(multiplicand, finalProduct)).append(multiplicand);
        stringBuilderResult.append("\n").append(getIndent(multiplier, finalProduct)).append(multiplier);


        int lengthOfMultiplier = Integer.toString(multiplier).length();
        int[] digitsOfmultiplier = new int[lengthOfMultiplier];
        int[] intermediateResults = new int[lengthOfMultiplier];
        int modResult = multiplier;
        int actionCounter = 0;


//add intermediate results into array if multiplier > 10
        if (multiplier > 10) {
            stringBuilderResult.append("\n").append(getIndent(multiplicand, finalProduct)).append(getUnderline(multiplicand));
            for (int i = 0; i < intermediateResults.length; i++) {
                digitsOfmultiplier[i] = modResult % 10;
                intermediateResults[i] = getMultiplicationResult(multiplicand, digitsOfmultiplier[i]);
                modResult = modResult / 10;
            }
        }
//append intermediate results to main string
        for (int i = 0; i < intermediateResults.length; i++) {

            if (intermediateResults[i] != 0) {

                stringBuilderResult.append("\n").append(getIndent(intermediateResults[i], finalProduct).delete(0, actionCounter))
                        .append(intermediateResults[i]);

            }
            actionCounter++;
        }
        stringBuilderResult.append("\n").append(getUnderline(finalProduct));
        stringBuilderResult.append("\n").append(finalProduct);


        return stringBuilderResult;

    }
//return multiplication result if operands is != 0

    public static int getMultiplicationResult(int arg1, int arg2) {
        int result = 0;

        if (arg1 != 0 && arg2 != 0) {

            result = arg1 * arg2;
        }

        return result;
    }

    //indent Stringbuilder
    public static StringBuilder getIndent(int multiplier, int finalProduct) {

        StringBuilder indentStringBuilder = new StringBuilder();
        String intermediateProductAsString = Integer.toString(multiplier);
        String finalProductAsString = Integer.toString(finalProduct);
        int indent = finalProductAsString.length() - intermediateProductAsString.length();

        for (; indent > 0; indent--) {
            indentStringBuilder.append(' ');
        }

        return indentStringBuilder;
    }

    //underline StringBuilder
    public static StringBuilder getUnderline(int numUnderline) {

        StringBuilder indentStringBuilder = new StringBuilder();
        int underline = Integer.toString(numUnderline).length();

        for (; underline > 0; underline--) {
            indentStringBuilder.append('-');
        }

        return indentStringBuilder;
    }

   public static int getAnagrammMax(int number1, int number2) {

        int value = 0;
        for (int i = 1000; i <= 9999; i++) {
            for (int j = i; j <= 9999; j++) {
                int value1 = i * j;
                StringBuilder stringBuilder1 = new StringBuilder("" + value1);
                String stringBuilder2 = "" + value1;
                stringBuilder1.reverse();
                if (stringBuilder2.equals(stringBuilder1.toString()) && value < value1) {
                    value = value1;
                }
            }
        }
        return value;
    }

}


