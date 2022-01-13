# Git

`Git`의 정의는 **분산 버전 관리 시스템**을 뜻한다.


## Git 사용 목적

**`Git`이나 `SVN`과 같은 분산 버전 관리 시스템을 사용하는 목적**은 **아래와 같은 상황** 때문이다.

<br>

![](https://images.velog.io/images/gillog/post/34c7ab96-8bae-4359-91b6-463d0cde57b9/image.png)

> **상황** : 팀 프로젝트 수행을 위해 `Gil`, `Log`, `Load`, `Bear` 4명의 개발자가 모였다.
이 네 명은 원활한 프로젝트를 위해 구현할 기능 개발을 나누었다.
`Gil`, `Log`가 **기능 1**을, `Load`가 **기능 2**, `Bear`가 **기능 3**을 개발하기로 정했다.

이 네 명의 개발자가 **`Git`과 같은 분산 버전 관리 시스템을 사용하지 않을 경우** 아래와 같은 **문제가 발생할 수 있다.**


>1. **`Gil`은 이미 코드를 다 구현**했지만 **`Log`로부터 완성된 코드를 공유받지 못해 다음 단계로 진행할 수가 없다.**
2. **`Log`가 코드를 완성**했지만 **`Gil`의 코드와 충돌이 발생**했다. 결국 서로의 코드를 이해하기 위해 **`Gil`은 `Log`의 코드를 읽고, `Log`는 `Gil`의 코드를 읽어야 한다.** 이 과정에서 코드를 완성한 **`Load`와 `Bear`는 추가적인 충돌을 방지하기 위해 `Gil`, `Log`를 기다린다.**
3. 오류를 모두 고치고 `Gil`, `Log`, `Load`, `Bear`는 현재까지 코드를 다같이 총 2번 합쳤다.  2번째까지는 아무 문제가 없었다. 그러다 **3번 째 코드를 합치는 과정에서 오류가 발생**한 경우 문제가 어디서 발생했는지 알아보기 위해 2번째 합친 코드로 돌아가보기로 하는데, **아무도 이전 코드를 가지고 있지 않았다.**
4. 이제 **전체 코드를 이해하기 위해 엄청난 시간을 들여서 각자가 짠 전체 코드를 모두가 이해**하며 봐야 한다. **`Load`는 기능 1을 살펴보다 궁금증이 생겨 `Gil`에게 질문**을 한다. 하지만 **해당 파트는 `Gil`이 짠 게 맞지만, `Log`가 코드를 합치는 과정에서 호환성을 위해 `Gil`의 코드를 일부 수정**했다. **`Log`도 마찬가지로 자기가 짠 코드지만 여러 수정 과정을 거치다 보니 내가 짠 코드가 무엇인지 헷갈리게 된다.**
_[Git에 대해 알아보자 1. Git의 개념과 Git Flow[오지는 컴퓨터 공부-사용자 쌍문동믹서기]](https://cupjoo.tistory.com/6)_


<br>

## Git 개념

### Repository

**`Repository`는 말 그대로 파일 등이 저장되는 저장소**로, **즉 프로젝트 폴더**를 말한다. 

저장소의 종류는 다음과 같다.

**`Remote Repository (원격 저장소)`**: **원격 서버에 저장된 저장소**로, **여러 사람이 함께 공유**한다.

**`Local Repository (개인 저장소)`**: **우리가 직접 관리하는 저장소**로, **내 PC에 저장**되어 있다.



### Commit

**`Commit`은 프로젝트의 변경 이력**을 말한다.


![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile26.uf.tistory.com%2Fimage%2F99B2383D5B0A88683780D8)

### Stage

**`Stage`에 대해 설명하기 전 `Index`에 대한 개념을 이해**해야 한다. 

**`Index`는 `Commit`을 통해 변경사항들이 반영되기 전 해당 변경사항의 이력들이 저장되는 공간**이다. 

따라서 **우리가 특정 파일이나 코드를 변경 시 해당 이력은 `Index`에 기록**된다. 

이때 **이 기록되는 행위를 `Stage` 또는 `Staging`**이라 한다. 

따라서 다음과 같이 5개의 변경사항이 있을 시, 그 중에서 **원하는 변경 사항만 `stage`하고 원하지 않는 변경 사항은 `unstage`한 뒤 `commit`을 진행**하면 된다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile5.uf.tistory.com%2Fimage%2F9978A64F5B0BBEC318349E)


### Branch

**`Branch`는 특정 커밋으로부터 분기되는 포인터**를 말하는 것으로, **여러 명이 같은 코드를 공유하며 협업하는 상황**에서 **각 개발자들이 개발을 진행하고 있는 환경 또는 흐름**을 말한다.

**각 개발자들은 여러 `Commit`을 만들며 프로젝트를 개발**하는데, **이때 누가 어떤 `Commit`을 추가했는지 구분이 가능해야 한다.**

**이때 사용되는 것이 바로 `Branch`**이다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile26.uf.tistory.com%2Fimage%2F996CA94C5B0AC6B607F65D)

**새로운 `Branch`가 생성되더라도 기존의 메인 `Branch`는 그대로 남아있다.**



![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile28.uf.tistory.com%2Fimage%2F99522A495B0AC6C31C1122)

위와 같이 **한 사용자가 자신의 기능의 세부 `Branch`를 또 다시 나눌 수도 있다.**
_`Branch` 생성 가능 갯수에는 제한이 없다_


### Checkout

**`Checkout`은 현재 위치한 `Commit`에서 다른 `Commit`으로 이동하는 것**을 말한다. 

