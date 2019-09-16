package com.dev;

import java.io.*;
import java.util.Scanner;

public class No11720_숫자의합 {

    public static void main(String[] args) throws IOException {
        /*
숫자의 합
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	54514	24165	21039	46.952%
문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.

예제 입력 1
1
1
예제 출력 1
1
예제 입력 2
5
54321
예제 출력 2
15
예제 입력 3
25
7000000000000000000000000
예제 출력 3
7
예제 입력 4
11
10987654321
예제 출력 4
46
         */

        go();
        go2();  //최초작성

    }

    public static void go() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = sc.next().split("");
        int res = 0;
        for(String a:arr) res += Integer.parseInt(a);
        System.out.println(res);
    }

    public static void go2() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        String n = br.readLine();
        String[] l = br.readLine().split("");
        int r=0;
        for(int x=0; x<l.length; x++) r+= Integer.parseInt(l[x]);
        bw.write(r+"");
        bw.flush();
    }

}

