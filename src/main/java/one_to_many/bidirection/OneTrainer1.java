package one_to_many.bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OneTrainer1 {

	@Id
	private int id;
	private String name;
	private String course;
	
	@OneToMany
	List<ManyStudents1> list;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<ManyStudents1> getList() {
		return list;
	}

	public void setList(List<ManyStudents1> list) {
		this.list = list;
	}
}
