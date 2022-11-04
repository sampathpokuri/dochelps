package ts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ts.model.Customer;




@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	@Query(value ="select c from Customer c where c.email = ?1 and c.password =?2")
	public Customer getCustomerByEmailAndPassword(String email,String password);
}

