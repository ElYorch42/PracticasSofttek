import { TestBed } from '@angular/core/testing';

import { LoginService } from './login.service';
import { of, throwError } from 'rxjs';
import { HttpErrorResponse } from '@angular/common/http';

describe(' Esta prueba es unitaria para simular', () => {
  let service: LoginService;
  let httpClientSpy:{post: jasmine.Spy}

  beforeEach(() => {
    httpClientSpy = jasmine.createSpyObj('HttpClient', ['post']);
    service = new LoginService(httpClientSpy as any);
  });

  it('Debería retornar token (login - correcto)', (done: DoneFn) => {
    //TODO: Mock de datos 
    const mockSignin ={ 
        "email": "ggp@gmail.com",
        "password":"12345"
    }

    const mockJwtAuthentication = {
      "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJnZ3BAZ21haWwuY29tIiwiaWF0IjoxNzE2NDc5OTk1LCJleHAiOjE3MTY0ODE0MzV9.Tt1WpSYGOitAya9KxnGSc4FDlOs3BbEi6x1JKJZrVmc"
    }
    httpClientSpy.post.and.returnValue(of(mockJwtAuthentication))
    //Act
     service.autenticar(mockSignin)
            .subscribe(resultado => { //TODO: No se sabe el tiempo
              expect(resultado).toEqual(mockJwtAuthentication)
              done()
            })
    });

    it(`Deberia retornar error 403`, (done: DoneFn) => {
      //TODO: Mock de datos!  
      const mockSignin = {
        email: 'ggp@gmail.com',
        password: '12'
      }
  
      const error403 = new HttpErrorResponse({
        error: "Invalid user",
        status: 403, statusText: 'Forbidden'
      })
  
      httpClientSpy.post.and.returnValue(throwError(error403))
  
      //TODO:Act
      
      service.autenticar(mockSignin)
        .subscribe(res => {
  
        },
          error => {
            expect(error.status).toEqual(403);
            done()
          })
  
    })
});
