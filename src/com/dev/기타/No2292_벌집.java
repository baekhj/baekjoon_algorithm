package com.dev.기타;

import java.util.Scanner;

public class No2292_벌집 {

    public static void main(String[] args) {
        go();
    }

    /*
    벌집
    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
    2 초	128 MB	28108	12869	11155	46.446%
    문제
    그림(No2292_벌집.png)과 같이 육각형으로 이루어진 벌집이 있다.
    그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
    숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
    예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

    입력
    첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

    출력
    입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

    예제 입력 1
    13
    예제 출력 1
    3
    */

    public static void go(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int move = 1;
        int s = 1, e=1;
        while (true){
            if(n>=s && n<=e) break;
            s=e+1;
            e=move*6+s-1;
            move++;
        }
        System.out.println(move);

    }

}
