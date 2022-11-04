package ts.dao;

import ts.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProblemRepo extends JpaRepository<Problem, Integer>{

}
