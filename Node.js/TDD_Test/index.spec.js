const assert = require('assert');
const should = require('should');
const request = require('supertest');
const app = require('./index');

describe('GET /users', () => {
    describe('Success', () => {
        it('Return Array', done => {
            /*         
                    assert를 이용한 검증
                    assert.equal(1,2);
             */
            /* 
                    should를 이용한 검증
                    (1).should.equal(1);
             */

            //      supertest를 이용한 검증
            request(app)
                .get('/users')
                .end((err, res) => {
                    res.body.should.be.instanceOf(Array);
                    res.body.forEach(user => {
                        user.should.have.property('name')
                    });
                    done();
                });
        });
        it('Response Until Limit Number', done => {
            request(app)
                .get('/users?limit=2')
                .end((err, res) => {
                    res.body.should.have.lengthOf(2);
                    done();
                })
        });
    });

    describe('Failure', () => {
        it('If limit isn\'t Integer, Response Code 400', done => {
            request(app)
                .get('/users?limit=two')
                .expect(400)
                .end(done);
        });
    });
});

describe('GET /users/:id', () => {
    describe('Success', () => {
        it('Return User Object', done => {
            request(app)
                .get('/users/1')
                .end((err, res) => {
                    res.body.should.instanceOf(Object);
                    res.body.should.have.property('id', 1);
                    done();
                })
        })
    })

    describe('Failure', () => {
        it('If id isn\'t Integer, Response Code 400', done => {
            request(app)
                .get('/users/one')
                .expect(400)
                .end(done);
        });
        it('If id isn\' exist, Response Code 404', done => {
            request(app)
                .get('/users/4')
                .expect(404)
                .end(done);
        });
    });
});

describe('DELETE /users/:id', () => {
    describe('Success', () => {
        it('Response Code 204', done => {
            request(app)
                .delete('/users/3')
                .expect(204)
                .end(done);
        })
    });

    describe('Failure', () => {
        it('If id isn\' Integer, Response Code 400', done => {
            request(app)
            .delete('/users/three')
            .expect(400)
            .end(done);
        });
    });
});

describe('POST /users', () => {
    describe('Success', () => {
        it('Response created user object with code 201', done => {
            request(app)
                .post('/users').send({name: 'Park'})
                .expect(201)
                .end((err, res) => {
                    res.body.should.have.property('name', 'Park');
                    done();
                });
        });
    });

    describe('Failure', () => {
        it('If name isn\' exist, Respone code 400', done => {
            request(app)
                .post('/users').send({})
                .expect(400)
                .end(done);
        });
        it('If name is duplicated, Response code 409', done => {
            request(app)
                .post('/users').send({name: 'Kim'})
                .expect(409)
                .end(done);
        });
    });
});