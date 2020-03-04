package com.databaserelationship.dbrelationonetomany.resources.request;

import com.databaserelationship.dbrelationonetomany.resources.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InternRequest {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("gender")
    private Gender gender;
}
