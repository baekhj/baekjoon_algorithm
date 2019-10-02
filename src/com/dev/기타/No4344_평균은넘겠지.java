package com.dev.기타;

import java.io.*;

public class No4344_평균은넘겠지 {

    public static void main(String[] args) throws IOException {
        /*
평균은 넘겠지 (4344번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	45833	16955	14837	38.601%
문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

예제 입력 1
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
예제 출력 1
40.000%
57.143%
33.333%
66.667%
55.556%
         */
        go();
        //go2();  //최초 방식
    }

    public static void go() throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int n = Integer.parseInt(br.readLine());
        String[] arr = null;
        Double sum = 0.0;
        Double avg = 0.0;
        int avgOverCnt = 0;
        for(int x=0; x < n; x++){
            arr = br.readLine().split(" "); sum = 0.0; avg = 0.0; avgOverCnt = 0;
            for(int y=1; y < Integer.parseInt(arr[0])+1; y++) sum+=Double.parseDouble(arr[y]);
            avg = sum/Integer.parseInt(arr[0]);
            for(int y=1; y < Integer.parseInt(arr[0])+1; y++) if(Double.parseDouble(arr[y]) > avg) avgOverCnt++;
            bw.write(String.format("%.3f",Math.round(avgOverCnt/Double.parseDouble(arr[0])*100*1000)/1000.0)+"%\n");
        }
        bw.flush();
    }

    public static void go2() throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int n = Integer.parseInt(br.readLine());
        int c=0;    //사람수
        int s=0; //합계
        int avg=0;  //평균값
        double overUserCnt = 0;    //평균이상 학생수
        String[] a = null;
        for(int x=0; x<n; x++){
            a = br.readLine().split(" ");
            c = a.length-1;   overUserCnt = 0; s=0;
            for(int y=1; y<a.length; y++) s+= Integer.parseInt(a[y]);
            avg = s/c;
            for(int y=1; y<a.length; y++) if(Integer.parseInt(a[y]) >avg) overUserCnt++;
            bw.write( String.format("%.3f",(Math.round(((overUserCnt/c)*100)*1000.0)/1000.0))+"%\n");
        }
        bw.flush();
    }

}

