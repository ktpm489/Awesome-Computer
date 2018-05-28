function getUser(req, res) {
    let user = [
        {
            'name': 'kim',
            'age': 18
        },
        {
            'name': 'lee',
            'age': 18
        }
    ];
    res.json(user);
}

exports.getUser = getUser;