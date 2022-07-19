package inflearn.java_algorithm_solving.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInBiggestDigit_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print(arr.get(0) + " ");

        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i-1) < arr.get(i)) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
