let  temp1 = function(a:number,b:number){
    console.log((a+b))
}
let res = temp1(10,2)


let  temp11 = function(){
    return(5)
}
var res1 = temp11()
console.log(res1)

// fat arrow function

let temp2 = ()=>{
    return (5*5)


}
let res2 = temp2()
console.log("without para and ith return type:"+res2);

let temp4 = (a:string,b:string) =>{
    console.log(a.concat(b))
}
let res3 = temp4("sindhu","ja")
console.log(res3)



///////////////////************************************* */

var a5 = [5,"sindhu",true,55,100,25,88]
a5.push("ja");
a5.push(200)
console.log(a5);

a5.pop();
console.log(a5);
a5.splice(2,0,500)
console.log(a5);

a5.splice(2,1)
console.log(a5);
 let d :number[] = [55,2,1,4,78,45];
 for(let i=0;i<a5.length;i++){
    console.log(a5[i])
 }



 let squ  = d.map((Value)=>{
    return(Value*Value)
 });
 console.log(d);
 console.log(squ);
 let strcir:string[] =["sindhu","shakthi","java","core","hello","there","dheepa"]
 let a = strcir.slice(1,5);
 console.log(a,strcir) 

