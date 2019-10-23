package com.dev.반복문;

import java.io.*;
import java.util.*;

public class No2798_블랙잭 {

    public static void main(String[] args) {
        /*
        블랙잭
        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
        1 초	128 MB	13502	5385	4522	40.422%
        문제
        카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서,
        카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.

        한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.

        김정인 버젼의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음,
        딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.

        이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다.
        블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.

        N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

        입력
        첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
        둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.

        합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

        출력
        첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

        예제 입력 1
        5 21
        5 6 7 8 9
        예제 출력 1
        21
        출처
        Contest > Croatian Open Competition in Informatics > COCI 2011/2012 > Contest #6 1번

        문제를 번역한 사람: baekjoon
        빠진 조건을 찾은 사람: bupjae
        문제의 오타를 찾은 사람: eric00513 joonas
        알고리즘 분류
        배열
        구현
        반복문
        */
        try{
            go();
        }catch (Exception e){}


    }

    private static void go() throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        String[] f = br.readLine().split(" ");
        int N = Integer.parseInt(f[0]);  //카드의 개수
        int M = Integer.parseInt(f[1]);  //딜러가 외친 숫자 = 3장고른 합이 가깝게 만들 숫자(M을 초과하면 안됨)

        String[] cardArr = br.readLine().split(" ");

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();  // key:합, value:M과의 차이
        int a, b, c;    //주운카드 세장
        int sum, gab;
        for(int x=0; x<N; x++){ //나올수 있는 합계 전체 구하기
            a = Integer.parseInt(cardArr[x]);
            for(int y=x+1; y<N; y++){
                b = Integer.parseInt(cardArr[y]);
                for(int z=y+1; z<N; z++) {
                    c = Integer.parseInt(cardArr[z]);
                    sum = a+b+c;
                    if(sum <= M){
                        gab = Math.abs(sum-M);
                        if(m.get(sum) == null) m.put(sum, gab); //이미 존재한값이 없으면 걍 넣기
                        else if(m.get(sum) > gab) m.put(sum, gab);  //있으면 차이가 작은아이로 넣어주기
                    }
                }
            }
        }
        int minGab = -1;
        int minSum = 0;
        int res = 0;
        Iterator<Integer> it = m.keySet().iterator();
        while (it.hasNext()){   //제일 낮은 아이 찾기
            minSum = it.next();
            if(minGab == -1 ||  m.get(minSum) < minGab ) {
                minGab = m.get(minSum);
                res = minSum;
            }
        }
        bw.write(res+"");
        bw.flush();

    }

}
