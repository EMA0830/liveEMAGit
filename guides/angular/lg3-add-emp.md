:beginner: _**AddEmpComponent**_  

:one: _create comp_  
```ts
$ ng generate component add-emp
CREATE src/app/add-emp/add-emp.component.html (22 bytes)
CREATE src/app/add-emp/add-emp.component.spec.ts (627 bytes)
CREATE src/app/add-emp/add-emp.component.ts (278 bytes)
CREATE src/app/add-emp/add-emp.component.css (0 bytes)
UPDATE src/app/app.module.ts (476 bytes)

```
:two: _add ReactiveFormsModule_  
```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddEmpComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```

:three:  _add-emp.component.ts_  
```ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit {

  addEmpForm: FormGroup;
  constructor(private formBuilder : FormBuilder) { }

  ngOnInit(): void {
    this.addEmpForm = this.formBuilder.group({
      id:[],
      name: ['Sam',Validators.required,Validators.maxLength(5)],
      salary: ['1000', [Validators.required]]
    });
  }
}

```
:four: _add-emp.component.html_  
```html
<h1>Add Employee Details Form</h1>

<form [formGroup]="addEmpForm">
   Employee Id : 
   <input type="number" formControlName="id" >
   Name : 
   <input type="number" formControlName="name" >
   Salary : 
   <input type="number" formControlName="salary" >
</form>
```
:five: _app.component.html_  

```html
<app-add-emp></app-add-emp>
```
