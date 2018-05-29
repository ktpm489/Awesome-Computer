## Swagger Study

- Swaggger 에서 제공하는 Swagger-node는 원래 Express와 구조가 다르고 문서 찾기가 어렵고 Swagger-node-express는 쓰는데 거부감이 들어 Swagger-UI를 직접 연결해주려 한다.

### 진행 과정
1. `npm i swagger-ui-dist --save` 를 실행하여 `swagger-ui-dist`를 설치한다.
2. `const pathToSwaggerUi = require('swagger-ui-dist').absolutePath();`를 통하여 Swagger-ui-dist의 index.html을 가져온다.
3. `app.use('/docs/swagger-ui', express.static(pathToSwaggerUi));`을 추가하여 Swagger-UI를 가져온다.
4. 이 Swagger-UI는 Query String으로 `/docs/swagger-ui?url=/api-spec.json`과 같이 api 명세를 담은 json 파일을 전달해주면 json을 바탕으로 api 문서와 테스터를 작성해주기에 `api-spec.json`과 같은 제공해주는 url을 추가해줘야한다.
5. json 파일을 작성하고 `app.get('/docs/api-spec.json', (req, res) => res.json(require('./api-spec.json')));`를 추가하여 json 파일을 받을 수 있는 url을 추가한다.
6. 마지막으로 `app.get('docs/', (req, res) => res.redirect('/swagger-ui?url=/api-spec.json'));`처럼 Query String을 붙여줘 Redirect 시킨다.

### swagger-ui와 swagger-ui-dist의 차이
- swagger-ui는 Webpack, Browserify 등을 통해 종속성을 해결할 수있는 JavaScript 웹 응용 프로그램 프로젝트에서 사용하기위한 전통적인 npm 모듈입니다.
- swagger-ui-dist는 서버 측 프로젝트에서 Swagger-UI를 제공하거나 npm 모듈 종속성을 해결할 수없는 웹 프로젝트를 제공하는 데 필요한 모든 것을 포함하는 종속성없는 모듈입니다.

### 참고
- [기존 프로젝트와 Swagger-ui 연동하기](http://blog.jeonghwan.net/%EA%B8%B0%EC%A1%B4-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EC%99%80-swagger-ui-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0/)
- [swagger-ui](https://github.com/swagger-api/swagger-ui)