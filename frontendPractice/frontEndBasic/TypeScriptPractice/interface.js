var Employee = /** @class */ (function () {
    function Employee(f, l, age) {
        this.firstName;
        this.lastName;
        this.age;
    }
    Employee.prototype.fullName = function () {
        return this.firstName + " " + this.lastName;
    };
    return Employee;
}());
var myemp = new Employee("hemashree", "shrivastava", 23);
console.log(myemp.fullName());
