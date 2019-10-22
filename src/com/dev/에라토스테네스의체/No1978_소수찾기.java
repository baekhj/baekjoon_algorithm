package com.dev.에라토스테네스의체;

import java.util.*;

public class No1978_소수찾기 {

    public static void main(String[] args) {
        /*
        소수 찾기
        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
        2 초	128 MB	34616	16011	13306	48.758%
        문제
        주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

        입력
        첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

        출력
        주어진 수들 중 소수의 개수를 출력한다.

        예제 입력 1
        4
        1 3 5 7
        예제 출력 1
        3
        출처
        데이터를 추가한 사람: bclim9108 nova9128
        문제의 오타를 찾은 사람: djm03178
        알고리즘 분류
        수학
        에라토스테네스의 체
        */
        go();

    }

    private static void go(){

        //"에라토스테네스의 체" 이용 ... 맞게 한건진 모르겠음
        /*
        [에라토스테네스의 체] - 위키백과 내용 참조.
        2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다. 그림에서 회색 사각형으로 두른 수들이 여기에 해당한다.
        2는 소수이므로 오른쪽에 2를 쓴다. (빨간색)
        자기 자신을 제외한 2의 배수를 모두 지운다.
        남아있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다. (초록색)
        자기 자신을 제외한 3의 배수를 모두 지운다.
        남아있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다. (파란색)
        자기 자신을 제외한 5의 배수를 모두 지운다.
        남아있는 수 가운데 7은 소수이므로 오른쪽에 7을 쓴다. (노란색)
        자기 자신을 제외한 7의 배수를 모두 지운다.
        위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.
        그림의 경우, {\displaystyle 11^{2}>120}{\displaystyle 11^{2}>120}이므로 11보다 작은 수의 배수들만 지워도 충분하다. 즉, 120보다 작거나 같은 수 가운데 2, 3, 5, 7의 배수를 지우고 남는 수는 모두 소수이다.
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //확인할 수의 개수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int max = arr[n-1];
        Map<Integer, Boolean> sosuMap = new HashMap<Integer, Boolean>();    //각 숫자별 소수여부
        sosuMap.put(1, false);  //1은 소수가 아님
        for(int x=2; x<=max; x++) sosuMap.put(x, true);
        for(int x=2; x<max; x++){
            if(sosuMap.get(x)){ //이 아이는 소수임
                for(int y=2; y <= max/x; y++){   //소수인 아이의 배수에 해당하는 아이들을 소수아님 처리
                    sosuMap.put(x*y, false);
                }
            }
        }
        int sosuCnt = 0;
        for (int i : arr)  if(sosuMap.get(i)) sosuCnt++;    // 입력된 값들중 소수 찾기
        System.out.println(sosuCnt);
    }

}
