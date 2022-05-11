:beginner: _**List Emp with Bootstrap & Reactive Forms**_  

:keyboard: **bootstrap**  

```sh
npm install @bootstrap  --save 
```

:point_right: style.css
```html
/* You can add global styles to this file, and also import other style files */
@import "~bootstrap/dist/css/bootstrap.css"
```

:point_right: emp-list  

```html
<br><br>
<div class="container">
 
   <!-- event / actions like mouse click / (click) event binding -->
   <button (click)="addEmp()" class="btn btn-info">Add Employee</button>
   <br><br>
   <h4>Employee Details</h4>
   <div>
      <div  class="table-striped" style="width:500px">
         <table class="table">
            <thead>
               <tr>
                  <th>Id</th>
                  <th>Name</th>
                  <th>Salary</th>
               </tr>
            </thead>
            <tbody>
               <tr *ngFor="let employee of employees">
                  <td> {{employee.id}}</td>
                  <td>{{employee.name}}</td>
                  <td> {{employee.salary}}</td>
               </tr>
            </tbody>
         </table>
      </div>   
   </div>
</div>
<!-- <div *ngFor="let employee of employees">
   {{employee.id}}
   {{employee.name}}
   {{employee.salary}}
</div> -->
```
```ts
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../model/employee.model';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-list-emp',
  templateUrl: './list-emp.component.html',
  styleUrls: ['./list-emp.component.css']
})
export class ListEmpComponent implements OnInit {

  employees?: Employee[];

  constructor(private employeeService : EmployeeService, private router:Router) {
  }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      (data => {
        this.employees = data;
        console.log("DATA : " + data)
      })
    );
  }

  addEmp() : void {
this.router.navigate(["add-emp"]);
  }
}

```

:point_right: app-component
  
```html
<div class="container">
   <br><br>
<h3> {{title}}</h3>
<router-outlet></router-outlet>
</div>
<!-- <div *ngFor="let employee of employees">
   {{employee.id}}
   {{employee.name}}
   {{employee.salary}}
</div> -->
<!-- child component -->
<!-- <app-add-emp></app-add-emp> -->
```

