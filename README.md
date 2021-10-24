# :pencil2: **자바 알고리즘 공부 및 코딩 테스트 준비 Repository**
2021년 8월 29일 개설된 Techeer Team.B의 자바 알고리즘 스터디입니다. 

<br>

## :closed_book: 스터디 규칙 및 운영
- 일주일에 최소한 2개 이상의 문제 풀이를 권장합니다. 단, 본인이 푸는 문제의 레벨과 자신의 실력 등을 고려하여 자율적으로 정하는 것을 추천합니다. 
- 자신이 공부한 내용과 푼 문제의 소스 코드, 그리고 문제 풀이에 대한 설명을 업로드하시면 됩니다.
- 한 문제는 1~2시간 고민해 본 후, 해결되지 않을 경우 솔루션을 찾아보는 것을 추천드립니다. Issues 탭을 이용하는 것도 좋은 방법입니다.
- 만약 추천하고 싶은 문제가 있거나, 토론하고 싶은 주제가 있다면 Discussion 탭을 이용하는 것을 추천드립니다. 
- 처음에는 문제를 푸는 것에 집중하고, 점차 가독성이 좋은 코드를 짤 수 있도록 연습해봅시다. 코드 리뷰는 언제나 환영입니다!
- 가능하다면 매일 꾸준히 공부하고, 일일 커밋에 도전해봅시다 :seedling:	

<br>

## :orange_book: 파일 및 폴더 구조
- 자료구조[DS], 알고리즘[AL], 문제 풀이[PS]는 각각 폴더를 구분해주세요. 문제 풀이[PS]의 경우, 플랫폼으로 폴더를 한 번 더 구분해주세요.
- `이름/카테고리/플랫폼/주제or문제or숫자` 형식으로 업로드해주세요.
> 예시 01: /EunjiShin/DS/Stack.java <br>
> 예시 02: /EunjiShin/AL/Greedy.java <br>
> 예시 03: /EunjiShin/BOJ/17497-계산기.java <br>
> 예시 04: /EunjiShin/programmers/level01-Test.java <br>

<br>

## :ledger: PR 양식 
### 1. PR 규칙
- Pull Request 전, 자신이 딴 fork한 저장소의 커밋 내역을 `원격 저장소의 최신 커밋`으로 `fetch & merge` 한 이후에 PR을 진행해주세요.
- Commit Message는 `[날짜]문제 이름 or 주제` 형식으로 업로드해주세요.
> 예시 01 : [210829] 계산기 <br>
> 예시 02 : [210830] 다익스트라 알고리즘 <br> 

### 2. PR 제목
- `[주제]제목 label: 문제 출처(PS일 경우), 난이도(옵션)`
> 예시 01: [DS] 스택 label: EASY <br>
> 예시 02: [PS] 계산기 label: BOJ, EASY <br>

- `여러 커밋을 한꺼번에 PR할 경우, [n주차] label: 주제, 문제 출처, 난이도(옵션)`
> 예시 01: [1주차] label: DS, AL, PS, 백준, 프로그래머스, EASY <br>


### 3. PR 본문
  1. 문제 출처
  2. 참고 레퍼런스 출처 (옵션)
  3. input과 output 설명
  4. 풀이 아이디어 / 간단한 로직 설명


### 4. PR 라벨
  1. 문제 출처 : BOJ, Programmers, leetcode, codility, ....
  2. 주제 : DS, AL, PS
  3. 난이도 : EASY, NORMAL, HARD
  4. reviewer (옵션) : 이미 동일한 문제를 푼 팀원이 있을 경우, 리뷰를 요청하고 싶다면 지정

<br>

