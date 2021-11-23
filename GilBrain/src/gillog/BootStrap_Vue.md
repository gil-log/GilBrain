# #import

[Bootstrap-vue.org](https://bootstrap-vue.org/docs)


---

**Vue.js 프로젝트를 진행**하는데,

**예쁜 템플릿 테마들**을 **다운로드 받아서 사용하는 것도 좋은 방법**이다.

![](https://images.velog.io/images/gillog/post/3fe224ef-0469-449b-ad49-811ffff7d015/image.png)
_여기서 이쁜 테마들 받을 수도 있다. >> [vuejs.org-테마](https://kr.vuejs.org/resources/themes.html)_

**하지만 테마 템플릿에서 사용**하다 보면 **사용하지 않는 부분들이 리소스를 낭비**할 수 있다.
_내가 추가하지 않은 코드가 깃허브를 점령하는 걸 보고 싶지 않다.😔_

**예쁜 웹사이트가 아닌 가벼운 스케일의 자신의 프로젝트를 구성**하고 싶다면,

**단순 Bootstrap만 사용해서 가볍게 프로젝트를 진행하는게 좋다.**

---

# Bootstrap 설치

간단하다. **Vue.js 프로젝트 경로로 이동 한 후 아래 명령어를 입력**해주자.

`npm install vue bootstrap-vue bootstrap`

---

# main.js 설정

**이제 `main.js`에 `Bootstrap` 관련 import**만 해주면 된다.

```js
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.use(BootstrapVue)
```

![](https://images.velog.io/images/gillog/post/21206144-6a0a-40c7-b194-81287aef53ba/image.png)


---

# Bootstrap 테스트

아래 **간단한 `Bootstrap` 코드를 테스트 페이지에 삽입**해보자.

`<b-button variant="primary">Button</b-button>`






![](https://images.velog.io/images/gillog/post/17ad0c77-c7d8-4af2-9699-cfffae6ec6c1/image.png)

이제 **테스트 페이지에 접속**해보면 아래 처럼 **Bootstrap Element가 추가된 걸 확인**할 수 있다.

![](https://images.velog.io/images/gillog/post/93d677bc-0398-4726-b728-f53a162f66df/image.png)


----


# Bootstrap Component

이제 [bootstrap-vue.org](https://bootstrap-vue.org/docs/components)에 접속해서 원하는 Component들을 직접 추가하며,

프로젝트를 시작해보자.
