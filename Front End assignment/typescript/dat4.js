"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.keyValue = exports.show = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(id, name, salary, role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    Employee.prototype.display = function () {
        console.log("\n----------------Employee Details---------------\n                Employee Id     :: ".concat(this.id, "\n                Employee name   :: ").concat(this.name, "\n                Employee salary :: ").concat(this.salary, "\n                Emoloyee role   :: ").concat(this.role, "\n        "));
    };
    Employee.prototype.taxCalculation = function () {
        var newSalary = this.salary * 12;
        if (newSalary < 300000) {
            console.log("Tax " + 0);
        }
    };
    return Employee;
}());
exports.Employee = Employee;
var obj = new Employee(1, "sindhujaa", 200000, "Dev");
obj.display();
obj.taxCalculation();
function show(a, b) {
    console.log(a + " " + b);
}
exports.show = show;
exports.keyValue = 972002;
