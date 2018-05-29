const express = require('express');
const bodyParser = require('body-parser');
const logger = require('morgan');

express()
    .use(logger('dev'))
    .use(bodyParser.json())
    .use(bodyParser.urlencoded({extended: true}))
    .get('/', (req, res) => res.send(new Buffer('{"alg":"HS256","typ":"JWT"}').toString('base64')))
    .listen(3000, () => console.log('Listening'));