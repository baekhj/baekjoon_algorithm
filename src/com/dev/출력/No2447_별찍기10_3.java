package com.dev.출력;

import java.io.*;

public class No2447_별찍기10_3 {

    public static void main(String[] args) {
        try{
            go();
        }catch (IOException e){e.printStackTrace();}
    }
    /*
    별 찍기 - 10 (2447번) , 알고리즘 분류 : 출력
    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
    1 초	256 MB	9532	5069	3371	51.466%
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
    private static void go() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int N = Integer.parseInt(br.readLine());

        boolean isStar = true;
        for(int i=0; i<N; i++){
            for(int ii=0; ii<N; ii++){
                isStar = true;
                int temp=0;
                for(int iii=3; iii<=N; iii*=3){
                    temp = iii/3;
                    if(i%iii>=temp && i%iii<=temp+temp-1 && ii%iii>=temp &&ii%iii<=temp+temp-1) {
                        isStar = false; break;
                    }
                }
                if(isStar)bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }

        bw.flush();
    }

}
