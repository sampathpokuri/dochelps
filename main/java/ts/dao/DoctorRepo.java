package ts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import ts.model.Doctor;



@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
	
	@Query(value ="select d from Doctor d,Problem problem where d.problem.typeid = ?1")
	public List<Doctor> getDoctorByTypeId(int typeid);
	

}
