package com.dev.부르트포스;

import java.util.*;

public class No1065_한수 {
    public static void main(String[] args) {
        /*
한수
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	35097	16377	14112	47.249%
문제
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

예제 입력 1
110
예제 출력 1
99
예제 입력 2
1
예제 출력 2
1
예제 입력 3
210
예제 출력 3
105
예제 입력 4
1000
예제 출력 4
144
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        go(n);
        go2(n);
    }

    public static void go(int n){

        int han = 0, gab=0;
        boolean isHan;
        String[] arr;
        for(int x=1; x<=n; x++){
            isHan = true;
            arr = String.valueOf(x).split("");
            if(arr.length>1) gab = Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
            for(int y=1; y<arr.length; y++){
                if(Integer.parseInt(arr[y])-Integer.parseInt(arr[y-1]) != gab) {
                    isHan = false;
                    break;
                }
            }
            if(isHan) han++;
        }
        System.out.println(han);
    }

    private static void go2(int n){ //2019.09.30

        int hanCnt = n<100?n:99;    //99까지는 한수임
        String[] arr;
        int cha;
        boolean isHansu=true;
        for(int x=100;n>99 && x<= n; x++){
            isHansu=true;
            arr = (x+"").split("");
            cha = Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
            for (int y = 2; y < arr.length; y++) {
                if(Integer.parseInt(arr[y])-Integer.parseInt(arr[y-1]) != cha ){
                    isHansu = false; break;
                }
            }
            if(isHansu) hanCnt++;
        }
        System.out.print(hanCnt);
    }
}








