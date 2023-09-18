import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homework',
  templateUrl: './homework.component.html',
  styleUrls: ['./homework.component.css']
})
export class HomeworkComponent implements OnInit {
  inputvalue = ''
  inputWidth = 150;
  onInputFocus(){
    this.inputWidth = 250;

  }
  onInputBlur() {
    // Restore the default width when the input is blurred
    this.inputWidth = 150; // Adjust to the default width
  }
  imageOpacity = 1; // Initial opacity value (1 for fully opaque)

  onMouseOver() {
    // Set a lower opacity value when the mouse is over the div
    this.imageOpacity = 0.7; // Adjust the desired opacity as needed
  }

  onMouseOut() {
    // Restore the full opacity value when the mouse leaves the div
    this.imageOpacity = 1
  }

constructor() { }

  ngOnInit(): void {
  }

}

