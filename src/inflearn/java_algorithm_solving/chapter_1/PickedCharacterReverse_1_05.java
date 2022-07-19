package inflearn.java_algorithm_solving.chapter_1;

/*

설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력


입력 값 : kdj#@kdjg%$#kdjgk@kd$dk

정답 값 : kdd#@kkgj%$#dkgjd@kj$dk

 */
public class PickedCharacterReverse_1_05 {
    public static void main(String[] args) {

        String str = "kdj#@kdjg%$#kdjgk@kd$dk";
        String result = "kdd#@kkgj%$#dkgjd@kj$dk";
        char[] chars = str.toCharArray();

        int firstIndex = 0;
        int lastIndex = chars.length - 1;

        while(firstIndex < lastIndex) {
            if(!Character.isAlphabetic(chars[firstIndex])) {
                firstIndex++;
            } else if(!Character.isAlphabetic(chars[lastIndex])) {
                lastIndex--;
            } else {

                char tmp = chars[firstIndex];
                chars[firstIndex] = chars[lastIndex];
                chars[lastIndex] = tmp;
                firstIndex++;
                lastIndex--;
            }
        }

        String charsToStr = new String(chars);

        System.out.println(charsToStr.equals(result));
    }
}
