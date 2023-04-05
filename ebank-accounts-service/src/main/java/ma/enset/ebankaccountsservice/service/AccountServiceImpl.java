package ma.enset.ebankaccountsservice.service;

import ma.enset.ebankaccountsservice.dto.BankAccountRequestDTO;
import ma.enset.ebankaccountsservice.dto.BankAccountResponseDTO;
import ma.enset.ebankaccountsservice.entities.BankAccount;
import ma.enset.ebankaccountsservice.enums.AccountType;
import ma.enset.ebankaccountsservice.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service @Transactional
public class AccountServiceImpl implements AccountService {
    private BankAccountRepository bankAccountRepository;

    public AccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
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

        BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder()
                .id(savedBankAccount.getId())
                .balance(savedBankAccount.getBalance())
                .createdAt(savedBankAccount.getCreatedAt())
                .currency(savedBankAccount.getCurrency())
                .type(savedBankAccount.getType())
                .build();
        return bankAccountResponseDTO;
    }
}
