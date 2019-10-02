package com.dev.사칙연산;

import java.util.*;

public class No10430_나머지 {
    public static void main(String[] args) {
        /*
나머지 (10430번) - 알고리즘 분류 : 사칙연산 / 나머지연산
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	56121	33669	30983	61.377%
문제
(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

예제 입력 1
5 8 4
예제 출력 1
1
1
0
0
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println((a%c+b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c*b%c)%c);
    }
}







