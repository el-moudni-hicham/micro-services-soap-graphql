package ma.enset.ebankaccountsservice.web;

import ma.enset.ebankaccountsservice.dto.BankAccountRequestDTO;
import ma.enset.ebankaccountsservice.dto.BankAccountResponseDTO;
import ma.enset.ebankaccountsservice.entities.BankAccount;
import ma.enset.ebankaccountsservice.repositories.BankAccountRepository;
import ma.enset.ebankaccountsservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    @Qualifier("asm")
    private AccountService accountService;

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found ! ", id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id, bankAccount);
    }

    @MutationMapping
    public Boolean deleteAccount(@Argument String id){
        bankAccountRepository.deleteById(id);
        return true;
    }
}

/*
record BankAccountDTO(Double balance, String type, String currency){}
 */