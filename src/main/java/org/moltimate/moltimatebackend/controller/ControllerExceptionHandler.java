package org.moltimate.moltimatebackend.controller;

import org.moltimate.moltimatebackend.exception.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * This is a central location to define the response behavior for when Controllers encounter specific exceptions.
 */
@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {InvalidEcNumberException.class})
    protected ResponseEntity<Object> invalidEcNumber(InvalidEcNumberException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {InvalidPdbIdException.class})
    protected ResponseEntity<Object> invalidPdbId(InvalidPdbIdException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {InvalidMotifException.class})
    protected ResponseEntity<Object> invalidMotif(InvalidMotifException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {InvalidFileException.class})
    protected ResponseEntity<Object> invalidFile(InvalidFileException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {MotifFileParseException.class})
    protected ResponseEntity<Object> invalidFile(MotifFileParseException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {JobProcessingExeption.class})
    protected ResponseEntity<Object> jobProcessing(JobProcessingExeption ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.NON_AUTHORITATIVE_INFORMATION, request);
    }
}
