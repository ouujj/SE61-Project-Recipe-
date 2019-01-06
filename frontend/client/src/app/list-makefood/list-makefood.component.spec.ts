import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMakefoodComponent } from './list-makefood.component';

describe('ListMakefoodComponent', () => {
  let component: ListMakefoodComponent;
  let fixture: ComponentFixture<ListMakefoodComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListMakefoodComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListMakefoodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
