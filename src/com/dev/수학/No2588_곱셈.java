package com.dev.수학;

import java.util.*;

public class No2588_곱셈 {
    public static void main(String[] args) {
        /*
곱셈 (2588번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	14699	9250	8531	65.447%
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1
472
385
예제 출력 1
2360
3776
1416
181720
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int z = b;
        r3 = z/100*a; z-=z/100*100; r4 += r3*100;
        r2 = z/10*a; z-=z/10*10; r4 += r2*10;
        r1 = z*a; r4 += r1;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}







