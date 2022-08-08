package br.com.loja.exception;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException() {
        super();
    }

    public DomainException(String message){
        super(message);
    }
}
