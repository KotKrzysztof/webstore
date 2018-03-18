package com.packt.webstore.validator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;
import javax.validation.*;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = ProductIdValidator.class)
@Documented
public @interface ProductId {
	   String message() default "{com.packt.webstore.validator.ProductId.message}";

	    Class<?>[] groups() default {};
	    
	    public abstract Class<? extends Payload>[] payload() default {};
}
