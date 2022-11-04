package ts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ts.model.Doctor;

@Service
public class DoctorDao {
	@Autowired
	private DoctorRepo crp;
	public List<Doctor> getAllDoctor() {
		return crp.findAll();
	}
	public Doctor getdoctorbyid(int id) {
		return crp.findById(id).orElse(new Doctor());
	}
	public Doctor register(Doctor cus) {
		return crp.save(cus);
	}
	public void deletebyid(int id) {
		 crp.deleteById(id);
	}
	public List<Doctor> getdocbytypeid(int id){
		return crp.getDoctorByTypeId(id);
	}
	
}
