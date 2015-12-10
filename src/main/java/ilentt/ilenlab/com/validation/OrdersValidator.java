package ilentt.ilenlab.com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ilentt.ilenlab.com.dom.Orders;

public class OrdersValidator implements Validator {
    @Override
    public boolean supports(Class<?> arg0) {
        return Orders.class.isAssignableFrom(arg0);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "jobTitle", "Orders.jobTitle.empty");
    }
}
