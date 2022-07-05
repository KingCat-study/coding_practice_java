package leatcode;

public class RomanToInteager {
    public static void main(String[] args) {
        String s = "MCDLXXVI";

        System.out.println(romanToInteger(s));
    }

    public static int romanToInteger(String roman) {
        int sum = 0;

        char[] romanToChars = roman.toCharArray();
        int romanLength = romanToChars.length;

        for (int i = 0; i < romanLength; i++) {

            if(i != (romanLength-1) && isTwoChars(new String(romanToChars, i, 2))) {
                sum = sum +  twoChars(new String(romanToChars, i, 2));
                i++;
            } else {
                sum = sum + charToInt(romanToChars[i]);
            }
        }

        return sum;
    }

    public static boolean isTwoChars(String s) {
        boolean result = false;
        switch (s) {
            case "IV" :
            case "IX" :
            case "XL" :
            case "XC" :
            case "CD" :
            case "CM" :
                result = true;
                break;
            default:
                break;
        }
        return result;
    }


    /*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
     */
    public static int charToInt(Character c) {
        int result = 0;

        switch (c) {
            case 'I' :
                result = 1;
                break;
            case 'V' :
                result = 5;
                break;
            case 'X' :
                result = 10;
                break;
            case 'L' :
                result = 50;
                break;
            case 'C' :
                result = 100;
                break;
            case 'D' :
                result = 500;
                break;
            case 'M' :
                result = 1000;
                break;
        }

        return result;
    }

    /*
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    public static int twoChars(String s) {
        int result = 0;

        switch (s) {
            case "IV" :
                result = 4;
                break;
            case "IX" :
                result = 9;
                break;
            case "XL" :
                result = 40;
                break;
            case "XC" :
                result = 90;
                break;
            case "CD" :
                result = 400;
                break;
            case "CM" :
                result = 900;
                break;
            default:
                break;
        }

        return result;
    }
}
