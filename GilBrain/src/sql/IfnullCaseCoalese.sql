//IFNULL

SELECT IFNULL(Column명, "Null일 경우 대체 값") FROM 테이블명; 

// NAME Column이 NULL인 경우 "No name"을 출력, NULL이 아닌 경우 NAME Column을 출력
SELECT IFNULL(NAME, "No name") as NAME
FROM ANIMAL_INS


// NAME Column이 NULL이 True인 경우 "No name"을, False인 경우는 NAME Column을 출력
SELECT IF(IS NULL(NAME), "No name", NAME) as NAME
FROM ANIMAL_INS

// MS-SQL인 상황, ISNULL() 예시
// NAME Column이 NULL인 경우 "No name"을, Null이 아닌 경우 NAME Column의 값을 출력
SELECT ISNULL(NAME, "No name") as NAME
FROM ANIMAL_INS



//CASE
CASE 
    WHEN 조건식1 THEN 식1
    WHEN 조건식2 THEN 식2
    ...
    ELSE 조건에 맞는경우가 없는 경우 실행할 식
END



// NAME Column의 IS NULL 조건이 True인 경우 "No name" 출력
// WHEN 조건들에 True인 조건이 없을 경우 ELSE 문을 통해 NAME Column의 값 출력
// END 이후 그 Column의 별칭을 NAME으로 지정
SELECT 
    CASE
        WHEN NAME IS NULL THEN "No name"
        ELSE NAME
    END as NAME
FROM ANIMAL_INS


//COALESCE

// NULL 처리 상황
SELECT COALESCE(Column명1, Column명1이 NULL인 경우 대체할 값)
FROM 테이블명

// 배타적 OR 관계 열
// Column1 ~ 4 중 NULL이 아닌 첫 번째 Column을 출력
SELECT COALESCE(Column명1, Column명2, Column명3, Column명4)
FROM 테이블명

// NAME Column의 값이 NULL인 경우 다음 표현식으로 넘어간다.
// 다음 표현식인 "No name"이 Null이 아니므로 "No name"을 출력.
SELECT COALESCE(NAME, "No name")
FROM ANIMAL_INS

