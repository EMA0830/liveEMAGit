import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import {Employee} from '../model/employee.model'
// service shared by entire app
@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
   baseUrl : string = 'http://localhost:3000/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  getEmployees() {
     return this.http.get<Employee[]>(this.baseUrl);
  }
}
