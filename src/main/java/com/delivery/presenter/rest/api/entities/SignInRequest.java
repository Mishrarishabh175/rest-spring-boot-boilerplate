package com.delivery.presenter.rest.api.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Value;


@Value
@AllArgsConstructor
@Setter
public class SignInRequest{

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 6, max = 50)
    private  String password;

	public SignInRequest() {
		super();
		this.email = "";
		this.password = "";
	}
    
}
