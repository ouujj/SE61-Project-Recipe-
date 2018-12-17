import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMakefoodComponent } from './add-makefood.component';

describe('AddMakefoodComponent', () => {
  let component: AddMakefoodComponent;
  let fixture: ComponentFixture<AddMakefoodComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddMakefoodComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddMakefoodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
