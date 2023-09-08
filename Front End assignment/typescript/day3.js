//json objject - java script object notation
//it s stores data is in key &value format
//json is used in restful API
var _a, _b;
var jsonObj = {
    id: 10,
    "fname": 'sindhu',
    lname: 'ja'
};
// (to access)use can two 1.dot operator 2.square operaor 
console.log("\n              ID    ::".concat(jsonObj.id, "\n              FirstNAme  ::").concat(jsonObj.fname, "\n              "));
//2.square op
console.log("\n         Id ::".concat(jsonObj["id"], "\n         Firstname  ::").concat(jsonObj['fname'], "\n"));
//Array of object
var arrObj = [
    {
        id: 10,
        "fname": 'sindhu',
        lname: 'ja',
        country: {
            ci: 1,
            cname: 'india'
        },
        month: ["jan", "feb", "ji=uly"],
        result: [
            {
                sub: "mathdada1",
                mark: 60
            },
            {
                sub: "mathsddadad3",
                mark: 55
            }
        ]
    },
    {
        ID: 55,
        fname: 'sindhuja_20202',
        month: ["jukyn", "feb", "augly"]
    },
    {
        id: 10,
        "fname": 'keerthana',
        lname: 'devi'
    }
];
for (var i = 0; i < arrObj.length; i++) {
    console.log("\n    id ::".concat(arrObj[i].id, "\n    firstname ::").concat(arrObj[i].fname, "\n    lnmae ::").concat(arrObj[i].lname, "\n    country ::").concat((_a = arrObj[i].country) === null || _a === void 0 ? void 0 : _a.ci, "\n    month ::").concat(arrObj[i].month, "\n    "));
    for (var j = 0; j < ((_b = arrObj[i].result) === null || _b === void 0 ? void 0 : _b.length); j++) {
        console.log("\n    id : ".concat(arrObj[i].result[j].sub));
    }
}
