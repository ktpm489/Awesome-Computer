# Deploying with Heroku

- 자신이 직접 만든 서버를 호스팅 하고자 할 때 무료로 쉽게 이용할 수 있는 Paas 서비스인 Heroku를 통해 배포해보자.

## AWS EC2 vs Heroku (Iaas vs Paas)

- Iaas인 AWS EC2와 비교하여 Paas인 Heroku는 배포와 관리가 편리하다.
- Iaas(Infrastructure as a Service)는 제공된 인프라를 가지고 필요한 설정을 직접 해야 한다. 그러나 Paas(Platform as a Service)는 단지 자신의 애플리케이션을 배포하여 그 이외의 설정은 신경을 쓰지 않아도 된다.

## 사전준비
1. [Node.js/NPM](https://nodejs.org/en/), [Git](https://git-scm.com/)을 설치한다.
1. [Heroku](https://www.heroku.com/home)에서 회원가입한다
1. [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)를 다운받는다
1. `$ heroku login`을 입력하고 로그인한다

## 진행과정
1. 자신의 애플리케이션을 준비한다. 이때 포트는 `process.env.PORT`를 사용한다
1. `.git`이 있는 폴더, 즉 프로젝트 루트 폴더에서 `$ heroku create {project name}`으로 Heroku app을 생성한다. 이때 git remote에 `heroku`가 추가된다.
1. `$ git add .`으로 스테이징하고 `$ git commit`을 통해 커밋한 후 `$ git push heroku master`로 푸시한다.
1. `$ heroku ps:scale web=1`을 입력하여 하나의 앱이 실행되도록 한다.
1. `$ heroku open`을 입력 또는 http://your-app-name.herokuapp.com 에 요청을 보내면 하면 자신의 애플리케이션이 실행된다.
1. `$ heroku logs --tail`을 통해 앱의 로그를 확인할 수 있다.

## 참고
- [Heroku Getting Started with Node.js](https://devcenter.heroku.com/articles/getting-started-with-nodejs)
- 여기서 사용한 코드
```javascript
const express = require('express');
const app = express();

app.use((req, res) => res.status(200).send(req.url))
    .listen(process.env.PORT || 8080, () => console.log(`Server is Running on ${process.env.PORT || 8080}`));
```