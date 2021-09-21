var val;
val = 555;
val = true;
function processdata(x, y) {
    return x + y;
}
var result;
result = processdata("hello", 1);
result = processdata("hello", "any");
result = processdata(2, 1);
result = processdata("hello", true);
var var1;
var str;
var1 = 2.0;
var bol;
var ar = [1, 2];
var ar1;
var ar2;
ar2 = [2, 3, 4];
ar1 = ['2', 'hello', '2'];
console.log(ar1[0]);
for (var i = 0; i < ar1.length; i++) {
    console.log(ar1[i]);
}
for (var list in ar1) {
    console.log(list);
}
for (var _i = 0, ar1_1 = ar1; _i < ar1_1.length; _i++) {
    var list = ar1_1[_i];
    console.log(list);
}
var tupple; //tuple implementation
//console.log(tupple[0]);
for (var i = 0; i < tupple.length; i++) {
    console.log(tupple[i]);
}
