package com.dev;

import java.util.*;

public class No2741 {
    public static void main(String[] args) {
        /*
N 찍기
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	98379	42306	36441	45.320%
문제
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

예제 입력 1
5
예제 출력 1
1
2
3
4
5
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=1; x<=n; x++) System.out.println(x);
    }
}
