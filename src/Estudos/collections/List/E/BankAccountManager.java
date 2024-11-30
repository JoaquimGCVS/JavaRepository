package Estudos.collections.List.E;

import java.util.ArrayList;
import java.util.List;

public class BankAccountManager {
    private List<BankAccount> accounts;
    public BankAccountManager() {
        accounts = new ArrayList<>();
    }
    public double getMaxBalance() {
        return accounts.stream().mapToDouble(BankAccount::getBalance).max().orElse(0.0);
    }
}
