var car = /** @class */ (function () {
    function car(newId, newName) {
        this.id = newId;
        this.name = newName;
    }
    car.prototype.show = function () {
        return this.name + " " + this.id;
    };
    return car;
}());
var obj = new car(1, "maruti");
console.log(obj.show());
