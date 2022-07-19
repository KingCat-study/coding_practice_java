package inflearn.java_algorithm_solving.chapter_2;

import java.util.Scanner;

public class VisibleStudent_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 1;
        int[] students = new int[count];


        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();
        }

        int maximum = students[0];

        for (int i = 1; i < students.length; i++) {
            if(maximum < students[i]) {
                maximum = students[i];
                answer++;
            }

        }

        System.out.println(answer);
    }
}
