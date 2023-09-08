

//with para and without return type
var temp1 = function (a, b) {
    console.log((a + b));
};
//with return type and without para - ananymous function
var res = temp1(10, 2);
var temp11 = function () {
    return (5);
};


var res1 = temp11();
console.log(res1);
// fat arrow function -with return type and without para
var temp2 = function () {
    return (5 * 5);
};
var res2 = temp2();
console.log("without para and ith return type:" + res2);
// with para and without para
var temp4 = function (a, b) {
    console.log(a.concat(b));
};
var res3 = temp4("sindhu", "ja");
console.log(res3);
///////////////////************************************* */

// day 2 program 
var a5 = [5, "sindhu", true, 55, 100, 25, 88];
a5.push("ja");
a5.push(200);
console.log(a5);
a5.pop();
console.log(a5);
a5.splice(2, 0, 500);
console.log(a5);
a5.splice(2, 1);
console.log(a5);
var d = [55, 2, 1, 4, 78, 45];
for (var i = 0; i < a5.length; i++) {
    console.log(a5[i]);
}
var squ = d.map(function (Value) {
    return (Value * Value);
});
console.log(d);
console.log(squ);
var strcir = ["sindhu", "shakthi", "java", "core", "hello", "there", "dheepa"];
var a = strcir.slice(1, 5);
console.log(a, strcir);
