package com.ead.authuser.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameConstraintImpl implements ConstraintValidator<UsernameConstraint,String> {

    @Override
    public void initialize(UsernameConstraint usernameConstraint) {
       ConstraintValidator.super.initialize(usernameConstraint);
    }
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {

        return username != null && !username.trim().isEmpty() && !username.contains(" ");
    }
}
