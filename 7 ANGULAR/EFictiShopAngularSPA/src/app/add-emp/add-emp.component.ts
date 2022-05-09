import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit {

  addEmpForm: FormGroup;
  constructor(private formBuilder : FormBuilder) { }

  ngOnInit(): void {
    this.addEmpForm = this.formBuilder.group({
      id:[],
      name: ['Sam',Validators.required,Validators.maxLength(5)],
      salary: ['1000', [Validators.required]]
    });
  }

}