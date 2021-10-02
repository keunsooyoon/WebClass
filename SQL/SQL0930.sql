날짜 관련 함수

데이터를 다루다 보면 날짜를 계산하고 처리할 일이 많다. 
날짜에 숫자를 더하거나 빼서 계산이 가능하다. 
날짜에서 날짜를 빼면 두 날짜 사이의 일수 를 계산할 수 있다. 

SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/HH24:MI') today,
        SYSDATE + 1 yesterday,
        SYSDATE - 1 tomorrow
FROM dual;


SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/HH24:MI') today,
        TO_DATE('20210930') - TO_DATE('20210925')
FROM dual;

