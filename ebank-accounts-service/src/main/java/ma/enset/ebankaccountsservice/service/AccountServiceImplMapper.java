package ma.enset.ebankaccountsservice.service;

import ma.enset.ebankaccountsservice.dto.BankAccountRequestDTO;
import ma.enset.ebankaccountsservice.dto.BankAccountResponseDTO;
import ma.enset.ebankaccountsservice.entities.BankAccount;
import ma.enset.ebankaccountsservice.mappers.AccountMapper;
import ma.enset.ebankaccountsservice.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service("asm") @Transactional

public class AccountServiceImplMapper implements AccountService {
    private BankAccountRepository bankAccountRepository;

    private AccountMapper accountMapper;

    public AccountServiceImplMapper(BankAccountRepository bankAccountRepository, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .type(bankAccountDTO.getType())
                .balance(bankAccountDTO.getBalance())
                .createdAt(new Date())
                .currency(bankAccountDTO.getCurrency())
                .build();

        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);

        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(savedBankAccount);
        return bankAccountResponseDTO;
    }
}
