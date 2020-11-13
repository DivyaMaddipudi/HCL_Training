// function foo(a) {
//     console.log("hello" + a);
// }

// function show(callback, v) {

//     console.log(typeof(callback)=="function");
//     callback(v);
// }

// show(foo, "divya");

setTimeout(() => console.log("i am going to be called"), 1);
console.log("end");

function add(a, b) {
    console.log(a+b);
}

add(5, 6);