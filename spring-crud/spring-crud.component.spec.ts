import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpringCRUDComponent } from './spring-crud.component';

describe('SpringCRUDComponent', () => {
  let component: SpringCRUDComponent;
  let fixture: ComponentFixture<SpringCRUDComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SpringCRUDComponent]
    });
    fixture = TestBed.createComponent(SpringCRUDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
