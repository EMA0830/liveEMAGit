import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-emp-temp-driven',
  templateUrl: './add-emp-temp-driven.component.html',
  styleUrls: ['./add-emp-temp-driven.component.css'],
})
export class AddEmpTempDrivenComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  onSubmit(addForm: any) {
    console.log(addForm)
    var firstName = addForm.firstName
    console.log(firstName)
    var salary = addForm.salary
    console.log(salary)
  }
}
