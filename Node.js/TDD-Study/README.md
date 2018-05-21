## TDD Study

1. 테스트 케이스를 만든 후 그 테스트를 통과하게 하는 코드를 짠다.
2. 오류가 발생하면 그 오류를 해결하여 다시 테스트를 진행하며 개발한다.
3. 불필요한 코드를 삭제한다.

### Mocha
- Mocha는 Test Runner이고 결과 검증을 위해서는 Assertion(Ex. assert, should, chai) 모듈을 추가해야 한다
- 보통 테스트 코드는 .spec을 파일 이름에 추가하거나 spec 폴더를 따로 생성한다
- Mocha에는 Hooker라는 것이 존재한다. `before()`와 `after()`는 테스트를 실행하기 전/후에 한번, `beforeEach()`와 `afterEach()`는 모든 테스트를 실행하기 전/후에 실행한다.
- 자바스크립트에는 비동기 코드가 많은데, 테스트 할 때 이를 기다려줘야 할 필요가 있을 경우, `setTimeout()` 함수를 이용하여 콜백 메소드에서 `done()` 콜백함수를 실행시켜주면 테스트가 종료된다.

### should (Assertion Module)
- [Link](https://github.com/shouldjs/should.js)

### Super Test(HTTP Asssertion)
- [Link](https://github.com/visionmedia/supertest)

### package.json
- package.json에 scripts 부분에 `"start": "node ./www/www.js"`를 추가하면 `npm start` 명령어로 서버를 실행할 수 있다
- package.json에 scripts 부분에 `"test": "mocha ./index.spec.js"`를 추가하면 `npm test` 명령어로 테스트를 시작할 수 있다
- package.json에서는 wildcard 문자를 사용하여 `"test": "mocha ./routes/**/*.spec.js"`와 같이 모든 routes의 테스트를 실행할 수 있다

### Dev Dependencies

- -s 혹은 --save Dependencies에 추가하는 것은 배포할 때에 필요할 모듈들을 추가하는 것이고, 테스트오와 같이 개발에만 필요한 모듈이라면 다음과 같은 명령어로 모듈을 추가할 수 있다.

```
$ npm i module-name --save-dev
```