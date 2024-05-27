import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchComponent } from './switch.component';

describe('SwitchComponent', () => {
  let component: SwitchComponent;

  beforeEach(async () => {
    component = new SwitchComponent();
  });

  it('deberia cambiar el valor del boolean en cada click', () => {
    expect(component.active).toBeTrue();
    component.handleClick();
    expect(component.active).toBeFalse();
  });

  it('deberia modificarse el mensaje cuando cambiamos el boolean', () => {
    expect(component.message).withContext('Antes del click').toMatch(/encendido/);
    component.handleClick();
    expect(component.message).withContext('Despues del click').toMatch(/apagado/);
  });

 
});
