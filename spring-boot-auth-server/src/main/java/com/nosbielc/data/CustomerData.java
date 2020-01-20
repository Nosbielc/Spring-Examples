package com.nosbielc.data;

import lombok.*;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 20/01/2020
 * @project Spring-Examples
 */

@Getter
@Builder
public class CustomerData {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String id;
}
