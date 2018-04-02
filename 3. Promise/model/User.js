const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const  User = new Schema({
    id: String,
    pw: String,
    age: Number
});

module.exports = mongoose.model('user', User);