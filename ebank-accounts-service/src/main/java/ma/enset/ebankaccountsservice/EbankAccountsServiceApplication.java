package ma.enset.ebankaccountsservice;

import ma.enset.ebankaccountsservice.entities.BankAccount;
import ma.enset.ebankaccountsservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class EbankAccountsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankAccountsServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository){
        return args -> {
            for (int i = 0; i < 10; i++) {
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .build();
            }
        };
    }

}
