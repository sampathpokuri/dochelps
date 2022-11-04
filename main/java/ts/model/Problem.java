package ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Problem {

	private String type;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeid;

	public Problem(String type, int typeid) {
		super();
		this.type = type;
		this.typeid = typeid;
	}
	public Problem() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	
	
	
}
