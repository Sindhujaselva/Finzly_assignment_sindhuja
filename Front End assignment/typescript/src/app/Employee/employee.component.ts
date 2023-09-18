import { Component } from "@angular/core";

@Component({
    selector:'app-employee',
    templateUrl:'./employee.component.html',
    styleUrls:['./employee.component.css']
})
export class EmployeeComponent{
    userInput: number = 1;
  result: boolean | null = null;

  checkPrime() {
    if (this.userInput <= 1) {
      this.result = false;
    } else if (this.userInput <= 3) {
      this.result = true;
    } else if (this.userInput % 2 === 0 || this.userInput % 3 === 0) {
      this.result = false;
    } else {
      let i = 5;
      while (i * i <= this.userInput) {
        if (this.userInput % i === 0 || this.userInput % (i + 2) === 0) {
          this.result = false;
          return;
        }
        i += 6;
      }
      this.result = true;
    }
  }

    
}