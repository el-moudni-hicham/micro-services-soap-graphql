package ma.enset.ebankaccountsservice.repositories;

import ma.enset.ebankaccountsservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}
