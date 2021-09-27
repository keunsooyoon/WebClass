IS NULL

데이터 값이 null인 경우를 조회하는 연산자.
null은 0이 아니다. 공백도 아니다. 

SELECT *
FROM employees
WHERE manager_id IS NULL;



논리연산자 

AND  모두 만족

OR   하나만 만족

NOT  반대

SELECT *
FROM employees
WHERE salary > 4000
AND job_id = 'IT_PROG';

employees 테이블에서 salary 3000 이상이면서 
job_id IT_PROG거나 FI_ACCOUNT



SELECT *
FROM employees
WHERE salary >= 3000
AND job_id = 'IT_PROG'
OR job_id = 'FI_ACCOUNT';


!= 같지 않다. 
<> 같지 않다. (ISO 표준)




########
함수
########

자주 쓰는 기능을 미리 만들어 놓고 필요할때 
호출한다. 
- 함수는 데이터 값을 계산하고 조작한다. 
- 함수는 행값들에 대해 계산/요약한다. 
- 함수는 열 데이터타입을 변환한다. 

단일행 함수 - 번에 하나의 데이터를 처리하는 함수
그룹함수 - 여러 데이터를 한번에 동시 처리하여 결과반환
GROUP BY와 함께 많이 사용된다. 





# 단일행 함수...


테이블의 열은 한가지 데이터타입으로만 지정된다. 
SQL에서의 데이터 타입은
(문자 CHAR    고정길이)
문자 VARCHAR 가변길이  VARCHAR2 
숫자 NUMBER   (다른 DB에서는  INT 로 표현하기도 한다. ) 
날짜 DATE    9999년 12월 31일까지만 저장할 수 있다. 

-문자 관련 함수들...
 LOWER 값을 소문자로
 UPPER 값을 대문자로
 INITCAP 첫 글자만 대문자로

 SUBSTR 문자열 중 일부분 선택
 REPLACE 찾아서 바꾼다
 CONCAT 문자열을 연결한다. 
 LENGTH 문자열의 길이를 구한다. 
 INSTR 문자의 위치를 구한다. 


SELECT last_name,
       LOWER(last_name),
       UPPER(last_name),
       email,
       LOWER(email)
FROM employees





# SUBSTR  문자열 중 일부분 선택
    (열이름, 시작, 몇개)

SELECT job_id, 
SUBSTR(job_id,1,2)
FROM employees;





