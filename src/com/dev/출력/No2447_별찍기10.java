package com.dev.출력;

import java.io.*;

public class No2447_별찍기10 {

    public static void main(String[] args) throws IOException {
        /*
별 찍기 - 10 (2447번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	8692	4710	3074	52.199%
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N이 주어진다. N은 항상 3의 제곱꼴인 수이다. (3, 9, 27, ...) (N=3k, 1 ≤ k < 8)

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.

예제 입력 1
27
예제 출력 1
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
         */
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int n = Integer.parseInt(br.readLine());    //N => 3의 제곱꼴 (3, 9, 27, ...) (N=3k, 1 ≤ k < 8)
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(isStar(new int[]{x, y}, n)) bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
    private static boolean isStar(int[] a, int n){
        boolean isStar = true;  //별 여부
        int xx = 0; //공백값이 될 기준 Index
        boolean n0 = true;
        boolean n1 = true;
        for(int d = 3; d <= n; d*=3){   //3의 제곱꼴 범위만큼 체크
            n0 = true;  //[0] 공백여부
            n1 = true;  //[1] 공백여부
            xx = d/3;
            for(int x = xx; x <xx+xx; x++){ //xx(공백기준Index 부터 크기만큼 공백 체크)
                if(a[0]%d==x) n0 = false;
                if(a[1]%d==x) n1 = false;
            }
            if(!n0 && !n1){
                isStar = false;break;
            }
        }
        return isStar;
    }

}

