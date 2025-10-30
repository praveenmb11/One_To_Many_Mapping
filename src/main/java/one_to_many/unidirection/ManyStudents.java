package one_to_many.unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ManyStudents {

	@Id
	private int id;
	private String name;
	private String skill;
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
	
}
