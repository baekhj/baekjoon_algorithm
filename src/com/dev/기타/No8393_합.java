package com.dev.기타;

import java.util.*;

public class No8393_합 {
    public static void main(String[] args) {
        /*
합
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	42275	30413	27376	73.361%
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.

예제 입력 1
3
예제 출력 1
6
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        while(n > 0){
            r+=n; n--;
        };
        System.out.println(r);
    }
}
