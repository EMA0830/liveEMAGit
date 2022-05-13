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
      // loginid: [],
      // password: [],
    });
  }

  onSubmit() {
    console.log('Logging in....');
    console.log(this.loginForm.value);
    console.log(this.loginForm.controls['loginid'].value);
    console.log(this.loginForm.controls['password'].value);

    const loginid : string = this.loginForm.controls['loginid'].value;
    const password : string = this.loginForm.controls['password'].value;

    if(loginid == 'teddy' && password == "bear"){
      sessionStorage.setItem('loggedIn','yes');
      this.router.navigate(['list-emp']);
    }
    else
    {
      this.loginForm.controls['loginid'].setValue("");
      this.loginForm.controls['password'].setValue("");
      this.router.navigate(['login']);
    }
    // this.employeeService
    //   .createEmployee(this.loginForm.value)
    //   .subscribe((data) => {
    //     console.log('Data Saved!');
    //     this.router.navigate(['list-emp']);
    //   });
  }
}
