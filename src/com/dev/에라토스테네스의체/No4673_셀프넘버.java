package com.dev.에라토스테네스의체;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class No4673_셀프넘버 {

    public static void main(String[] args) throws IOException {
        /*
셀프 넘버
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	33804	17625	14185	53.016%
문제
셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.

양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.

예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.

생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
입력은 없다.

출력
10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.

예제 입력 1
예제 출력 1
1
3
5
7
9
20
31
42
53
64
 |
 |       <-- a lot more numbers
 |
9903
9914
9925
9927
9938
9949
9960
9971
9982
9993
         */
        try{
            go();
        }catch(IOException e){e.printStackTrace();}

        System.out.println();
        go2();

    }

    private static void go() throws IOException{
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int x = 10000;
        int idx=0;
        int[] xar = new int[x];
        for(int i=1; i<=x; i++){
            //들어온숫자로 만들수 있는 IDX 가져오기
            idx = next(i);
            if(idx-1<x) xar[idx-1] = 1;
        }
        for(int i=0; i<xar.length; i++){
            if(xar[i] < 1) bw.write((i+1)+"\n");    //셀프넘버 출력
        }
        bw.flush();
    }

    private static int next(int a){
        int res=0;
        String[] arr = String.valueOf(a).split("");
        for(String x:arr) res+=Integer.parseInt(x);
        res+=a;
        return res;
    }



    private static void go2() {

        Set<Integer> set = new HashSet<Integer>();
        for (int x=1; x<=10000; x++) set.add(x);
        int newNumber;
        String arr[];
        for (int x=1; x<=10000; x++){
            newNumber = x;
            arr = (x+"").split("");
            for(int y=0; y<arr.length; y++) newNumber += Integer.parseInt(arr[y]);
            //if(newNumber > 10000) break;
            set.remove(newNumber);
        }
        for(int i: set) System.out.println(i);
    }






}

