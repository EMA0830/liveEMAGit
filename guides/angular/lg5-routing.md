:beginner: _**routing**_  

:one: _add components_  
```sh
$ ng generate component list-emp
$ ng g c edit-emp
```
:two: _create routing module_  
```ts
// import RouterModule / in-app navigation among views defined in an application
// import Route /  a route configuration for the Router service. 
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpComponent } from "./add-emp/add-emp.component";
import { EditEmpComponent } from "./edit-emp/edit-emp.component";
import { ListEmpComponent } from "./list-emp/list-emp.component";

export const routes : Routes = [
   {path:'', component:ListEmpComponent},
   {path:'list-emp', component:ListEmpComponent},
   {path:'add-emp', component:AddEmpComponent},
   {path:'edit-emp', component:EditEmpComponent},
   {path:'**', component:ListEmpComponent},
]

@NgModule({
   imports : [CommonModule,RouterModule.forRoot(routes)],
   exports : [RouterModule],
   declarations : []
})
export class AppRoutingModule {

}
```
:three: _add routing module to app module_  
```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';

import { ReactiveFormsModule } from '@angular/forms';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { ListEmpComponent } from './list-emp/list-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    AddEmpComponent,
    ListEmpComponent,
    EditEmpComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

```
:four: _router outlet_  
