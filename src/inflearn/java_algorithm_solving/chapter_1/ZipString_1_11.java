package inflearn.java_algorithm_solving.chapter_1;

/*
11. 문자열 압축
설명

알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

단 반복횟수가 1인 경우 생략합니다.


입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 압축된 문자열을 출력한다.


예시 입력 1

KKHSSSSSSSE
예시 출력 1

K2HS7E
예시 입력 2

KSTTTSEEKFKKKDJJGG
예시 출력 2

KST3SE2KFK3DJ2G2
 */
public class ZipString_1_11 {
    public static void main(String[] args) {
//        String str = "KKHSSSSSSSE";
//        String result = "K2HS7E";


        //답안 1
        String str = "KSTTTSEEKFKKKDJJGG";
        String result = "KST3SE2KFK3DJ2G2";
        char c = str.charAt(0);
        int d = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(c);

        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)) {
                d++;
            } else {
                c = str.charAt(i);

                if(d > 1) {
                    sb.append(d);
                }

                sb.append(c);

                d = 1;
            }
        }

        if(d > 1) {
            sb.append(d);
        }

        System.out.println(result.equals(sb.toString()));

        //답안 2
        d = 1;
        str = str + " ";
        sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                d++;
            } else {
                sb.append(str.charAt(i));
                if(d > 1) {
                    sb.append(d);
                }
                d = 1;
            }
        }

        System.out.println(sb.toString());
    }
}
