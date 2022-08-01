package inflearn.java_algorithm_solving.chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1

3
1 3 5
5
2 3 6 7 9

예시 출력 1

1 2 3 3 5 6 7 9
 */
public class TwoArrayMerge_1 {
    public static void main(String[] args) {

        /* 방법 1
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] firstArray = new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] secondArray = new int[m];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = sc.nextInt();
        }

        int[] result = new int[firstArray.length + secondArray.length];

        int resultIndex = 0;

        for (int i : firstArray) {
            result[resultIndex] = i;
            resultIndex++;
        }

        for (int i : secondArray) {
            result[resultIndex] = i;
            resultIndex++;
        }

        Arrays.sort(result);

        for (int i : result) {
            System.out.print(i + " ");
        }
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] firstArray = new int[n];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] secondArray = new int[m];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        int indexOne = 0;
        int indexTwo = 0;

        while(indexOne < firstArray.length && indexTwo < secondArray.length) {

            if(firstArray[indexOne] < secondArray[indexTwo] ){
                result.add(firstArray[indexOne]);
                indexOne++;
            } else {
                result.add(secondArray[indexTwo]);
                indexTwo++;
            }
        }

        if(indexOne < firstArray.length) {
            for (int i = indexOne; i < firstArray.length; i++) {
                result.add(firstArray[i]);
            }
        }

        if(indexTwo < secondArray.length) {
            for (int i = indexTwo; i < secondArray.length; i++) {
                result.add(secondArray[i]);
            }
        }

        for (int i : result) {
            System.out.print (i + " ");
        }
    }
}
