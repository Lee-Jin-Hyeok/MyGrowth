const express = require('express');
const app = express();
const MongoClient = require('mongodb').MongoClient;
app.set('view engine', 'ejs');

var db;
MongoClient.connect('mongodb://127.0.0.1:27017', {useUnifiedTopology:true}, function(err, client) {
    if(err) return console.log(err);

    db=client.db('schedule');

    app.listen(8083, function(){
        console.log('listening on 8083');
    });
});

app.use(express.json());
app.use(express.urlencoded({extended : false}));

app.get('/', function(req, res) {
    res.sendFile(__dirname + '/index.html');
});

app.get('/writing', function(req, res) {
    res.sendFile(__dirname + '/writing.html');
});

app.get('/list', function(req, res) {
    db.collection('todo').find().toArray(function(err, result) {
        console.log(result);
        res.render('list.ejs', {lists:result});
    });
});

app.delete('/delete', function(req, res) {
    console.log(req.body);
    req.body._id = parseInt(req.body._id);
    db.collection('todo').deleteOne({_id : req.body._id}, function(err, result) {
        console.log("예외 발생");
    });
    res.send('삭제완료');
});

app.post('/add', function (req, res) {
    db.collection('counter').findOne({name:'발행게시물'}, function(err, result) {
        console.log(result);
        db.collection('todo').insertOne({_id:result.total+1, 할일:req.body.todo, 날짜:req.body.date});
        db.collection('counter').updateOne({name:'발행게시물'}, {$inc:{total:1}}, function (err, result) {
            if(err) return console.log(err);
            console.log(result);
        });
    });
});