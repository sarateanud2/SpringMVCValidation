package com.spring.mvc.valids;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Documented //It's used to make annotation of an interface
@Constraint(validatedBy = { PhoneValidation.class }) //we get Validation class for phone
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
	
	String message() default "{Phone}"; //The message element value is used to create the error message. See Section 5.3, “Message interpolation” for a detailed explanation.
	
	Class<?>[] groups() default {}; /*Every constraint annotation must define a groups element that specifies the processing groups with which the constraint declaration is associated.
									The default value must be an empty array.
									If no group is specified when declaring the constraint on an element, the Default group is considered declared.
									See Section 5.1.3, “groups” for more information.
									Groups are typically used to control the order in which constraints are evaluated, or to perform validation of the partial state of a JavaBean. */
	
	
	Class<? extends Payload>[] payload() default {};
	
	/*Constraint annotations must define a payload element that specifies the payload with which the constraint declaration is associated. The type of the payload parameter is Payload[].
	  Payloads are typically used by validation clients to associate some metadata information with a given constraint declaration. Payloads are typically non-portable. Describing payloads
	   as interface extensions as opposed to a string-based approach allows an easier and more type-safe approach.
		One use case for payload shown in Example 3.1, “Use of payload to associate severity to a constraint” is to associate a severity to a constraint. This severity can be exploited by a
		presentation framework to adjust how a constraint failure is displayed.
	  */
	
	/*Most of the part is boiler-plate code to confirm with JSR-303 specs. The most important part is @Constraint annotation where we provide the class that will be used for validation i.e PhoneValidator.*/

}
