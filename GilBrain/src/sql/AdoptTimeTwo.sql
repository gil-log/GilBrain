WITH RECURSIVE HOUR AS(
SELECT 0 AS h # 3번 정리(비반복문)
UNION ALL # 2번 정리(UNION 사용)
SELECT h+1 FROM HOUR WHERE h<23); # 4,5번 정리( HOUR 참조, where 정지조건)

SELECT h AS HOUR, COALESCE(COUNT(ANIMAL_ID),0) AS COUNT
FROM HOUR LEFT JOIN ANIMAL_OUTS ANI ON HOUR.h = HOUR(ANI.DATETIME)
GROUP BY HOUR.h;