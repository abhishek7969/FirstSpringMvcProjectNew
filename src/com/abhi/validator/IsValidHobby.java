package com.abhi.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface IsValidHobby { 

	String listOfValidHobbies() default "music|football|cricket|hockey";
	
	String message() default  "Please provide a valid Hobby: accepted hobbies are- music ,football, cricket and hockey.";

	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default{};
}
