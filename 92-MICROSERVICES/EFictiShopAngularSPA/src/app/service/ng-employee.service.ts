import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { NgEmployee } from '../model/ng.employee.model';

// service shared by entire app
@Injectable({
  providedIn: 'root',
})
export class NgEmployeeService {
   baseUrl : string = 'http://localhost:8080/ema/ngapi/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  // returns Observable
  getEmployees() {
    // get : fetch data from server
     return this.http.get<NgEmployee[]>(this.baseUrl);
  }
  // // search employee by id
  // getEmployeeByid(id:number) {
  //   return this.http.get<Employee>(this.baseUrl+'/' + id);
  // }

  // //add employee
  // createEmployee(employee: Employee){
  //   // post : sending data to server
  //   return this.http.post(this.baseUrl,employee);
  // }
  
  // //update employee
  // updateEmployee(employee: Employee){
  //   // put : update data to server
  //   return this.http.put(this.baseUrl+'/'+employee.id,employee);
  // }
  // // delete employee by id
  // deleteEmployee(id:number) {
  //   // delete : delete data on server
  //   return this.http.delete<Employee>(this.baseUrl+'/' + id);
  // }
}
