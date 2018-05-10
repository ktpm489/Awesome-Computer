## 민감한 정보 숨기기

Github와 같이 공개된 웹사이트에 소스코드를 올릴 때, API Key나 로그인 정보 등은 가려서 올려야 한다. 이때 어떻게 민감한 정보를 숨기는지를 설명한다. (With Node.js)

### 개발할 때의 방법

1. 다음과 같이 민감한 정보를 담고있는 config.js 파일을 만든다

```javascript
const keys = {
    ID: "test123",
    PW: "test123",
    API_KEY: "ABCD1234"
};

module.exports = keys;
```

2. 그 민감한 정보를 사용할 소스코드에서 require를 이용해서 불러온다.

```javascript
const KEYS = require('./config.js');

let requestURL = `https://www.abc.com/api?id=${KEYS.ID}&pw=${KEYS.PW}&apiKey=${KEYS.API_KEY}`;
```

3. 다음과 같이 config.js를 커밋목록에서 제외시키는 .gitignore 파일을 추가한다

```
# 민감한 정보 #
config.js
```

### 배포할 때의 방법 (Heroku)

1. 필요한 정보들을 다음과 같은 명령어로 환경변수에 추가한다. Heroku가 아니더라도 각 플랫폼마다의 방법을 이용하여 환경변수를 설정해준다.

```
//환경변수 설정
$ heroku config:set varName=value
$ heroku config:set id=test123
$ heroku config:set pw=test123
$ heroku config:set apiKey=ABCD1234

//환경변수 값 확인
$ heroku config:get varName

//환경변수 삭제
$ heroku config:unset varName
```

2. `process.env`를 이용하여 접근한다.

```javascript
const ID = process.env.id;
const PW = process.env.pw;
const API_KEY = process.env.apiKey;
```

3. 개발과 배포할 때를 둘 다 고려하여 다음과 같이 사용할 수 있다.

```javascript
const KEYS = require('./config.js');

const ID = process.env.id || KEYS.ID;
const PW = process.env.pw || KEYS.PW;
const API_KEY = process.env.apiKey || KEYS.API_KEY;
```