package ts.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ts.model.Customer;
import ts.model.Doctor;


@Service
public class Customerdao {
	@Autowired
	private CustomerRepo crp;
	public List<Customer> getAllCustomers() {
		return crp.findAll();
	}
	public Customer getcustomerbyid(int id) {
		return crp.findById(id).orElse(new Customer());
	}
	public Customer register(Customer cus) {
		return crp.save(cus);
	}
	public void deletebyid(int id) {
		 crp.deleteById(id);
	}	
	public Customer getcustomerbyemail(String email,String password) {
		return crp.getCustomerByEmailAndPassword(email,password);
	}
	
	
	
	
	
	
	
}
