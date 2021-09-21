class  car
{
    id: number;
    name:String;
    constructor(newId : number,newName:String)
    {
        this.id=newId;
        this.name=newName;

    }
    show():String{
        return this.name + " "+this.id;
    }
}
let obj = new car(1,"maruti");
console.log(obj.show());