package com.dev;

import java.util.*;

public class No9498 {
    public static void main(String[] args) {
        /*
시험 성적 (9498번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	55433	32971	29815	61.488%
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

예제 입력 1
100
예제 출력 1
A
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/10>= 9) System.out.println("A");
        else if(n/10>= 8) System.out.println("B");
        else if(n/10>= 7) System.out.println("C");
        else if(n/10>= 6) System.out.println("D");
        else System.out.println("F");
    }
}







