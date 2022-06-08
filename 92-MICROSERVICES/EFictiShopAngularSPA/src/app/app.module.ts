import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { ListEmpComponent } from './list-emp/list-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { AddEmpTempDrivenComponent } from './add-emp-temp-driven/add-emp-temp-driven.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmpComponent,
    ListEmpComponent,
    EditEmpComponent,
    LoginComponent,
    AddEmpTempDrivenComponent,
  ],
  imports: [
    BrowserModule,
    // for services
    HttpClientModule,
    // Reactive Forms
    ReactiveFormsModule,
    // Template Driven Forms
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

