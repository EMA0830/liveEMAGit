// import RouterModule / in-app navigation among views defined in an application
// import Route /  a route configuration for the Router service. 
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpTempDrivenComponent } from "./add-emp-temp-driven/add-emp-temp-driven.component";
import { AddEmpComponent } from "./add-emp/add-emp.component";
import { EditEmpComponent } from "./edit-emp/edit-emp.component";
import { ListEmpComponent } from "./list-emp/list-emp.component";
import { LoginComponent } from "./login/login.component";
import { AuthGuard } from "./service/auth.guard";

export const routes : Routes = [
   {path:'', component:LoginComponent},
   {path:'login', component:LoginComponent},
   {path:'list-emp', component:ListEmpComponent, canActivate :[AuthGuard]},
   {path:'add-emp', component:AddEmpComponent,canActivate : [AuthGuard]},
   {path:'add-emp-temp-driven', component:AddEmpTempDrivenComponent,canActivate : [AuthGuard]},
   {path:'edit-emp', component:EditEmpComponent,canActivate : [AuthGuard]},
   {path:'**', component:LoginComponent},
]

@NgModule({
   imports : [CommonModule,RouterModule.forRoot(routes)],
   exports : [RouterModule],
   declarations : []
})
export class AppRoutingModule {

}