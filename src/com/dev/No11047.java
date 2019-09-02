package com.dev;

import java.io.*;
import java.util.*;

public class No11047 {

    public static void main(String[] args) throws IOException {
        /*
동전 0
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	17655	9774	7979	55.918%
문제
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력
첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

예제 입력 1
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
예제 출력 1
6
예제 입력 2
10 4790
1
5
10
50
100
500
1000
5000
10000
50000
예제 출력 2
12
         */
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        String[] fir = br.readLine().split(" ");
        int n = Integer.parseInt(fir[0]);    //동전 가지 수
        int k = Integer.parseInt(fir[1]);    //필요한 합
        Integer[] arr = new Integer[n];
        int i=0;    //현재 동전 갯수
        int r = 0;  //필요한 동전 갯수
        for(int x=0; x < n; x++) arr[x] = Integer.parseInt(br.readLine());
        Arrays.sort(arr, Collections.reverseOrder());
        for(Integer a: arr) {
            i = k/a;
            r+=i;
            k -= i*a;
        }
        bw.write(r+"");
        bw.flush();
    }

}

