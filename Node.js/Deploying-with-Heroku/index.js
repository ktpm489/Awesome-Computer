const express = require('express');
const app = express();

app.use((req, res) => res.status(200).send(req.url))
    .listen(process.env.PORT || 8080, () => console.log(`Server is Running on ${process.env.PORT || 8080}`));
