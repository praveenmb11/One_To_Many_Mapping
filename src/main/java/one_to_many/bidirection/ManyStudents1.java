package one_to_many.bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class ManyStudents1 {

	@Id
	private int id;
	private String name;
	private String skill;
	
	@ManyToOne
	OneTrainer1 oneTrainer1;

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

	public OneTrainer1 getOneTrainer1() {
		return oneTrainer1;
	}

	public void setOneTrainer1(OneTrainer1 oneTrainer1) {
		this.oneTrainer1 = oneTrainer1;
	}

	
	
	
	
}
