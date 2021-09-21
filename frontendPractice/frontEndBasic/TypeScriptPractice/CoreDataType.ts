let val : any;
val=555;
val= true;
function processdata(x:any,y:any)
{
    return x+y;
}
let result : any ;
result=processdata("hello",1);
result=processdata("hello","any");
result=processdata(2,1);
result=processdata("hello",true);

let var1: number;
let str: String;
var1=2.0;
let bol:boolean;


let ar =[1,2];
let ar1:string[];
let ar2:number[];
ar2=[2,3,4];

ar1 =['2','hello','2'];
console.log(ar1[0]);
for(let i=0;i<ar1.length;i++)
{
    console.log(ar1[i]);
}
for(let list in ar1)
{
    console.log(list);
}
for(let list of ar1)
{
    console.log(list);
}
let tupple:["apple","hello",1,3.5,true];//tuple implementation
console.log(tupple[0]);
for(let i=0;i<tupple.length;i++)
{
    console.log(tupple[i]);
}
