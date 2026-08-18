/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {

    const gen=(function*(n){
        while(true){
            yield n++;
        };
    })(n);
    
    return function() {
        return gen.next().value;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */