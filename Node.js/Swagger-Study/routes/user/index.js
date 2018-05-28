const router = require('express').Router();
const ctrl = require('./user.ctrl');

router.get('/', ctrl.getUser);

module.exports = router;