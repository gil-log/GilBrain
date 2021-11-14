## import

[How can i include only specific folders in git using .gitignore?[StackOverflow]](https://stackoverflow.com/questions/23301107/how-can-i-include-only-specific-folders-in-git-using-gitignore)
[Git Document](https://git-scm.com/docs/git-config)


---
# 특정 파일 포함

**`.gitignore`를 사용**하면 **Git을 통해 형상관리를 할 때**,

**포함시키지 않을 파일이나 폴더들을 설정**할 수 있다.

이번에는 **node_module 관련 특정 core script 파일을 수정할 일**이 생겼는데,

**해당 사항을 형상관리로 관리하고 싶어** 기존에 **ignore 하고 있던 목록 중에 특정 파일은 포함시키려는 상황**이었다.

---

# ! 붙이기

**`.gitignore` 파일**에서 **`!` 키워드**를 붙이면,

**특정 파일이나 폴더를 형상관리 대상으로 포함**시킬 수 있다.





```
# 모든 것을 제외
/*

# 특정 파일을 제외
/notwant/notwantfile.js

# ! 키워드로 특정 파일을 포함
!/.gitignore
!/some_other_files

# ! 키워드로 특정 폴더를 포함
!/puppet/

```

---

# 그래도 안되는데요

**`.gitignore`에 `!` 키워드로 특정 파일을 포함시키고 싶었지만**,

**이미 상위 폴더 경로를 ignore하고 있는 상황**이라,

**`git add` 명령어로 추가 해보려 했지만 실패**했다.

<br>



![](https://images.velog.io/images/gillog/post/5133df70-6f1a-4a30-9eca-cd1cb1219050/image.png)



![](https://images.velog.io/images/gillog/post/77931a9a-79fb-47cb-b8ab-450bf750df21/image.png)

<br>

**`.gitignore`에 `!` 로 포함시키려는 파일을 더 위에 선언하면 될까** 했지만,

이 역시 **적용되지 않았다.**

![](https://images.velog.io/images/gillog/post/889fe525-ba10-4dbe-a631-d41596114351/image.png)


---

# git config advice.addIgnoredFile

![](https://images.velog.io/images/gillog/post/f7f00a1e-779c-4c0f-af9e-efd96b20e860/image.png)

관련해서 **git config을 설정하면 적용할 수 있을까** 하여,

**Git 공식 문서를 참고**해보았지만,

![](https://images.velog.io/images/gillog/post/79454191-7e1f-4e68-99d6-68d0adb00ed4/image.png)

결국 **해당 옵션도 ignore 된 file을 추가하려 할 때**,

**안내 메시지가 나오는 설정이라 효과가 없었다**.

![](https://images.velog.io/images/gillog/post/cb2da1ad-fb0a-4dce-aeee-bc0aef60e36b/image.png)
_그냥 저 노란색 안내 문구가 추가되는 옵션_




아래 **두 가지 방법으로 해결할 수 있다.**

---

# 1. 부모 경로 모두 제외

**Git 공식 문서에서 ignore 관련 부분**을 찾아보니,

**부모 경로가 ignore 될 경우**엔 **Git은 성능 이슈로 `!` 키워드를 사용해도**,

**해당 파일을 ignore에서 제외 시킬 수 없다고 나와있었다.**

```
An optional prefix "!" which negates the pattern; 
any matching file excluded by a previous pattern 
will become included again.
It is not possible to re-include a file 
if a parent directory of that file is excluded. 
Git doesn’t list excluded directories 
for performance reasons, 
so any patterns on contained files have no effect, 
no matter where they are defined. 
Put a backslash ("\") in front of the first "!" 
for patterns that begin with a literal "!",
for example, "\!important!.txt".
```

그래서 **아래와 같이 사용해 보려던 `!` 키워드 대신**에,

```
node_modules/
!node_modules/axios/lib/core/createError.js
```

**아래 처럼 형상관리에 포함하고 싶은 파일의 부모 디렉토리**를 **모두 `!` 로 제외** 시켜 주어,

**형상관리에 포함되도록 설정**할 수 있었다.

```
node_modules/**
!node_modules/axios/
!node_modules/axios/lib/
!node_modules/axios/lib/core
```


![](https://images.velog.io/images/gillog/post/4032d531-766c-4a17-bd6f-dce4b193afb6/image.png)

![](https://images.velog.io/images/gillog/post/491d3c06-aab5-4428-8731-30a2dfdf5352/image.png)


![](https://images.velog.io/images/gillog/post/a34211bf-540b-47a3-9c66-243851b369da/image.png)




---

# 2. git add -f

**아주 간단하게 `.gitignore` 설정 없이도**,

**`git add -f` 강제 옵션**으로도 가능하다.

![](https://images.velog.io/images/gillog/post/184003fe-7bb3-4b06-9aab-2fa4d8d78a9c/image.png)

_그냥 바로 이렇게 할걸 그랬나?.._
