import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmpTempDrivenComponent } from './add-emp-temp-driven.component';

describe('AddEmpTempDrivenComponent', () => {
  let component: AddEmpTempDrivenComponent;
  let fixture: ComponentFixture<AddEmpTempDrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEmpTempDrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEmpTempDrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
