import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css'],
})
export class AddEmpComponent implements OnInit {
  addForm: FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    private employeeService: EmployeeService,
    private router:Router
  ) {}

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      id: [],
      // name: ['Sam',Validators.required,Validators.maxLength(5)],
      // salary: ['1000', [Validators.required]]
      name: [],
      salary: [],
    });
  }

  onSubmit() {
    console.log('Employee details sent to server..');
    this.employeeService
      .createEmployee(this.addForm.value)
      .subscribe((data) => {
        console.log('Data Saved!');
        this.router.navigate(['list-emp']);
      });
  }
}
