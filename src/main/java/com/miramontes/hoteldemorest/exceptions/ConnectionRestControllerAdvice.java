package com.miramontes.hoteldemorest.exceptions;

import com.fasterxml.jackson.core.JsonParseException;
import com.miramontes.hoteldemorest.client.generated.ResponseStatus;
import java.net.ConnectException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ConnectionRestControllerAdvice {

    public static final String BAD_JSON_REQUEST_MSG = "Check the JSON Request.";
    public static final String PROVIDER_IS_UNAVAILABLE_MSG = "Provider is unavailable.";

    @ExceptionHandler({ConnectException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseStatus connectionException(ConnectException e) {
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(HttpStatus.SERVICE_UNAVAILABLE.value());
        responseStatus.setMsg(PROVIDER_IS_UNAVAILABLE_MSG);
        return responseStatus;
    }

    @ExceptionHandler({JsonParseException.class, MethodArgumentTypeMismatchException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseStatus badRequestException(Exception e) {
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(HttpStatus.BAD_REQUEST.value());
        responseStatus.setMsg(BAD_JSON_REQUEST_MSG);
        return responseStatus;
    }
}
