package com.dev;

import java.util.Scanner;

public class No2562_최댓값 {


    public static void main(String[] args) {
    /*
    최댓값 (2562번)
    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
    1 초	128 MB	15776	8960	8246	58.111%
    문제
    9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

    예를 들어, 서로 다른 9개의 자연수

    3, 29, 38, 12, 57, 74, 40, 85, 61

    이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

    입력
    첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

    출력
    첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

    예제 입력 1
    3
    29
    38
    12
    57
    74
    40
    85
    61
    예제 출력 1
    85
    8

     */
        go();
    }

    public static void go(){
        Scanner sc = new Scanner(System.in);
        int max=0;
        int idx=0;
        int cur = 0;
        for(int x=0; x<9; x++){
            cur = sc.nextInt();
            if(cur > max) {
                max = cur;
                idx = x+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
