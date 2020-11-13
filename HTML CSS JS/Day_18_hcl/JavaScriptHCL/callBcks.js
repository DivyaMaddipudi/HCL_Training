//how callback can improve the code : strategy design pattern

var add = (a, b) => a+b;
var sub = (a, b) => a-b;
var mul = (a, b) => a*b;
var div = (a, b) => a/b;

//OCP :open for extension close for modification
let  cal = function(a, b, callback) {
    return callback(a, b);
}
// console.log(cal(3, 4, add));
console.log(cal(3, 4, (a, b) => a*b));