package com.nosbielc.controller;

import com.nosbielc.data.CustomerData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 20/01/2020
 * @project Spring-Examples
 */

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping("/customer/{userId}")
    public CustomerData getCustomerProfile(@PathVariable("userId") String userId) {
        return getCustomer(userId);
    }

    private CustomerData getCustomer(final String userId) {
        return CustomerData.builder()
                .email("contact-us@nosbielc.com")
                .firstName("Demo")
                .lastName("User")
                .age(34)
                .id(userId)
                .build();
    }
}
