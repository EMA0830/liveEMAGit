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
