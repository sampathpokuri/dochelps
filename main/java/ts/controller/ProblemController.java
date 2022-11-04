package ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ts.dao.ProblemDao;
import ts.model.Problem;

@RestController
public class ProblemController {

	@Autowired
	ProblemDao empDao;

	@GetMapping("/getproblem/{empId}")
	public Problem getproblems(@PathVariable("empId") int Id){
      return empDao.getcustomerbyid(Id);
	}
	@PostMapping("/registerProblem")
	public Problem register(@RequestBody Problem problem){
		return empDao.register(problem);
	}
	@GetMapping("/getallproblem")
	public List<Problem> getAllProblem(){	
		return empDao.getAllProblem();
	}
	@DeleteMapping("/deleteproblembyid/{deptId}")
	public void deletedept(@PathVariable("deptId") int deptId) {
		empDao.deletebyid(deptId);
		
		}
	@PutMapping("/updateproblem")
	public Problem update(@RequestBody Problem Problem) {
		return empDao.register(Problem);
	}
	
	
}
