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
