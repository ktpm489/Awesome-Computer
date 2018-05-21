const router = require('express').Router();
const ctrl = require('./users.ctrl');

router.get('/', ctrl.showAll);
router.get('/:id', ctrl.showUser);
router.delete('/:id', ctrl.deleteUser);
router.post('/', ctrl.createUser);

module.exports = router;