:beginner: _**Authentication using AuthGuard**_  

:one: _create AuthGuard_  

```ts
import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  CanActivate,
  Router,
  RouterStateSnapshot,
  UrlTree,
} from '@angular/router';
import { Observable } from 'rxjs';
@Injectable({
   providedIn:'root',
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router) {}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ):
    | boolean
    | UrlTree
    | Observable<boolean | UrlTree>
    | Promise<boolean | UrlTree> {
    if (sessionStorage.getItem('loggedIn') == 'yes') {
      return true;
    }
    this.router.navigate(['/login']);
    return false;
  }
}

```

:two: _configure routing module to use AuthGuard_

```ts
// import RouterModule / in-app navigation among views defined in an application
// import Route /  a route configuration for the Router service. 
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpComponent } from "./add-emp/add-emp.component";
import { EditEmpComponent } from "./edit-emp/edit-emp.component";
import { ListEmpComponent } from "./list-emp/list-emp.component";
import { LoginComponent } from "./login/login.component";
import { AuthGuard } from "./service/auth.guard";

export const routes : Routes = [
   {path:'', component:LoginComponent},
   {path:'login', component:LoginComponent},
   {path:'list-emp', component:ListEmpComponent, canActivate :[AuthGuard]},
   {path:'add-emp', component:AddEmpComponent,canActivate : [AuthGuard]},
   {path:'edit-emp', component:EditEmpComponent,canActivate : [AuthGuard]},
   {path:'**', component:LoginComponent},
]

@NgModule({
   imports : [CommonModule,RouterModule.forRoot(routes)],
   exports : [RouterModule],
   declarations : []
})
export class AppRoutingModule {

}
```

:three: _login form_  
```ts
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

```
