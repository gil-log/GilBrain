# 🙆‍♂️ import 🙇‍♂️

[자바 성능 튜닝 이야기[ProgrammingInsight-이상민]](http://www.yes24.com/Product/Goods/11261731)

<br>


대부분 프로젝트에서 **`Transfer Object`를 많이 사용**하고, 그 내부에서 **`Collection`과 `Map` Interface를 상속받는 객체가 많이 사용**된다.

**목록 데이터를 담기에 가장 좋은것이 `Array`**이고, 그 다음으로 **`Collection` 관련 객체들이기 때문**이다.

**`Array`는 생성부터 크기를 지정**해야 하지만, **`Collection`객체 들은 그럴 필요 없이 자동으로 크기가 증가**된다.

이번엔 **어떤 객체를 써야 성능면에서 우수**한지 알아보려한다.

# Collection 및 Map Interface

**`Array`를 제외하면 Data를 담기 가장 좋은 객체**는 **`Collection`과 `Map` Interface를 상속한 객체**이다.

**`Collection`과 `Map`에 대해 간략히 정리**해보면 아래와 같다.

![](https://images.velog.io/images/gillog/post/e8c527d1-0b63-445d-a47b-9b829c327470/image.png)


|Interface|설명|
|:--:|:--:|
|Collection|가장 상위 Interface|
|Set|중복을 허용하지 않는 집합 처리용도 Interface|
|SortedSet|오름차순을 갖는 Set Interface|
|List|순서가 있는 집합 처리 용도 Interface, Index가 있어 위치를 지정해 값을 찾을 수 있다. <br> 중복을 허용, List Interface를 상속받는 Class 중 가장 많이 사용하는 것이 ArrayList|
|Queue|여러개 객체를 처리하기 전 담아 처리할 때 사용하는 Interface, FIFO|
|Map|Key와 Value 쌍으로 구성된 객체 집합을 처리하기 위한 Interface, 중복 키를 허용하지 않는다.|
|SortedMap|Key를 오름차순으로 정렬하는 Map Interface| 

## Set Interface

