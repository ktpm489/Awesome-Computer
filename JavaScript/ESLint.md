## [ESLint](https://eslint.org/)

- 기존에는 세미콜론(;)을 붙이려 하였지만 개발을 하다보니까 붙이는곳이 있고, 안붙이는 곳이 있다. 혹은 쓰지 않는 변수들이 존재하는 경우가 있다. 이를 줄이고자 ESLint를 사용해보고자 한다.

1. `npm i -g eslint`를 통해 eslint를 글로벌로 설치한다.
2. 작업 할 프로젝트 폴더에서 `eslint --init`를 실행한다.
3. 할 옵션을 선택한다.
4. console을 사용할 경우, rules에 `"no-console" : "off"`를 추가한다.
5. eslint를 적용하지 않을 경우 .eslintignore 파일을 만들어 .gitignore과 같이 사용한다.

## ESLint 쉽게 적용하기

- devDependencies에 추가하는 방법은 끌리지 않아서 다른 방법을 사용할 것이다.

1. package.json의 scripts에 다음과 같이 입력한다.
```
"start": "eslint **/*.js --ignore-pattern node_modules/ && node ./index.js"
```
2. `npm start` 명령어를 실핸한다.
3. Eslint에서 오류가 나는 경우, 뒤의 명령어가 실행이 되지 않는다.