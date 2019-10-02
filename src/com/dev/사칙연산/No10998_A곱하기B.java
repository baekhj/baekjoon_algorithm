package com.dev.사칙연산;

import java.util.*;

public class No10998_A곱하기B {
    public static void main(String[] args) {
        /*
A×B
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	49328	37422	35029	77.034%
문제
두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A×B를 출력한다.

예제 입력 1
1 2
예제 출력 1
2
예제 입력 2
3 4
예제 출력 2
12
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
}







