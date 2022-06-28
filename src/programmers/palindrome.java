package programmers;

public class palindrome {

    public static void main(String[] args) {
        int n = 1;
        int m = 100;

        int count = 0;
        for(int i = n; i <= m; i++) {
            String val = String.valueOf(i);
            StringBuilder sb = new StringBuilder(val);

            if(val.equals(sb.reverse().toString())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
