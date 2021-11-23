# #import
[How to change port number in vue-cli project[Stack Overflow]](https://stackoverflow.com/questions/47219819/how-to-change-port-number-in-vue-cli-project)

---

# Vue cli Port 변경

**`node.js`로 `Vue` Project Server를 구동**할 때,

**`npm run dev` 를 통해 개발 서버를 시작**하고는 한다.

**이때 구동되는 개발 서버의 Port가 시작 할 때 마다 변경**되서,

**다른 API 개발 서버**에서 **해당 서버 포트에 대한 설정을 시시각각 바꿔 주기 너무 불편**하다.

<br>

**간단하게 두 가지 방법**을 통해서 **`Node.js`로 구동**되는,

**`Vue` 개발 서버의 Port를 고정**시킬 수 있다.

---

# config/index.js

**`Vue` Project 경로**에서 **/config/index.js**에 들어가보자.

아래 **`module.exports` 	부분**에서,

**`dev : { .... port: ...}` 부분을 변경**해서,

**dev 환경에서 원하는 구동 Port로 고정** 시킬 수 있다.

![](https://images.velog.io/images/gillog/post/61974062-ff6d-452d-b448-117f48ce67a5/image.png)
![](https://images.velog.io/images/gillog/post/82843ba0-09b8-41e1-ba92-c8cf9787369d/image.png)

---

# npm run dev -- --port 포트번호

**`npm run dev -- --port 포트번호` 명령어**를 통해서,
_-- --port 앞에 --를 빼먹지 말자_

**dev 서버 구동할 때 시작 Port를 설정할 수도** 있다.

**매번 구동 시킬 때 마다 적는게 상당히 귀찮**지만,

**가볍게 다른 Port로 변경할 일이 있을 때 유용**하다.

![](https://images.velog.io/images/gillog/post/29e78b3e-38d1-43a1-aece-384b8591c652/image.png)

![](https://images.velog.io/images/gillog/post/49a599a2-b0b0-4174-8977-12162e828d95/image.png)

**터미널 상**에서는 아까전 **`config/index.js` 에서 설정한 `dev`의 port로 출력** 되지만,

**실제 구동은 명령어로 설정한 Port로 구동**된다.

![](https://images.velog.io/images/gillog/post/2c5bfade-8762-42e0-b71c-782ef8d13c61/image.png)
