## TDD Test

### Mocha
- Mocha는 Test Runner이고 결과 검증을 위해서는 Assertion 모듈을 추가해야 한다
- 보통 테스트 코드는 .spec을 파일 이름에 추가하거나 spec 폴더를 따로 생성한다
- package.json에 scripts 부분에 `"start": "node ./www/www.js"`를 추가하면 `npm start` 명령어로 서버를 실행할 수 있다.
- package.json에 scripts 부분에 `"test": "mocha ./index.spec.js"`를 추가하면 `npm test` 명령어로 테스트를 시작할 수 있다.

### should (Assertion Module)
- [Link](https://github.com/shouldjs/should.js)

### Super Test(HTTP Asssertion)
- [Link](https://github.com/visionmedia/supertest)

### Dev Dependencies

- -s로 Dependencies에 추가하는 것은 배포할 때에 필요할 모듈들을 추가하는 것이고, 테스트오와 같이 개발에만 필요한 모듈이라면 다음과 같은 명령어로 모듈을 추가할 수 있다.

```
$ npm i module_name --save-dev
```