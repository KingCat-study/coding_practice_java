package inflearn.java_algorithm_solving.chapter_1;

import java.util.Scanner;

public class findCharacter_1_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char ch = in.next().charAt(0);

        str = str.toLowerCase();
        char c = Character.toLowerCase(ch);

        int answer = 0;

        for(char x : str.toCharArray()) {
            if(c == x) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
