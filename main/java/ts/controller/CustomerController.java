package ts.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ts.dao.Customerdao;
import ts.model.Customer;

@RestController
public class CustomerController {
//	String str1,str2;
	@Autowired
	Customerdao empDao;

	@GetMapping("/getcustomer/{cid}")
	public Customer getcustomer(@PathVariable("cid") int empId){
		Customer cmr=empDao.getcustomerbyid(empId);
		String str1,str2="";
		str1=cmr.getPassword();
	    for(int i=0;i<str1.length();i++) {
	    	System.out.println(str1.charAt(i)-16);
	    	str2=str2+(char)(str1.charAt(i)-16);
	    }
	    System.out.println(str2);
	    cmr.setPassword(str2);
		return cmr;
	}
	@PostMapping("/registercustomer")
	public Customer register(@RequestBody Customer customer){
		String str1,str2="";
		str1=customer.getPassword();
	    for(int i=0;i<str1.length();i++) {
	    	System.out.println(str1.charAt(i)+16);
	    	str2=str2+(char)(str1.charAt(i)+16);
	    }
	    customer.setPassword(str2);
	    System.out.println(str1);
		return empDao.register(customer);
	}
	@GetMapping("/getAllcustomers")
	public List<Customer> getAllCustomer(){
		List<Customer> cmr=empDao.getAllCustomers();
		for(int i=0;i<cmr.size();i++) {
			String str1,str2="";
			str1=cmr.get(i).getPassword();
		    for(int j=0;j<str1.length();j++) {
		    	System.out.println(str1.charAt(j)-16);
		    	str2=str2+(char)(str1.charAt(j)-16);
		    }
		    cmr.get(i).setPassword(str2);
		    System.out.println(str2);
//		    cmr.setPassword(str2);
		
			
		}

		return cmr;
	}
	@DeleteMapping("/deletecustomerbyid/{deptId}")
	public void deletedept(@PathVariable("deptId") int deptId) {
		empDao.deletebyid(deptId);
		
		}
	@PutMapping("/updatecustomer")
	public Customer update(@RequestBody Customer customer) {
		return empDao.register(customer);
	}
	@GetMapping("/getcustomerbyemail/{email}/{password}")
	public Customer getcustomerbyemail(@PathVariable("email") String email,@PathVariable("password") String password) {
		System.out.println("email:"+email+" password:"+password);
//		Customer cmr=empDao.getcustomerbyemail(email,password);
		String str1,str2="";
		str1=password;
	    for(int i=0;i<str1.length();i++) {
	    	System.out.println(str1.charAt(i)+16);
	    	str2=str2+(char)(str1.charAt(i)+16);
	    }
	    System.out.println(str2);
	    Customer cmr=empDao.getcustomerbyemail(email,str2);
	    str1="";
	    str2="";
	    str1=cmr.getPassword();
	    for(int i=0;i<str1.length();i++) {
	    	System.out.println(str1.charAt(i)-16);
	    	str2=str2+(char)(str1.charAt(i)-16);
	    }
	    cmr.setPassword(str2);
	    

		return cmr;
	}

	
	
}
