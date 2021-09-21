/*
function fuctionName()
{
    function body
}
function function_name (param1[:type], param2[:type], param3[:type])
*/
function hello() {
    console.log("hello world");
}
hello();
function add(num1, num2, num3, num4) {
    if (num3 === void 0) { num3 = 8; }
    return num1 + num2 + num3;
}
console.log(add(2, 8, 9));
