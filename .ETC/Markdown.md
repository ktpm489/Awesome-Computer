Markdown 이란?
------------

- 마크다운은 일반 텍스트 문서의 양식을 편집하는 문법이다.
- 주로 깃허브 README 문서를 정리할때 이용된다.
- 마크다운은 HTML로의 변환이 쉽기에 블로깅 할때에도 이용된다.
- 이 문서에는 **깃허브에서만 동작하는 문법**이 있을수 있으므로 사용시 주의 바란다.

Markdown의 문법
-----------

### 제목

```
# 이것은 <h1> 태그입니다
## 이것은 <h2> 태그입니다
###### 이것은 <h6> 태그입니다

이것은 <h1> 태그와 동일합니다
=======================

이것은 <h2> 태그와 동일합니다
---------------------------
```

> # 이것은 `<h1>` 태그입니다
> ## 이것은  `<h2>` 태그입니다
> ###### 이것은 `<h6>` 태그입니다
>
> 이것은 `<h1>` 태그와 동일합니다
> =======================
>
> 이것은 `<h2>` 태그와 동일합니다
> ---------------------------

-----------------------------


### 강조
```
*이 문장은 이탤릭체입니다*
_이 문장도 이탤릭체입니다_
**이 문장은 굵은 글씨입니다**
__이 문장도 굵은 글씨입니다__

_이렇게 **합칠수도** 있습니다_

~~이런것도 있어요~~
```

> *이 문장은 이탤릭체입니다*
> _이 문장도 이탤릭체입니다_
> 
> **이 문장은 굵은 글씨입니다**
> __이 문장도 굵은 글씨입니다__
>
> _이렇게 **합칠수도** 있습니다_
> 
> ~~이런것도 있어요~~

-----------------------------

### 리스트

##### 순서가 없는 리스트

```
* 요소1
* 요소2
    * 요소2-1
    * 요소2-2
* 요소3
- 요소4
- 요소5
```

> * 요소1
> * 요소2
>     * 요소2-1
>     * 요소2-2
> * 요소3
> - 요소4
> - 요소5

##### 순서가 있는 리스트

```
1. 요소1
1. 요소2
1. 요소3
```

> 1. 요소1
> 1. 요소2
> 1. 요소3

**Note**
- 앞의 숫자는 상관 없이 순서대로 적용된다.

-----------------------------

### 이미지

```
![Image](./test.jpg)
```

**Note**
- 형식 : ![텍스트](이미지 링크)
- 예시가 없습니다

-----------------------------

### 링크

```
http://github.com
[GitHub](http://github.com)
```

> http://github.com
> [GitHub](http://github.com)

**Note**
- 형식 : [텍스트](보여줄 링크)

-----------------------------

### 인용문

```
어느 옛날에 어떤 사람이 말했다.
> 이런들 어떠하리
> 저런들 어떠하리
```

> 어느 옛날에 어떤 사람이 말했다.
> > 이런들 어떠하리
> > 저런들 어떠하리

-----------------------------

### 코드

##### 블록

```
/ ```
/ 안녕하세요
/ 이것은 코드블럭입니다
/ ```
```

> ```
> 안녕하세요
> 이것은 코드블럭입니다
> ```

**Note** : 
- 아포스트로피(') 가 아닌 억음부호(`) 입니다.
- / 는 제외.

##### 코드 HighLighting

```
/ ```c
/ #include <stdio.h>
/ 
/ int main(void)
/ {
/         printf("Hello World!");
/ 
/     return 0;
/ }
/ ```
```

> ```c
> #include <stdio.h>
> 
> int main(void)
> {
>     printf("Hello World!");
> 
>     return 0;
> }
> ```

**Note**
- 아포스트로피(') 가 아닌 억음부호(`) 입니다.
- ' / ' 는 제외.

##### 범위 지정

```
`printf` 함수는 stdio.h에 있습니다.
```

> `printf` 함수는 `stdio.h`에 있습니다.

**Note**
- 아포스트로피(') 가 아닌 억음부호(`) 입니다.

--------------------------

### 작업 목록

```
[x] 마크다운 문서 정리하기
[ ] GitHub에 올리기
[ ] 과제 하기
```

> [x] 마크다운 문서 정리하기
> [ ] GitHub에 올리기
> [ ] 과제 하기

-------------------------

### 이모티콘

```
와 정말 멋져요 :+1::+1:!!
```

> 와 정말 멋져요 :+1::+1:!!

**Note**
- [이모티콘 코드 찾는곳](https://www.webpagefx.com/tools/emoji-cheat-sheet/)

-------------------------

### 마크다운 문법 무시

```
_**마크다운** 문법은 필요 합니다_
\_\**마크다운\** 문법은 필요가 없습니다\_
```

> _**마크다운** 문법은 필요 합니다_
> \_\*\*마크다운\*\* 문법은 필요가 없습니다\_

--------------------------

### 표 넣기

```
|  목록      | 가격    | 평점  |
| :-         | -:     | :-:   |
| 컴퓨터     | 100만원 |  7    |
| 스마트폰   | 90만원  |  10   |
```

> |  목록      | 가격    | 평점  |
> | :-         | -:     | :-:   |
> | 컴퓨터     | 100만원 |  7    |
> | 스마트폰   | 90만원  |  10   |

**Note**
- | 를 이용하여 표를 그리고, 콜론(:)과 하이픈(-)을 이용하여 정렬할 수 있다.

--------------------------

### 수식

```
$$x = {-b\pm\sqrt{b^2 - 4ac} \over 2a}$$
$$ sum_{i=1}^{10} 10i$$
```

> $$x = {-b\pm\sqrt{b^2 - 4ac} \over 2a}$$
> $$ sum_{i=1}^{10} 10i$$

**Note**
- [문법 정리](http://csrgxtu.github.io/2015/03/20/Writing-Mathematic-Fomulars-in-Markdown/)

--------------------------

### 가로줄 넣기

```
문단1

--------------

문단2
```

> 문단1
> 
> --------------
> 
> 문단2

--------------------------

> **참고** : 
> - **https://guides.github.com/features/mastering-markdown/**
> - **https://help.github.com/articles/basic-writing-and-formatting-syntax/**