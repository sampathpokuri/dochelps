package ts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ts.model.Problem;

@Service
public class ProblemDao {
	@Autowired
	private ProblemRepo crp;
	
	public Problem register(Problem cus) {
		return crp.save(cus);
	}
	public void deletebyid(int id) {
		 crp.deleteById(id);
	}
	public List<Problem> getAllProblem() {
		return crp.findAll();
	}
	public Problem getcustomerbyid(int id) {
	return crp.findById(id).orElse(new Problem());
	}
	
	
}