**`Checkout`을 통해 현재 `Commit`에서 같은 `Branch` 내 다른 `Commit`으로 이동**하거나, **다른 `Branch` 내 `Commit`으로 이동**할 수 있다. 

**`Checkout`으로 인해 이전 시점의 버전으로 되돌아갈 수도** 있고, **다른 사람의 `Branch`로 전환해 다른 개발자들의 코드 진행 상황을 확인해 볼 수도** 있다.


### Merge

**`Merge`는 나뉘어진 `Branch`를 다시 하나의 `Branch`로 합치는 것**을 말한다. 
_**가장 오류가 많이 발생하는 과정이니 주의**_


**`Merge` 진행 시 현재 `Branch`를 `Branch`가 합쳐지는 기존 메인 `Branch`로 전환한 후 수정된 `Branch`를 Merge해야 오류가 발생하지 않는다. **

**여러 개의 `Branch`들을 한꺼번에 Merge할 때도 마찬가지로 차례차례 기존 `Branch` 상태에서 Merge를 진행**한다.



또한 **`Merge`에는 종류가 2가지**가 있다. **하나는 `fast-forward`이고, 나머지 하나는 `non fast-forward`**이다. 

**`fast-forward`는 기본 merge 방식**으로, **서로 다른 두 `Branch`를 충돌 없이 자동 merge 시키는 병합**이다. 

**하지만 그 과정에서 때때로 일부 문법으로 인해 충돌 (Conflict)이 발생하면 병합에 실패하는 경우가 발생**한다. 



**이때 해당 충돌 기록을 살피며 일일히 해당 코드를 수정한 뒤 `Merge`를 이어서 진행하면 성공적으로 `Branch`가 병합**된다. 

**이러한 `Merge` 방식이 `non fast-forward`**이다. 

또한 **이 과정에서 코드의 수정이 이루어졌으니 마찬가지로 새로운 `Commit`이 생성**된다.


![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile8.uf.tistory.com%2Fimage%2F998ABC3F5B0ABCC71703E2)

### Clone

**`Clone`은 원격 저장소로부터 특정 프로젝트를 통째로 내 로컬 저장소에 다운받는 것**을 말한다.



### Push

**`Push`는 현재 내 로컬에서 작업한 변경 사항들을 원격 저장소에 반영하는 것**을 말한다. 

**작업이 완료될 때마다 원격 저장소에 `Push`해야 다른 사람들이 내 코드를 확인할 수 있다.**



### Pull

**`Pull`은 원격 저장소에서 변경된 사항들을 내 로컬 저장소에 반영하는 것**을 말한다. 

**`Push`와 정반대의 개념**으로, **다른 사람이 `Push`를 해서 원격 저장소에 코드를 업데이트**하면 **우리는 해당 코드를 `Pull`**하여 **로컬의 코드를 업데이트**한다.

**이때 기존의 코드와 내 코드가 다른 경우 `Merge`를 진행해 코드를 병합**하게 된다.


_`Clone`과 개념이 헷갈릴 수도 있는데, **`Clone`은 프로젝트를 처음 불러올 때 프로젝트 전체를 다운받는 것**이지만, **`Pull`은 해당 프로젝트에서 변경된 사항들만 다운받는 것**이다._



## Git Flow


**`Git Flow`란 저장소를 보다 고수준으로 관리하기 위한 브랜칭 기법**이다. 

**프로젝트의 규모가 점점 커지면, 많은 인원들이 코드에 동시에 접근하면서 필연적으로 문제가 발생**하게 된다. 

따라서 **현재 내 브랜치가 어떤 문맥에서 생겨나게 됐는지 파악하기 위해 `Git Flow`에 대한 이해는 반드시 필요**하다.



**`Git Flow`는 기본적으로 브랜치를  `feature` - `develop` - `release` - `hotfix` - `master` 5단계로 나누어 코드를 관리**한다. 





![](https://t1.daumcdn.net/cfile/tistory/99FE0A385AE809E81D)

### Master Branch

**`Master Branch(메인 배포판)`는 실제로 클라이언트에서 이용하는 최종 형태의 메인 `Branch`**이다.



### Develop Branch

**`Develop Branch(메인 개발)` 현재 개발이 진행 중인 메인 `Branch`**이다. 

**`Master Branch`와 마찬가지로 추가적으로 생성 또는 삭제되지 않는 `Branch`**이다.



### Feature Branch

**`Feature Branch(추가 기능 개발)` 새로운 기능을 추가하기 위해 사용되는 `Branch`**로, **특정 기능의 개발이 필요할 때 Develop `Branch`에서 파생**되며, **기능 개발이 완료되면 `Develop Branch`로 병합**된다. 

**가장 많이 생성되었다 삭제되는 `Branch`**이다.



### Release Branch

**`Release Branch(배포 준비, 오류 확인)` 실제로 프로젝트를 배포하기 위한 브랜치**이다. 

**이 `Branch`는 지금까지 개발한 기능들이 있는 `Develop Branch`에서 파생**되어, **각종 오류 사항이나 문제들을 검토 및 수정하는 일종의 테스트 서버로 볼 수 있다.** 

**수정이 완료되면 `Release Branch`는 `Develop Branch`와 `Master Branch`로 병합**된다.



### Hotfix Branch

**`Hotfix Branch(긴급 오류 수정)` `Hotfix Branch`는 배포된 `Master Branch`에서 예기치 못한 버그가 발생했을 때 급하게 `Develop Branch`, `Feature Branch`를 거치지 않고 버그를 수정하는 단계**이다. 

**수정이 완료되면 `Develop Branch`와 `Master Branch`로 병합**된다.


