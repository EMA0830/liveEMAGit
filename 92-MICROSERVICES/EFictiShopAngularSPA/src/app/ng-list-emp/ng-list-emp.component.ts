import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../model/employee.model';
import { NgEmployeeService } from '../service/ng-employee.service';


@Component({
  selector: 'app-ng-list-emp',
  templateUrl: './ng-list-emp.component.html',
  styleUrls: ['./ng-list-emp.component.css'],
})
export class NgListEmpComponent implements OnInit {
  employees?: Employee[];

  constructor(
    private employeeService: NgEmployeeService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe((data) => {
      this.employees = data;
      console.log('DATA : ' + data);
    });
  }

  addEmp(): void {
    this.router.navigate(['ng-add-emp']);
  }

  deleteEmp(employee: Employee): void {
    // this.employeeService.deleteEmployee(employee.id).subscribe((data) => {
    //   this.employees = this.employees.filter((empDel) => empDel != employee);
    // });
  }
}
