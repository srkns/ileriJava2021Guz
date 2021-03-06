package tr.edu.medipol.ilerijavadata.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import tr.edu.medipol.ilerijavadata.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);

}