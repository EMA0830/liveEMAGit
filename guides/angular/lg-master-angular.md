:books: **Angular Master Guide**  

:beginner: _**section 1**_  


:one: _create angular project_  
 
```sh
ng new ProjectName
```
:two: _run angular proj_  
```sh
ng serve
```

:three: _install library_  
```sh
npm install  --save @bootstrap  
npm install -s @bootstrap
npm install -s @angular/materail
```

:four: _create component_  
`Angular components are defined in three files: an HTML file for the layout (view), a TypeScript file for the logic (controller), and a CSS file for the style.`

`The command below creates a new component called myComponent and its corresponding TypeScript, HTML, and CSS files in the folder /src/app/my-component/. `
```sh
ng generate component myComponent
ng g c testComponent
```
:five: _Instantiating that component into the HTML layout of another one_  
```html
<app-my-component></app-my-component>
```

:six: _Routing_  

`Routing is one of the most essential aspects of single-page application (SPA) development frameworks like Angular or React. With routing, you can introduce navigation between screens (actually, between Angular components) in your app.First of all, you have to define the routes in the app-routing.module.ts file`

```ts
// import RouterModule / in-app navigation among views defined in an application
// import Route /  a route configuration for the Router service. 
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpTempDrivenComponent } from "./add-emp-temp-driven/add-emp-temp-driven.component";
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
   {path:'add-emp-temp-driven', component:AddEmpTempDrivenComponent,canActivate : [AuthGuard]},
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

:seven: _Data Binding_  
`One-way data binding is the mechanism for rendering in the view objects defined in the controller (property binding) and for allowing the view to call methods in the controller (event binding)`

```html
<!-- event binding -->
  <button (click)="addEmp()" class="btn btn-info">Add Employee</button>

<!-- string interpolation -->
  <td> {{employee.id}}</td>
```

:eight: _Structural Directives_  
`
Structural directives allow the developers to include some code logic inside the HTML template in a very quick and easy way in order to determine when and how many times an HTML element has to be rendered.`

```html
  <tr *ngFor="let employee of employees">
```
:nine: _Template-Reference Variables_  
`Inside the template of a component, we can assign a reference to an HTML element so we can access its content from other elements inside the DOM.`
```html
<form #addForm="ngForm" (ngSubmit)="onSubmit(addForm.value)">
```

:beginner: _**section 2**_  

:one: _forms_  
` two types of forms: template-driven and reactive. The first are easier to use, but the latter are more recommended for large forms, providing a more robust input validation`

:two: _Template-driven forms_  
`import the FormsModule into the app.module.ts file. The next step is to define a dictionary to store the data submitted by the user and a method to process that data once submitted. This is all done in the component controller.`

```ts
  imports: [
    // Template Driven Forms
    FormsModule,
  ],
```
```html
 <input type="text" required ngModel minlength="3" maxlength="7" #firstName="ngModel" name="firstName"><br><br>
```
```ts
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

```
:three: _Reactive forms_
`before creating the form, you have to define the model of your form with a TypeScript class`
```ts
export class Employee {
   id?: number;
   name?: string;
   salary?:number;
}
```
```ts
    BrowserModule,
    HttpClientModule,
    // Reactive Forms
    ReactiveFormsModule,
  ],
```

:four: _Communication With External APIs_  
`services, promises, and observables`

`services as components without an UI — therefore, they only consist of a single TypeScript file.`

`They usually perform tasks like fetching data from a backend or processing user input. Even though those tasks could be done inside a component, it’s a better approach to make components as simple as possible, leveraging services for all of the complex tasks. Services can be auto-injected into components in a single line of code, so they’re also a very good way of recycling code.`
```ts
@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
   baseUrl : string = 'http://localhost:3000/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  // returns Observable
  getEmployees() {
    // get : fetch data from server
     return this.http.get<Employee[]>(this.baseUrl);
  }
```
```ts
imports: [
    BrowserModule,
    // for services
    HttpClientModule,
    // Reactive Forms
    ReactiveFormsModule,
    // Template Driven Forms
    FormsModule,
    AppRoutingModule
  ],
```

```ts
export class AddEmpComponent implements OnInit {
  addForm: FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    private employeeService: EmployeeService,
    private router:Router
  ) {}
```

:five: _Promises_  
`Promises are a JavaScript mechanism for asynchronous programming, in which a pending value is returned, which might be available soon (resolve) or never (reject).`

:six: _HttpClient_  
```ts
 // search employee by id
  getEmployeeByid(id:number) {
    return this.http.get<Employee>(this.baseUrl+'/' + id);
  }

  //add employee
  createEmployee(employee: Employee){
    // post : sending data to server
    return this.http.post(this.baseUrl,employee);
  }
  
  //update employee
  updateEmployee(employee: Employee){
    // put : update data to server
    return this.http.put(this.baseUrl+'/'+employee.id,employee);
  }
  // delete employee by id
  deleteEmployee(id:number) {
    // delete : delete data on server
    return this.http.delete<Employee>(this.baseUrl+'/' + id);
  }
```
:beginner: _**Route Guards**_  

` want users to navigate based on some specific condition, such as authenticated (e.g. Logged-in user) user should have access to the dashboard`
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
