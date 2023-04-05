package ma.enset.ebankaccountsservice.service;

import ma.enset.ebankaccountsservice.dto.BankAccountRequestDTO;
import ma.enset.ebankaccountsservice.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
