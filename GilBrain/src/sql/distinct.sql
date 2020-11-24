SELECT column1 
FROM table 
GROUP BY column1;

// sal 평균이 1000 이상인 deptno와 sal 평균을 출력
SELECT deptno, AVG(sal)
FROM emp
GROUP BY deptno
HAVING AVG(sal) >= 1000;

explain select * from user group by name ;

explain select * from user group by name order by null;

// 이런 형태의 쿼리는 서브 쿼리를 사용하지 않으면 GROUP BY로는 작성하기 어렵다.
SELECT COUNT(DISTINCT column1) 
FROM table;

// 집계 함수(Aggregation)가 필요한 경우에는 GROUP BY를 사용해야 한다.
SELECT column1, MIN(column2), MAX(column2) 
FROM table 
GROUP BY column1;


// column1 컬럼은 unique 값, column2는 전체 값 출력을 원하지만
// column2 전체 값을 출력할 수 없다.
SELECT DISTINCT(column1), column2 
FROM table;


SELECT column1, column2 
FROM table 
GROUP BY column1;
