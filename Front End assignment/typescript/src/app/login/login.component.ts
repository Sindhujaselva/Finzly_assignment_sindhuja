import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  model = {
    username: '',
    password: ''
  };

  onSubmit() {
    // For now, we'll just log the form data to the console.
    console.log('Form submitted:', this.model);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
