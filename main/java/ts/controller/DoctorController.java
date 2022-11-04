package ts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ts.dao.DoctorDao;
import ts.model.Doctor;

@RestController
public class DoctorController {

	@Autowired
	DoctorDao empDao;

	@GetMapping("/getDoctor/{empId}")
	public Doctor getDoctor(@PathVariable("empId") int empId){
		return empDao.getdoctorbyid(empId);
	}
	@GetMapping("/getDoctorbytype/{empId}")
	public List<Doctor> getDoctorbytyoe(@PathVariable("empId") int empId){
		List<Doctor> dc=new ArrayList<Doctor>();
		List<Doctor> dc2= empDao.getdocbytypeid(empId);
		dc.add(dc2.get(1));
		dc.add(dc2.get(2));
		dc.add(dc2.get(3));
		return dc;
	}
	@PostMapping("/registerdoc")
	public Doctor register(@RequestBody Doctor doctor){
		return empDao.register(doctor);
	}
	@GetMapping("/getAlldoctors")
	public List<Doctor> getAllDoctor(){	
		return empDao.getAllDoctor();
	}
	@DeleteMapping("/deletedocbyid/{deptId}")
	public void deletedept(@PathVariable("deptId") int deptId) {
		empDao.deletebyid(deptId);
		
		}
	@PutMapping("/updatedoc")
	public Doctor update(@RequestBody Doctor doctor) {
		return empDao.register(doctor);
	}
	
}
