package com.dev.기타;

import java.io.*;
import java.util.*;

public class No16496_큰수만들기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) numArr[i] = Integer.parseInt(arr[i]);
        String result = go(numArr);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    /*
    큰 수 만들기
    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
    2 초	512 MB	227	75	61	43.262%
    문제
    음이 아닌 정수가 N개 들어있는 리스트가 주어졌을 때, 리스트에 포함된 수를 나열하여 만들 수 있는 가장 큰 수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 리스트에 포함된 수가 주어진다. 수는 공백으로 구분되어져 있고, 1,000,000,000보다 작거나 같은 음이 아닌 정수 이다. 0을 제외한 나머지 수는 0으로 시작하지 않으며, 0이 주어지는 경우 0 하나가 주어진다.

    출력
    리스트에 포함된 수를 나열하여 만들 수 있는 가장 큰 수를 출력한다. 수는 0으로 시작하면 안되며, 0이 정답인 경우 0 하나를 출력해야 한다.

    예제 입력 1
    5
    3 30 34 5 9
    예제 출력 1
    9534330
    예제 입력 2
    5
    0 0 0 0 1
    예제 출력 2
    10000
    */

    public static String go(int[] bynvers){

        String maxStr = "";
        String[] arr = new String[bynvers.length];
        for (int i = 0; i < arr.length; i++)  arr[i] = String.valueOf(bynvers[i]);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두문자열을 합쳤을때 더 큰쪽이 우선하도록 정렬  ex) "3"+"30" vs "30"+"3"  "330" vs "303" >> 330 우선
                int res = (o2+o1).compareTo(o1+o2);
                //int res = (o2).compareTo(o1); //이렇게 하면 문자열 정렬이 "3" vs "30" 의 경우   "30"이 우선되어 "303" 이 됨. ==> 틀린값
                return res;
            }
        });

        for (String s : arr) maxStr+=s;
        if("0".equals(maxStr.substring(0, 1))) return "0";  //첫째자리가 0이면 전부 0입니다
        return maxStr;
    }


}
