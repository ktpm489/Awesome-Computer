const express = require('express');
const bodyParser = require('body-parser');
const logger = require('morgan');
const app = express();

//app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));
app.use('/users', require('./routes/users/index'));
app.get('/', (req, res) => res.send("Hello, World!"));

module.exports = app;