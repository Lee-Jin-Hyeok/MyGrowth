const express = require('express');
const app = express();

app.listen(8083, function(){
    console.log('listening on 8083');
});

app.get('/', function(req, res) {
    res.sendFile(__dirname + '/index.html');
});

app.get('/writing', function(req, res) {
    res.sendFile(__dirname + '/writing.html');
});