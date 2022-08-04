package coding_test;

public class CountDayOff {
    public static void main(String[] args) {
        //주 7일
        //휴일 2일
        //평일 5일
        //연차 8일
        // 최소값 27일이면 7일 , 21 ~ 26일이면 6일, 20 일이면 5일 , 14~19일이면 4일, 13일이면 3일, 7~12일이면 2일,

        int n = 27;
        int minimum = 0;
        int maximum = 0;

        long amount = n / 7;
        long week = n % 7;

        System.out.println(amount);
        System.out.println(week);

        System.out.println(amount * 2 + (week - 5 > 0 ? week - 5 : 0));
        System.out.println(amount * 2 + (week < 2 ? week : 2));
    }
}
