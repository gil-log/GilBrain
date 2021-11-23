# #import
[HTTP 요청을 위한 axios [Vue.js 한국 사용자 모임]](https://vuejs-kr.github.io/update/2017/01/04/http-request-with-axios/)

---

# Axios

**`Axios`**는 **Vue.js에서 Ajax 전송을 도와주는 HTTP 클라이언트 라이브러리**다.


**`Axios`의 특징**은 **요청 취소와 `TypeScript`를 사용할 수 있다는 것**이다.

---

# Axios 설치

**`vue-cli`를 사용하여 Vue.js 프로젝트를 구성**하였다면,

**아래 npm 명령어로 간단하게 설치 가능**하다.


```
npm install --save axios
```



![](https://images.velog.io/images/gillog/post/06c8a0cc-164e-4dad-8ebb-ea03dca8f409/image.png)

---


# Axios 전역 설정

Vue.js 프로젝트 파일 중 **`main.js`에 설치한 `Axios`를 전역 설정** 해주면,

**다른 Component에서 바로 사용**할 수 있다.
_각 Component에서 직접 import해서 사용해도 된다._
_맨날 import하면 귀찮으니까.._


`main.js`를 열고 아래 코드를 입력해주자.

```js
import axios from 'axios'

Vue.prototype.$http = axios
```

![](https://images.velog.io/images/gillog/post/3d29c61b-ca4c-48fc-9f22-39f550fb153a/image.png)

---

# Axios 사용

이제 사용하고 싶은 **Vue Component에서 `this.$http` 를 통해 Axios를 사용**할 수 있다.

![](https://images.velog.io/images/gillog/post/85a524f0-fdbe-404f-9743-6550ffbaf751/image.png)

![](https://images.velog.io/images/gillog/post/f5d57570-32b5-440a-9bca-cfab2faaea3e/image.png)
