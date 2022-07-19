package inflearn.java_algorithm_solving.chapter_1;

import java.util.Scanner;

public class findLonggestString_1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int max = 0;
        int longgestIndex = 0;
        String[] splitInput = input.split(" ");

        for (int i = 0; i < splitInput.length; i++) {
            if(max < splitInput[i].length()) {
                max = splitInput[i].length();
                longgestIndex = i;
            }
        }

        System.out.println(splitInput[longgestIndex]);
    }
}
