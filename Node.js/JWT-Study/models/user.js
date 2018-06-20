const mongoose = require('mongoose');

const User = new mongoose.Schema({
    eMail: String,
    pw: String,
    tags: Array
});

/*
    Shcema.statics는 Model에 정적 메소드를 추가한다.
*/
User.statics.create = function (eMail, pw) {
    const user = new this({
        eMail,
        pw
    });

    return user.save();
};

User.statics.findOneByEmail = function (eMail) {
    return this.findOne({
        eMail
    }).exec();
};

User.statics.verify = function(pw) {
    return this.pw === pw;
};

module.exports = mongoose.model('user', User);