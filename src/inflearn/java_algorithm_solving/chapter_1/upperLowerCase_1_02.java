package inflearn.java_algorithm_solving.chapter_1;

import java.util.Scanner;

/*
대문자는 소문자로
소문자는 대문자로
입력 : StuDY
출력 : sTUdy
 */
public class upperLowerCase_1_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()) {
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                sb.append(c);
            } else if(Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
