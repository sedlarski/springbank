package com.springbank.user.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String id;
    @NotEmpty(message = "Please enter a valid first name")
    private String firstname;
    @NotEmpty(message = "Please enter a valid last name")
    private String lastname;
    @Email(message = "Please enter a valid email address")
    private String emailAddress;
    @NotNull(message = "Please provide account details")
    private Account account;
}
