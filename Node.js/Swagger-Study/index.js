const express = require('express');
const logger = require('morgan');

express()
    .use(logger('dev'))
    .use('/docs', require('./routes/docs/index'))
    .use('/user', require('./routes/user/index'))
    .get('/', (req, res) => {
        res.send('<h1>Hello, World!</h1>');
    })
    .listen(8080, () => {
        console.log('Listening');
    });