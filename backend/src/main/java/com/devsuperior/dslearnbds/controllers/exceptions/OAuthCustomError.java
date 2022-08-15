package com.devsuperior.dslearnbds.controllers.exceptions;

import lombok.*;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OAuthCustomError implements Serializable {
    private static final long serialVersionUID = 1L;

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
