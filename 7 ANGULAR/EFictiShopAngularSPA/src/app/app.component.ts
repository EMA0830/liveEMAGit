import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './model/employee.model';
import { EmployeeService } from './service/employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'EFictiShopAngularSPA';
  employees?: Employee[];

  constructor(private employeeService : EmployeeService) {
  }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      (data => {
        this.employees = data;
        console.log("DATA : " + data)
      })
    );
  }

}
