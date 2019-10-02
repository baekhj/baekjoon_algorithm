package com.dev.구현;

import java.util.*;

public class No10872_팩토리얼 {
    public static void main(String[] args) {
        /*
팩토리얼
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	18397	10647	9392	58.576%
문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력 1
10
예제 출력 1
3628800
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = go(n);
        System.out.println(result);
    }

    public static int go(int n){
        int result = 1;
        for(int x=1; x<=n; x++) result*=x;
        return result;
    }
}







