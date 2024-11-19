package Estudos.exceptions.solutionC.application;

import Estudos.exceptions.solutionC.business.Account;
import Estudos.exceptions.solutionC.exceptions.DomainException;

public class Main {
    public static void main(String[] args) {
        try {
            Account acc = new Account(123, "Joaquim", 1000.0, 300.0);
            System.out.println(acc);

            acc.deposit(200.0);
            System.out.println("After deposit: " + acc);

            acc.withdraw(250.0);
            System.out.println("After withdrawal: " + acc);

            acc.withdraw(500.0); // Vai lançar exceção
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
