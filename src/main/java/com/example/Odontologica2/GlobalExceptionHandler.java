package com.example.Odontologica2;

import com.example.Odontologica2.service.TurnoService;
import org.apache.coyote.Response;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler
    public ResponseEntity<?> todosLosErrores(Exception e, WebRequest req){
        logger.error(e.getMessage());
        return  new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}