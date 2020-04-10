package com.nstanogias.pmtoolrestapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProjectNotFoundExceptionResponse {

    private String ProjectNotFound;
}
