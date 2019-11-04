package com.dev.정렬;

import java.io.*;
import java.util.Arrays;

public class No2750_수정렬하기_2 {
    public static void main(String[] args) throws IOException {
        /*
        수 정렬하기
        문제
        N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

        입력
        첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

        출력
        첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

        예제 입력 1
        5
        5
        2
        3
        4
        1
        예제 출력 1
        1
        2
        3
        4
        5
         */

        go();   //버블정렬

        go2();  //선택정렬
    }


    public static void go() throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        for(int x=0; x < cnt; x++) arr[x] = Integer.parseInt(br.readLine());
        bubbleSort(arr);
        for(int x=0; x < cnt; x++) bw.write(arr[x]+"\n");
        bw.flush();

    }

    public static void go2() throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        for(int x=0; x < cnt; x++) arr[x] = Integer.parseInt(br.readLine());
        selectSort(arr);
        for(int x=0; x < cnt; x++) bw.write(arr[x]+"\n");
        bw.flush();

    }

    //버블정렬
    private static void bubbleSort(int[] arr){
        /*
        [버블정렬]
         - 배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동
         - 위 과정이 1번 처리되는 경우 가장 큰 수가 배열 마지막에 위치 함
         - 다음 탐색부터는 마지막요소는 안해도 됨 ( 그래서 내부에 있는 for문은 arr.length - i 까지만 탐색)
         - 정렬 대상의 n번째 인덱스와 n+1번째 인덱스를 비교하여 큰값을 뒤로 보내는 방법
        */
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int ii = 1; ii < arr.length - i; ii++) {
                if(arr[ii] < arr[ii-1]){
                    temp = arr[ii];
                    arr[ii] = arr[ii-1];
                    arr[ii-1] = temp;
                }

            }
        }
    }


    //선택정렬
    private static void selectSort(int[] arr){
        /*
        [선택정렬]
         - 주어진 데이터 중 최소값을 찾음
         - 최소값을 맨 앞에 위치한 값과 교환
         - 정렬된 데이터를 제외한 나머지 데이터를 같은 방법으로 정렬
         - 시간복잡도 : O(n^2)
         */
        int minVal;
        int minIdx;
        for (int i = 0; i < arr.length; i++) {
            minVal = arr[i]; minIdx = i;
            for (int ii = i+1; ii < arr.length; ii++) {
                if(minVal > arr[ii]) {
                    minIdx = ii;
                    minVal = arr[ii];
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = minVal;
        }
    }

}
