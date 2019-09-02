package com.dev;

import java.io.*;

public class No2447_2 {

    public static void main(String[] args) throws IOException {
        /*
별 찍기 - 10
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	6659	3800	2369	54.062%
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

        int n = Integer.parseInt(br.readLine());   //항상 3의 제곱꼴  ex) 3. 9. 29....
        int[][] arr = new int[n][n];
        boolean star = true;
        for(int x=0; x <arr.length ; x++){
            for(int y=0; y <arr[x].length ; y++){
                star = true;
                for(int z=1; z <=n ; z*=3){
                    if(((x/z)%3==1 && (y/z)%3==1)) {
                        star = false;
                        break;
                    }
                }
                if(star) bw.write ("*");
                else bw.write (" ");
            }
            bw.write ("\n");
        }
        bw.flush();
    }

}
