package com.dev.사칙연산;

import java.io.*;

public class No11022_A더하기B_8 {

    public static void main(String[] args) throws IOException {
        /*
A+B - 8  알고리즘분류 : 그리디알고리즘 / 동전교환
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	13609	10013	9401	75.160%
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

예제 입력 1
5
1 1
2 3
3 4
9 8
5 2
예제 출력 1
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
Case #3: 3 + 4 = 7
Case #4: 9 + 8 = 17
Case #5: 5 + 2 = 7
         */
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int cnt = Integer.parseInt(br.readLine());
        String[] arr = null;
        for(int x=1; x <= cnt ; x++){
            arr = br.readLine().split(" ");
            bw.write( "Case #"+x+": "+arr[0]+" + "+arr[1]+" = "+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))+"\n");
        }
        bw.flush();
    }

}

