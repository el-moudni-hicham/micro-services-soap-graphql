package ma.enset.ebankaccountsservice.entities;

import ma.enset.ebankaccountsservice.enums.AccountType;

import java.util.Date;

public class BankAccount {
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountType type;

}
