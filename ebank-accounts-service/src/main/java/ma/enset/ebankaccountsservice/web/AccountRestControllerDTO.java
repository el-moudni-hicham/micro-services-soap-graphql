package ma.enset.ebankaccountsservice.web;

import ma.enset.ebankaccountsservice.dto.BankAccountRequestDTO;
import ma.enset.ebankaccountsservice.dto.BankAccountResponseDTO;
import ma.enset.ebankaccountsservice.mappers.AccountMapper;
import ma.enset.ebankaccountsservice.repositories.BankAccountRepository;
import ma.enset.ebankaccountsservice.service.AccountService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountRestControllerDTO {
    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    //Injection par Constrecteur pas @Autowired
    public AccountRestControllerDTO(BankAccountRepository bankAccountRepository, @Qualifier("asm") AccountService accountService, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    // Save Account
    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO){
        return accountService.addAccount(requestDTO);
    }

}
