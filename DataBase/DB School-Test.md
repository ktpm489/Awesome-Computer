## 데이터베이스 시험

### 1. 다음 용어를 설명하시오.
1. Relation
    - **비슷한 성격을 가지고 있는 데이터들의 집합**으로 Tuple과 Attribute(속성)로 구성되어 2차원 테이블 구조를 이루고 있다.
        
2. Schema
    - 데이터베이스의 **자료의 구조, 자료의 표현 방법, 자료 간의 관계**를 형식 언어로 **정의한 구조**이다.
3. Relation Instance
    - Schema에 따라 생성된 **Tuple의 집합**이다.
4. Relation Degree / Cardinality
    - Relation의 **Attribute의 개수를 Degree(차수)**라 하고, **Relation의 Tuple 개수를 Cardinality**라 한다.
5. Domain
    - 한 **Attribute(속성)가 가질 수 있는 값의 범위**를 나타낸다.
6. Tuple
    - 속성의 모임으로 **Relation의 각각의 행**을 의미한다.

---

### 2. 후보키와 기본키의 차이점을 설명하시오.
- 후보키 : 최소한의 속성의 집합만으로 Tuple을 구별할 수 있는 즉, **최소성과 유일성을 가진 슈퍼키**
- 기본키 : **후보키 중 Tuple을 식별하기 위해 선택된 키**로, NULL값과 중복값을 가질 수 없다.
- **후보키는 기본키와 대체키를 포함**하지만, **기본키는 선택된 키**만 나타낸다.

---

### 3. 도메인 제약조건을 설명하시오.
- 각 속성은 반드시 **원자 값**을 가져야 하며 **도메인의 정의된 범위와 유형에 맞는 값**만 취할 수 있다.

---

### 4. 기본키 제약조건을 설명하시오.
- 테이블은 하나의 기본 키(Primary Key)를 가지며 **기본 키로 선택된 열은 고유하여야 하고 NULL값을 허용하지 않는다**.

---

### 5. 외래키 제약조건(참조 무결성 제약조건)을 설명하시오.
- 참조하는 외래키의 속성은 항상 **참조되는 릴레이션에 기본키로 존재**해야 하고 기본키 중 하나와 일치하거나 NULL값을 가져야 한다.

---

### 6. 참조무결성 제약조건의 옵션 네가지를 설명하시오.
- 제한(Restricted): 문제가 되는 **연산을 제한**한다.
- 연쇄(Cascade): 참조되는 릴레이션에서 튜플을 삭제하고 참조하는 릴레이션에서 이 튜플을 참조하는 **튜플들도 함께 삭제**한다.
- 널값(Nullify): 참조되는 릴레이션에서 튜플을 삭제하고 참조하는 릴레이션에서 이 튜플을 참조하는 **튜플들의 외래키에 NULL값을 넣는다**.
- 기본값(Default): 참조되는 릴레이션에서 튜플을 삭제하고 참조하는 릴레이션에서 이 튜플을 참조하는 **튜플들의 외래키에 Default(기본)값을 넣는다**.

---

### 7. 다음 릴레이션을 보고 물음에 답하시오.

> Employee는 사원, Department는 부서, Project는 프로젝트 내용, Works는 사원이 프로젝트에 참여한 내용을 나타낸다. 한 사원이 여러 프로젝트에서 일하거나 한 프로젝트에서 여러 사원이 일할 수 있다. hours-worked 속성은 각 사원이 각 프로젝트에서 일한 시간을 나타낸다.
> ```
> Employee(empno, name, phoneno, address, position, deptno)
> Department(deptno, deptname, manager)
> Project(projno, projname, deptno)
> Works(empno, projno, hours-worked)
> ```

1. 각 릴레이션의 기본키를 정하시오.
    - Employee: (empno)
    - Department: (deptno)
    - Project: (projno)
    - Works: (empno, projno)
2. 릴레이션 간의 관계를 살펴보고, 외래키를 작성하시오.
    - 몰라요 ㅜㅠ
3. 다음 질문에 대하여 관계대수식을 작성하시오.
    1. 모든 직원의 이름을 보이시오
    2. 팀장의 이름과 주소를 보이시오.
    3. IT부서에서 일하는 직원의 이름과 주소를 보이시오.
    4. '미래' 프로젝트에서 일하는 직원의 이름을 보이시오.
    5. '김철수' 팀장의 부서에서 일하는 직원의 이름을 보이시오.