## 📆 일정표 (매주 최소 1문제)
> [여기](https://programmers.co.kr/learn/challenges )의 출제 빈도를 참고하여 5주동안 알고리즘/자료구조 공부를 진행합니다. <br>
> 출제 빈도가 높은 필수 주제와 출제 빈도가 낮은 선택 주제로 구성되며, 문제는 필수 주제와 관련된 것들을 우선 순위로 풉니다. **선택 주제 문제는 Discussion**에 등록합니다. <br>  
> 이후 기업 기출문제나 각종 문제 풀이 사이트에서 추천 문제 등을 풀며 코딩 테스트를 준비합니다. <br>
> 일정은 매주 업데이트되며, 다음 차시 문제 추천은 **Discussion** 탭에 등록해주세요. <br>

|일정|필수 주제|선택 주제|EASY|NORMAL|HARD|
|:-:|:-:|:-:|:-:|:-:|:-:|
|1주차 <br> (10.25 ~ 10.31)|정렬 <br> (정렬 알고리즘 <br> & 시간 복잡도)|스택/큐|[K 번째 수](https://programmers.co.kr/learn/courses/30/lessons/42748), <br> [수 정렬하기](https://www.acmicpc.net/problem/2750), [세 수 정렬](https://www.acmicpc.net/problem/2752)|[가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746), [H-Index](https://programmers.co.kr/learn/courses/30/lessons/42747), [시리얼 번호](https://www.acmicpc.net/problem/1431), <br> [공통 순열](https://www.acmicpc.net/problem/1622), [K번째 수 찾는 함수](https://www.acmicpc.net/problem/16455)|[전화번호 목록](https://www.acmicpc.net/problem/5052), <br> [버블 소트](https://www.acmicpc.net/problem/1377)|
|2주차 <br> (11.01 ~ 11.07)|해시|힙||||
|3주차 <br> (11.08 ~ 11.14)|완전 탐색|이분 탐색||||
|4주차 <br> (11.15 ~ 11.21)|DFS/BFS|그래프||||
|5주차 <br> (11.22 ~ 11.28)|DP|Greedy||||

<br>

## 📆 스터디 참여 현황
> 참여율에 따라 `페널티`를 부과합니다. <br>
> 참여가 확인된 후 :white_check_mark: 를 추가합니다. 

| 참여자 | 1주차 | 2주차 | 3주차 | 4주차 | 
| --- | --- | --- | --- | --- |
| EunjiShin |||||
| RyanLee |||||
| GnuPark |||||
| YoungjinShin |||||

<br>

## :green_book: 문제 사이트
* [BaekJoon Online Judge](https://www.acmicpc.net/) - 문제 수가 굉장히 많은 것이 장점. [solved.ac](https://solved.ac/problems/level)와 연동해서 사용하는 것을 추천
* [Programmers](https://programmers.co.kr/) - 레벨 별로 문제가 수록되어 있으며, 알고리즘뿐만 아니라 SQL, 과제등도 공부할 수 있다. 최근 많은 국내 기업들과 연계하여 코딩테스트를 진행
* [LeetCode](https://leetcode.com/) - 세계적으로 유명한 알고리즘 사이트. 문제가 영어로 되어있다! FAANG의 기출 문제 수록
* [SW Expert Academy](https://swexpertacademy.com/main/main.do) - 삼성에서 운영하는 알고리즘 사이트, 문제 난이도가 8개로 나뉘어진다. 상시 SW역량테스트 신청가능
* [Codeforces](https://codeforces.com/) - 해외 알고리즘 사이트. 주 2회 이상의 알고리즘 대회 진행. 코딩테스트보다는 알고리즘 대회에 관심있는 경우 추천
* [Codility](https://app.codility.com/) - 해외 알고리즘 사이트. 코더의 스킬 셋을 테스트하기 위한 플랫폼. 테스트가 자동으로 제공되며, 점수가 매겨진다. 

<br>

## :blue_book: Reference
  ### 1. 참고 문서
  * [대기업 IT직군 코딩테스트 합격을 위한 현실적이고 직관적인 공부 순서](https://www.youtube.com/watch?v=ukkLCl9yBvE)
  * [[공부법] 알고리즘 공부법](https://gmlwjd9405.github.io/2018/05/14/how-to-study-algorithms.html)
  * [알고리즘 공부방법/순서](https://baactree.tistory.com/14)

  ### 2. 동영상 강의
  * [SW Expert Academy](https://swexpertacademy.com/main/learn/course/courseList.do) - 무료
  * [이것이 취업을 위한 코딩 테스트다 with Python](https://www.youtube.com/playlist?list=PLRx0vPvlEmdBFBFOoK649FlEMouHISo8N) - 무료
  * [code.plus](https://code.plus/courses/1) - 유료
  * [Programmers](https://programmers.co.kr/learn?tag=%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98) - 유료


<br>

## :notebook: 작성에 참고한 소스들
- 문제 사이트와 레퍼런스 작성에서 `jaryapp`님의 도움을 받았습니다. 감사합니다! 
- DKU-STUDY의 알고리즘 스터디를 벤치마킹했습니다. 주소는 [여기](https://github.com/DKU-STUDY/Algorithm)입니다. 
