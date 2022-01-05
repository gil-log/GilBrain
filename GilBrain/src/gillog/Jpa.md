
# 🙆‍♂️ import 🙇‍♂️

[자바 ORM 표준 JPA 프로그래밍[김영한]](http://www.kyobobook.co.kr/product/detailViewKor.laf?mallGb=KOR&ejkGb=KOR&barcode=9788960777330)

# JPA

**`JPA`는 `Java Persistence API`의 약자**로 **Java진영에서 제공**하는 **관계형 데이터베이스 모델과 객체 모델간의 패러다임 불일치를 해결해주는 ORM 기술 표준**이다.
_ORM : Object-Relational Mapping_

지금까지 **객체 모델링을 세밀하게 진행**할 수록 **객체를 DB에 저장 조회하기 어려워 졌고**,

**객체와 관계형 DB 차이를 위해 더 많은 SQL 작성이 필요**했다.

그렇게 **점점 객체 모델은 데이터 중심 모델로 변해갔다.**


**`JPA`를 활용**함으로써 **기존 코드에서 적은 수정으로 DB를 손쉽게 변경**할 수 있다.



# Not Using JPA, SQL

**DB는 객체 구조와 다른 Data 중심 구조**를 가지고 있다.

**객체를 DB에 CRUD 하기 위해선 많은 SQL과 JDBC API 코드 작성이 필요**하다.

**기존 로직을 수정하기 위해서 `DAO`를 열어 `SQL`을 확인하고 나서야 로직 에러등을 검출**해 내고,

**데이터 접근 계층을 사용해 `SQL`을 숨겨도** **로직이나 코드 수정시**에 **`DAO`를 확인**해 **어떠한 `SQL`이 실행 되는지 확인**해야 했다.

<br>

**비즈니스 요구사항을 모델링한 객체를 `엔티티`**라 하는데, 

**`SQL`에 의존하는 상황에서는 이 `엔티티`를 신뢰하고 사용할 수 없다.**
_**DAO를 열어 어떤 SQL이 실행되고 어떤 객체들이 조회되는지 일일이 확인**_

**Application에서 SQL을 직접 다루게 될 경우 발생하는 문제점은 아래 세 가지로 요약**할 수 있다.

- 진정한 의미의 계층 분할이 어렵다.
- 엔티티를 신뢰할 수 없다.
- SQL 의존적인 개발을 하게 된다.

# Using JPA, SQL

**`JPA`를 사용**하면 **객체를 DB에 저장하고 관리 할 때 SQL을 작성하는 것이 아닌**,

**`JPA`에서 제공하는 API를 사용**하면 된다.


## 저장, jpa.persist(member)


**`persist()` method는 객체를 DB에 저장**한다.

정확히 말하면 **`JPA`가 객체와 매핑 정보(@Entity)를 확인**하고,

**적절한 `Insert SQL`을 생성해 보관했다가 `flush()`하는 경우에 DB에 반영**시킨다.

## 조회, jpa.find(entity.class, id)

**`find()` method는 DB에서 조회한 정보를 객체로 전달**해준다.

**`JPA`는 객체와 매핑 정보(@Entity)를 확인**하고,

**적절한 `Select SQL`을 생성해 DB에 전달하고 그 결과로 매핑된 객체를 생성해 반환**한다.

```java
Member member = jpa.find(Member.class, "gillog");
```

## 수정, member.setName("변경이름")

**`JPA`는 별도의 수정 method가 존재하지 않는다.**

대신 **조회한(영속화된) 객체의 값을 변경하는 경우**,

**`Transaction`을 `commit`하는 때에(`flush()`) 적절한 `Update SQL`을 DB에 전달하여 반영**한다.
