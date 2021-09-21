
let person = [
    {
        fname : "priyanka",
        lname : "shrivas",
        age:21,
        dept : "manager"  
    },
    {
    fname : "Annu",
    lname : "shrivas",
    age:44,
    dept : "developer"
},
{
    fname : "priya",
    lname : "shrivas",
    age:22,
    dept : "hr"  
}


]

console.log("=====normal print========");
for( key in person){
    console.log(person[key]);
}

console.log("=============Sorting by age==========");
let Anotherperson = person.sort((x,y)=>{
    return x.age - y.age;
});
console.log(Anotherperson);


console.log("=============Sorting by name==========");
let Anotherperson2 = person.sort((x,y)=>{
    return x.fname.localeCompare(y.fname);
});

for( const key of Anotherperson2){
    console.log(key);
}

let fil = person.filter((key)=>{
    return key.age >18 && key.age <40;
})
console.log("=============Sorting by age 2==========");

for( const key of fil){
    console.log(key);
}