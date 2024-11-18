package Estudos.Exceptions.udemyGood.exceptions;

public class DomainException extends RuntimeException{
    // constructor
    public DomainException (String message) {
        super(message); // a mensagem da excecao eh herdada da superclasse RuntimeException
    }
}
