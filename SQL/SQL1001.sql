변환함수...

SQL 은 데이터 타입을 규정하고 있다. 데이터 형을 변환할 필요가 생긴다. 자동으로 (암묵적)변환 혹은 사용자가 수동으로(명시적) 변환 한다. 

'1234' -> 1234


SELECT 1 + '2'
FROM dual;

'2' 작은따옴표로 묶여 있어 숫자가 아닌 문자이다. 그럼에도 불구하고 결과는 3이라고 연산되어 출력된다. 시스템에의한 타입변환이다. 
자동 데이터 타입변환을 할수 있더라도 성능과 안정성을 위해서 수동으로 데이터 타입변환을 수행하는 것이 바람직하다. (권장)


날짜 와 시간 형식 변환

TO_CHAR : 날짜 숫자 문자값을 문자열로 변환하는 함수


문자로
SELECT TO_CHAR(SYSDATE, 'YY'),
       TO_CHAR(SYSDATE, 'MM')
FROM dual;

숫자로
SELECT TO_NUMBER('123')
FROM dual;


날짜로
SELECT TO_DATE('20211001','YYMMDD')
FROM dual;



NOT NULL 처리하기 
특정 열의 행에 데이터 값이 없으면 null 이된다. '값이 없다' 테이블이 정의 할때 null값을 가지지 못하게 지정할 수 있다. 

null은 적용이 불가능한 값
0이나 공백이 아니다. 
null값을 포함하는 연산의 결과는 null

SELECT * 
FROM employees
ORDER BY commission_pct;


SELECT salary * commission_pct
FROM employees
ORDER BY commission_pct;

Null 아닐때는 제대로 계산이 되지만 null 일때는 null로 계산된다. 경우에따라서 null을 다른 값을 대체해야 할 경우가 있다. 


SELECT salary * NVL(commission_pct,1)
FROM employees
ORDER BY commission_pct;




DECODE : 조건 논리 처리  IF ELSE와 유사한 사용
        SQL문 작성시 매우 자주 사용된다. 



SELECT first_name,
       salary,
       department_id,
       DECODE(department_id, 60, salary*1.1, salary)
       DECODE(department_id, 60, '10% Up', 'None')
FROM employees;



CASE : 복잡한 조건식 논리 처리











