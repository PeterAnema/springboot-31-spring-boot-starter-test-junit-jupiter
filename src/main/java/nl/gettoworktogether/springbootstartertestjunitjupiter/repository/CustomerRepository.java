package nl.gettoworktogether.springbootstartertestjunitjupiter.repository;

import nl.gettoworktogether.springbootstartertestjunitjupiter.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByLastName(String name);

}
