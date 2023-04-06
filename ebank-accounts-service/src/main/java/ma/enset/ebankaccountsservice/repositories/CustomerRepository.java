package ma.enset.ebankaccountsservice.repositories;

import ma.enset.ebankaccountsservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
