# join - 테이블 들을 연결/ 붙인다. 중간고사 테이블과 기말고사 테이블을 하나의 테이블로 연결


# 2개 테이블 연결
SELECT *
FROM employees A, departments B
WHERE A.department_id = B.department_id

# 3개 테이블 연결
SELECT A.employee_id, A.department_id, 
       B.department_name, C.location_id, C.city
FROM employees A, departments B, locations C
WHERE A.department_id = B.department_id
AND B.location_id = C.location_id



SELECT COUNT(*)     # 106개
FROM employees A, departments B
WHERE A.department_id = B.department_id


SELECT COUNT(*)
FROM employees      # 107개



# Self Join

SELECT A.employee_id, A.first_name, A.last_name, A.manager_id,
       B.first_name|| ' ' || B.last_name manager_name
From employees A, employees B
WHERE A.manager_id = B.manager_id

동일한 employees  테이블을 사용하여 A테이블은 manager_id, B테이블은 employee_id로 조인하여 매니저가 누구인지 이름을 출력.
같은 테이블을 사용하지만 각기 다른 별명을 사용하기 때문에 마치 다른 두개의 테이블을 조인하는 것처럼 보인다. self조인을 할때는 반드시 '별명.열이름' 형태로 명확하게 조회한다. 