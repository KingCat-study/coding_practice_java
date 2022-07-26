package inflearn.java_algorithm_solving.chapter_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

예시 출력 1

155
 */
public class TwoDemensionGridSum_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] twoDeGrid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDeGrid[i][j] = sc.nextInt();
            }
        }

        int answer;
        int diagonalSum1 = 0, diagonalSum2 = 0;
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            diagonalSum1 = diagonalSum1 + twoDeGrid[i][i];
            diagonalSum2 = diagonalSum2 + twoDeGrid[i][n - i - 1];
            ar.add(diagonalSum1);
            ar.add(diagonalSum2);

            int sum = 0;
            int sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum2 = sum2 + twoDeGrid[i][j];
                sum = sum + twoDeGrid[j][i];
            }
            ar.add(sum);
            ar.add(sum2);
        }
        answer = Collections.max(ar);
        System.out.println(answer);
    }
}
