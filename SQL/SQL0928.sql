REPLACE - 특정 문자를 찾아서 바꾸자.
REPLACE('열이름','찾을 문자','바꿀 문자')


SELECT job_id,
REPLACE(job_id,'ACCOUNT','ACCNT')
FROM employees;


LPAD, RPAD : 특정 문자로 자릿수 채우기...

lpad는 왼쪽부터 특정 문자로 자리를 채우고
rpad는 오른쪽부터  특정 문자로 자리를 채운다. 

SELECT first_name, 
LPAD(first_name, 12,'*')
FROM employees;

12자리의 문자열 자리를 만들고 값이 12개보다 작으면 나머지는 왼쪽에서 '*'

SELECT first_name, 
RPAD(first_name, 12,' ')
FROM employees;


LTRIM, RTRIM : LTRIM 은 왼쪽부터 지정한 문자를 지우고
               RTRIM 은 오른쪽부터 지정한 문자를 지운다. 

SELECT job_id,
    LTRIM(job_id, 'F'),
    RTRIM(job_id, 'T')
FROM employees


LTRIM 함수를 사용하면서 F를 삭제 문자로 지정하면  왼쪽에서부터 F문자를 찾아서 삭제한다. RTRIM도 오늘쪽 부터 T찾아서 삭제한다. 


TRIM 공백을 제거하는 데 사용된다. , 단, 중간에 있는 공백은 제거할 수 없다. 


SELECT TRIM('     - space ')
FROM dual;

dual 테이블 oracle자체에서 제공되는 테이블 
     간단하게 함수를 이용해서 결과를 확인할 때 사용하는 테이블




================================================================

2  숫자 관련 함수들...

ROUND 반올림
TRUNC 숫자 절삭, 잘라 버린다. 버림
MOD 나머지를 구한다. 짝수, 홀수, 배수 
CEIL 올림
FLOOR 내림
SIGN 양수 음수 0
POWER  거듭제곱
SQRT  제곱근



ROUND - 반올림: 지정한 자리에서 반올림 자리는 생략가능 기본값은 0

1  2  3  .  4  5  6  7 
-3 -2 -1    0  1  2

SELECT salary,
        salary/30 일급
        
FROM employees


SELECT salary,
        ROUND(salary/30, 0) Daily,
        ROUND(salary/30, 1) Daily1,
        ROUND(salary/30, -1) Dailym1
FROM employees



