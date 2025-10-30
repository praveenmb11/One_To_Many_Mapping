package one_to_many.unidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OneTrainer {

	@Id
	private int id;
	private String name;
	private String skill;
	@OneToMany
	List<ManyStudents> lms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public List<ManyStudents> getLms() {
		return lms;
	}
	public void setLms(List<ManyStudents> lms) {
		this.lms = lms;
	}
	
}
