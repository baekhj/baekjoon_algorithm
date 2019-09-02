package com.dev;

import java.util.*;

public class No1157 {
    public static void main(String[] args) {
        /*
단어 공부
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	39992	14876	11952	37.811%
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1
Mississipi
예제 출력 1
?
예제 입력 2
zZa
예제 출력 2
Z
예제 입력 3
z
예제 출력 3
Z
예제 입력 4
baaa
예제 출력 4
A
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        Map<String, Integer> m = new HashMap<String, Integer>();
        String i; String maxStr = ""; int max = 0; int maxCnt = 0;
        for(int x=0; x<str.length(); x++){
            i = str.substring(x, x+1);
            m.put(i, m.get(i)==null?1:m.get(i)+1);
            if(max < m.get(i)) max = m.get(i);
        }
        Iterator<String> it = m.keySet().iterator();
        it = m.keySet().iterator();
        while(it.hasNext()){
            i = it.next();
            if(m.get(i)==max) {
                maxStr = i;
                maxCnt++;
            }
        }
        if(maxCnt == 1) System.out.println(maxStr);
        else System.out.println("?");
    }
}







