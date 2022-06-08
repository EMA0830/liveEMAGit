import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import {Employee} from '../model/employee.model'
import { MicroEmployee } from '../model/micro.employee.model';
// service shared by entire app
@Injectable({
  providedIn: 'root',
})
export class MicroEmployeeService {
   baseUrl : string = 'http://localhost:8076/ema/api/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  // returns Observable
  getEmployees() {
    // get : fetch data from server
     return this.http.get<MicroEmployee[]>(this.baseUrl);
  }

}
