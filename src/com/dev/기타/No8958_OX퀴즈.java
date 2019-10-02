package com.dev.기타;

import java.io.*;

public class No8958_OX퀴즈 {

    public static void main(String[] args) throws IOException {
        /*
OX퀴즈 (8958번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	30268	16197	14233	55.870%
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

예제 입력 1
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
예제 출력 1
10
9
7
55
30
         */

        go();
        go2();  //최초 방식

    }

    public static void go() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int n = Integer.parseInt(br.readLine());
        String[] arr = null;
        int sum,j;  //sum : 합계 / j : 현재아이의 점수
        for(int x=0; x < n; x++){
            arr = br.readLine().split(""); sum = 0; j = 0;
            for(int y=0; y < arr.length; y++){
                if(arr[y].equals("O")){
                    j++; sum+=j;
                }else j = 0;
            }
            bw.write(sum+"\n");
        }
        bw.flush();
    }


    public static void go2() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int n = Integer.parseInt(br.readLine());
        String[] a = null;
        int s;
        for(int x=0; x<n; x++){
            s=0;
            a = br.readLine().split("");
            for(int y=0; y<a.length; y++){
                if(y==0 && a[y].equals("O")) a[y]="1";
                else if(y!=0 && a[y].equals("O")) a[y]=(Integer.parseInt(a[y-1])+1)+"";
                else a[y]="0";
            }
            for(int y=0; y<a.length; y++) s+=Integer.parseInt(a[y]);
            bw.write(s+"\n");
        }
        bw.flush();
    }

}

