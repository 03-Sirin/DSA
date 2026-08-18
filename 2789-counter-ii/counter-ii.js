/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let initial=init
    function increment(){ return ++init};
    function reset() {
        init=initial
        return init;
    }
    function decrement(){
        return --init;
    }
    return {
        increment:increment,
        reset:reset,
        decrement:decrement
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */