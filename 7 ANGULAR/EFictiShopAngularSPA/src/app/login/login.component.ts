import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
// import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    // private employeeService: EmployeeService,
    private router:Router
  ) {}

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      loginid: ["teddy"],
      password: ["bear"],
    });
  }

  onSubmit() {
    console.log('Logging in....');
    console.log(this.loginForm.value);
    // this.employeeService
    //   .createEmployee(this.loginForm.value)
    //   .subscribe((data) => {
    //     console.log('Data Saved!');
    //     this.router.navigate(['list-emp']);
    //   });
  }
}
