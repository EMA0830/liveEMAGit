import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';

import { ReactiveFormsModule } from '@angular/forms';
import { AddEmpComponent } from './add-emp/add-emp.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmpComponent,

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
