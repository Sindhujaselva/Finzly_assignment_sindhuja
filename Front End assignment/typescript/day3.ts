//json objject - java script object notation
//it s stores data is in key &value format
//json is used in restful API

let jsonObj ={
    id:10 , //key can be double or sinngle quote;
    "fname":'sindhu',
    lname :'ja'
} 
// (to access)use can two 1.dot operator 2.square operaor 
console.log(`
              ID    ::${jsonObj.id}
              FirstNAme  ::${jsonObj.fname}
              `)

//2.square op
console.log(`
         Id ::${jsonObj["id"]}
         Firstname  ::${jsonObj['fname']}
`)
//Array of object
let arrObj = [
    {

    
    id:10 , //key can be double or sinngle quote;
    "fname":'sindhu',
    lname :'ja',
    country:{
        ci:1,
        cname:'india'

    },
    month :["jan","feb","ji=uly"],
    result:[
        {
            sub:"mathdada1";
            mark:60
        },
        {
            sub:"mathsddadad3",
            mark:55
        }
    ]
    },
    
    {
        ID :55,
        fname:'sindhuja_20202',
        month :["jukyn","feb","augly"]
    },

    {
        id:10 , //key can be double or sinngle quote;
    "fname":'keerthana',
    lname :'devi'
    }

];
for(let i =0;i<arrObj.length;i++){

    console.log(`
    id ::${arrObj[i].id}
    firstname ::${arrObj[i].fname}
    lnmae ::${arrObj[i].lname}
    country ::${arrObj[i].country?.ci}
    month ::${arrObj[i].month}
    `)
    for(let  j =0;j<arrObj[i].result.length;j++){
        console.log(`
        id : ${arrObj[i].result[j].sub}`)
    }
}



// arrObj[i].result.forEach((item)=>{
//     Console.log{`
//     ID ::${item.sub}`}
// })


