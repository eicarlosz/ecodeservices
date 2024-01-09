package com.ecode.customer.registration;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
