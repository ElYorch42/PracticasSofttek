package com.softtek.mayo16.servicio;

import com.softtek.mayo16.dao.request.SignInRequest;
import com.softtek.mayo16.dao.request.SignUpRequest;
import com.softtek.mayo16.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}
