:beginner: _**display the empoloyees**_  

:one: _import HttpClientModule / app.module.ts_  
```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```

:two: _model/employee.model.ts_
```ts
export class Employee {
   id?: number;
   name?: string;
   salary?:number;
}

```
:three: _service/employee.service.ts_  
```ts
import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import {Employee} from '../model/employee.model'
// service shared by entire app
@Injectable({
  providedIn: 'root',
})
class EmployeeService {
   baseUrl : string = 'http://localhost:3000/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  getEmployees() {
     return this.http.get<Employee[]>(this.baseUrl);
  }
}

```

  
