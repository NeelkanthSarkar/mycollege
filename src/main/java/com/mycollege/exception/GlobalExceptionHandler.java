package com.mycollege.exception;

import com.mycollege.general.APIResponse;
import com.mycollege.util.APIUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<APIResponse> handleDatabaseException(DatabaseException de){
        return new ResponseEntity<>(APIUtils.createFailureResponse(500,de.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException iae){
        return new ResponseEntity<>(APIUtils.createFailureResponse(400,iae.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException rte){
        return new ResponseEntity<>(APIUtils.createFailureResponse(500,rte.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
