# #import 
[Gitignore 새로 반영하기[DevAndy]](https://youngjinmo.github.io/2021/03/apply-new-gitignore/)


---

Spring Boot 프로젝트에서 **`application.properties` 정보는 Github 등에 노출 될 경우 위험**할 수 있다.

![](https://images.velog.io/images/gillog/post/6cc95dae-8f1d-43c7-9802-eb84b8dc2c75/image.png)

이번에 인지하고 **`.gitignore`에 새롭게 등록하여 로컬 단에서만 사용하려고 변경 하던 중**,

**`.gitignore`에 추가해도 Tracking되며 여전히 추적**되고 있어 **이를 해결한 과정**을 남긴다.


---



**기존 `.gitignore` 에서 변경 관리를 추적하지 않기로 설정**한 후,

**새롭게 `.gitignore`에 목록을 추가하게 될 경우**

**이미 변경 관리에 의해 관리되고 있는 파일**은 **`.gitignore`에 등록**하더라도,

**계속해서 추적 될 수** 있다.


![](https://images.velog.io/images/gillog/post/11f91f44-2ad9-41f7-ba80-0e8831904ccc/image.png)

![](https://images.velog.io/images/gillog/post/e20fe9c9-bac4-4d1e-b25b-52bf5602177e/image.png)

<br>

**이를 위해선 변경관리가 추적하고 있는 캐시를 삭제** 한 후,

**새로 커밋 해주면 변경관리가 `gitignore`를 재적용** 할 수 있다.


---

# `git rm -r --cached .`

다음 명령어를 살펴보자.


`git rm -r --cached .`

**`git rm filename` 명령어**는 **`원격 저장소`와 `로컬 저장소`의 `staging area` 에서 파일을 내리면서 실제 파일도 삭제**한다.

**`--cached` 옵션은 `원격저장소`에 잘못된 파일을 올렸을 때 주로 사용하는 옵션**으로,

**`원격저장소`의 파일을 삭제**하고, **`staging area` 에서 파일을 내리기 위해** 사용한다.


![](https://images.velog.io/images/gillog/post/222a635f-73b5-4cb4-b39c-80cb8e6a2132/image.png)

![](https://images.velog.io/images/gillog/post/6d7661e7-d037-4a17-ace7-2abdcfac5b4f/image.png)


<br>

**지금 상황**은 **전체 프로젝트 파일을 변경할 필요는 없고**,

**`application.properties`를 원격 저장소에서 내리고**,

**변경 관리가 추적하지 않도록 `.gitignore`를 새롭게 반영해야** 하므로,

**아래 처럼 작업**하면 된다.

---

# git rm -r --cached application.properties

먼저 **`application.properties` 의 기존 내용을 다른 곳에 옮겨두고**,




**아래 명령어를 사용**하여 **`application.properties` 만 원격 저장소에서 내려주면**,

`git rm -r --cached application.properties주소`


![](https://images.velog.io/images/gillog/post/a7a64374-578b-4854-9ced-d68a68043ba8/image.png)



![](https://images.velog.io/images/gillog/post/d2a5f8c4-9387-41d6-8614-0f5161f2be11/image.png)

**원격 저장소에서 파일을 내리게 되고**,

**로컬 저장소에서도 삭제된 상태**이다.

<br>

**이제 다시 `application.properties`를 원래 위치에 새로 생성하여 내용 까지 복구**해도,

![](https://images.velog.io/images/gillog/post/9d9775fa-933b-423a-9a42-a5c27261fbc2/image.png)

**변경관리에 의해 추적되지 않아`.gitignore` 적용된 상태로 정상적으로 사용**할 수 있다.
