let users = [{
    id: 1,
    name: "Kim"
},
{
    id: 2,
    name: "Lee"
},
{
    id: 3,
    name: "Choi"
}
]

const showAll = (req, res) => {
    req.query.limit = req.query.limit || 10;
    const limit = parseInt(req.query.limit, 10);
    if (isNaN(limit))
        res.status(400).end();
    else
        res.json(users.slice(0, limit));
}

const showUser = (req, res) => {
    const id = parseInt(req.params.id, 10);
    if (isNaN(id))
        return res.status(400).end();

    const user = users.filter(user => user.id === id)[0];
    if (!user)
        return res.status(404).end();

    res.json(user);
}

const deleteUser = (req, res) => {
    const id = parseInt(req.params.id, 10);
    if(isNaN(id))
        return res.status(400).end();

    users = users.filter(user => user.id !== id);
    res.status(204).end();
}

const  createUser = (req, res) => {
    const name = req.body.name;
    if(!name)
        return res.status(400).end();
    if(users.filter(user => user.name === name).length)
        return res.status(409).end();
    const id = Date.now();
    const user = {id, name};

    users.push(user);
    res.status(201).json(user);
}

module.exports = {
    showAll,
    showUser,
    deleteUser,
    createUser
};