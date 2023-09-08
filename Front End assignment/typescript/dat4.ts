export class Employee{
    public id:number;
    public name:string;
    public salary:number;
    public role:string;

    constructor(id:number,name:string,salary:number,role:string){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.role=role;
    }

    public display()
    {
        console.log(`
----------------Employee Details---------------
                Employee Id     :: ${this.id}
                Employee name   :: ${this.name}
                Employee salary :: ${this.salary}
                Emoloyee role   :: ${this.role}
        `);
    }

    public taxCalculation()
    {
        let newSalary=this.salary*12;

        if(newSalary <  300000)
        { 
            console.log("Tax "+0);
        }
        
    }
}

let obj=new Employee(1,"sindhujaa",200000,"Dev");
obj.display();
obj.taxCalculation();

export function show(a:string,b:string)
{
    console.log(a+" "+b);
}

export const keyValue=972002;
