# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

### 기능 분리

1. 문자열을 공백 단위로 분리한다.
1. 숫자, 사칙연산 기호 validation
   - 입력값 null, 공백 체크
   - 홀수번째 인덱스에 숫자만 위치하는지 체크한다.
   - 짝수번째 인덱스에 숫자만 위치하는지 체크한다.
1. 사칙연산기호(짝수 인덱스)를 기준으로 연산을 수행한다.

### Step3 요구사항 분석

- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 기능 분리

- 게임(Game) :

1. 반복할 횟수를 정한다.
1. 게임을 진행할 자동차 수를 정한다.
1. 모든 자동차의 상태를 출력한다.

- 자동차(Car) :

1. 입력받은 값에 따라 전진, 혹은 멈춘다.
1. 현재 상태를 반환한다.