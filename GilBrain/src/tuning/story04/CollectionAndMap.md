# 🙆‍♂️ import 🙇‍♂️

[자바 성능 튜닝 이야기[ProgrammingInsight-이상민]](http://www.yes24.com/Product/Goods/11261731)

<br>


대부분 프로젝트에서 **`Transfer Object`를 많이 사용**하고, 그 내부에서 **`Collection`과 `Map` Interface를 상속받는 객체가 많이 사용**된다.

**목록 데이터를 담기에 가장 좋은것이 `Array`**이고, 그 다음으로 **`Collection` 관련 객체들이기 때문**이다.

**`Array`는 생성부터 크기를 지정**해야 하지만, **`Collection`객체 들은 그럴 필요 없이 자동으로 크기가 증가**된다.

이번엔 **어떤 객체를 써야 성능면에서 우수**한지 알아보려한다.

<br>

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

---

## Set Interface

먼저 `Set` Interface에 대해 알아보면, **`Set` Interface는 중복이 없는 집합 객체를 만들때 유용하게 사용**된다.

예를들어 **전체 학생 이름이 몇개 인지 확인하기 위해서 중복되는 이름을 제외**해야 하지만, **`Set` 객체에 Data를 저장**하면 **중복되는 Data는 원천적으로 삽입되지 않는다.**

**`Set` Interface를 구현한 Class로는 `HashSet`, `TreeSet`, `LinkedHashSet` 세 가지**가 있다.


|Class|설명|
|:--:|:--:|
|HashSet|Data를 **Hash Table에 저장하는 Class로 순서 없이 저장**한다.|
|TreeSet|**Red-Black이라는 Tree 구조에 Data를 저장, 값에 따라 순서**가 정해진다.<br> Data를 담으면서 동시에 **정렬을 수행하여 `HashSet`보다 성능 상 느리다.**|
|LinkedHashSet|**Hash Table에 Data를 저장**하는데, **저장된 순서에 따라 순서가 결정**된다.|

### Red Black Tree??

**`Red-Black Tree`** 란 **이진 트리 구조로 Data를 담는 구조**를 말하며 **아래와 같은 특징**이 있다.

1. **각각의 노드는 검은색이나 붉은색** 이어야 한다.

2. **가장 상위(root) 노드는 검은색**이다.

3. **가장 말단(leaves) 노드는 검은색**이다.

4. **붉은 노드는 검은 하위 노드만**을 가진다.

5. **검은 노드는 붉은 상위 노드만**을 가진다.

6. **모든 말단 노드로 이동하는 경로의 검은 노드 수는 동일**하다.

![](https://images.velog.io/images/gillog/post/5e0daf53-8d83-4a43-a2f6-1dcf00f454e6/image.png)

---

## List Interface

**`List` Interface 는 `Array`의 확장판**이라고 보면 된다.

**`C`나, `Java`의 `Array`는 모두 최초 선언 시 담을 수 있는 Data의 개수를 한정하여 생성**한다.

하지만 **`List` Interface를 구현한 Class들은 담을 수 있는 크기가 자동으로 증가** 되므로, **Data의 개수를 확실히 모를 때 유용하게 사용**할 수 있다.

**`List` Interface를 구현한 Class**에는 **`ArrayList`, `Linked-List`, 원조 Class 격인 `Vector` Class**가 있다.

|Class|설명|
|:--:|:--:|
|Vector|**객체 생성 시 크기를 지정할 필요가 없는 Array Class**이다.|
|ArrayList|**Vector와 비슷**하지만, **동기화 처리가 되어 있지 않다.**|
|LinkedList|**ArrayList와 동일**하지만, **`Queue` Interface를 구현**했기 때문에, **FIFO Queue 작업을 수행**한다.|

