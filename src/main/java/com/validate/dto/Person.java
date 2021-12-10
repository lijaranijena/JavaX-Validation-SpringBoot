package com.validate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Valid
public class Person {

    @NotNull(message = "name should not be null")
    private String personName;
    @NotNull(message = "address should not be null")
    private String address;
    @NotNull(message = "email should not be null")
    @Email(message = "Email is not valid")
    private String gmailId;
    @Pattern(regexp = "\\d{6}", message = "pincode Number should be 6 digit")
    @NotNull(message = "pincode should not be null")
    private String pinCode;
}
