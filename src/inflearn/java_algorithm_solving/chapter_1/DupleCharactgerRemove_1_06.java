package inflearn.java_algorithm_solving.chapter_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1

ksekkset

예시 출력 1

kset
 */
public class DupleCharactgerRemove_1_06 {
    public static void main(String[] args) {

        String str = "ksekkset";

        /*
        첫번째 답안
        char[] strToChars = str.toCharArray();
        Set<Character> setChars = new HashSet<>();
        List<Character> ar = new ArrayList<>();

        for(char c : strToChars) {
            if(setChars.add(c)) {
                ar.add(c);
            }
        }

        strToChars = new char[ar.size()];

        for (int i = 0; i < ar.size(); i++) {
            strToChars[i] = ar.get(i);
        }

        System.out.println(new String(strToChars));
        */

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
