var array = [11,22,33,44];
for(let i=0;i<array.length;i++){
    console.log(array[i]);
}

console.log("---------------------");
var array2 = ["Annu","sumit","amit","ansh","ankit"];
for(let i=0;i<array2.length;i++){
    console.log(array2[i]);
}
// object array
console.log("---------------------");


let person = [{
    fname : "Annu",
    lname : "shrivas",
    dept : "developer"
},
{
    fname : "priya",
    lname : "shrivas",
    dept : "hr"  
}

]
for( key in person){
    console.log(person[key]);
}
console.log("-----------------------");
for( key of person){
    console.log(key);
}
console.log("-----------------------");
let person2 ={
    fname : "Priyanka",
    lname : "shrivas",
    dept : "hr" 
}
person.push(person2);
console.log("------------push-----------");
for( key in person){
    console.log(person[key])
}
console.log("----------pop-------------");
person.pop()
for( key in person){
    console.log(person[key])
}
console.log("----------sort-------------");
let arr3 = [1,65,4,23,6,74,0,00,34]
console.log(arr3.sort());
console.log("----------filter-------------");
let arr4 = arr3.filter(function(value){
    return value>23;
});
console.log(arr4);
console.log("----------filter  22-------------");

let arr5 = person.filter((key)=>{
    return key.dept =="hr";
})
console.log(arr5);