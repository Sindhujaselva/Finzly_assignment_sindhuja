import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  name:string ='sindhuja';
  imgUrl:string='../../assets/1.jpg';

  constructor() { }

  ngOnInit(): void {
  }

}
