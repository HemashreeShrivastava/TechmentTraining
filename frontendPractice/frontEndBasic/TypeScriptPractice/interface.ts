interface person
{
    firstName : String;
    lastName : String;
    age:String;
}
class Employee implements person{

firstName : String;
    lastName : String;
    age:String;

    fullName()
    {
        return this.firstName+" "+this.lastName;
    }
    constructor(f:String,l:String,age:number)
    {
        this.firstName;
        this.lastName;
        this.age;
    }
    
}
let myemp=new Employee("hemashree","shrivastava",23);
console.log(myemp.fullName());