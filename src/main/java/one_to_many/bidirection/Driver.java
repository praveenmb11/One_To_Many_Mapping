package one_to_many.bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		ManyStudents1 manyStudents1=new ManyStudents1();
		manyStudents1.setId(12);
		manyStudents1.setName("Praveen");
		manyStudents1.setSkill("java ");
		
		ManyStudents1 manyStudents2=new ManyStudents1();
		manyStudents2.setId(13);
		manyStudents2.setName("NAgesh");
		manyStudents2.setSkill("java ");
		
		ManyStudents1 manyStudents3=new ManyStudents1();
		manyStudents3.setId(14);
		manyStudents3.setName("Gagan");
		manyStudents3.setSkill("Python ");
		
		ManyStudents1 manyStudents4=new ManyStudents1();
		manyStudents4.setId(15);
		manyStudents4.setName("Nidish");
		manyStudents4.setSkill("java ");
		
		OneTrainer1 oneTrainer1=new OneTrainer1();
		
		oneTrainer1.setId(101);
		oneTrainer1.setName("Kiran");
		oneTrainer1.setCourse("Spring Boot");
		
		List<ManyStudents1> list=new ArrayList<ManyStudents1>();
		list.add(manyStudents1);
		list.add(manyStudents2);
		list.add(manyStudents3);
		list.add(manyStudents4);
		
		oneTrainer1.setList(list);

		manyStudents1.setOneTrainer1(oneTrainer1);
		manyStudents2.setOneTrainer1(oneTrainer1);
		manyStudents3.setOneTrainer1(oneTrainer1);
		manyStudents4.setOneTrainer1(oneTrainer1);
		
		entityTransaction.begin();
		entityManager.persist(oneTrainer1);
		entityManager.persist(manyStudents1);
		entityManager.persist(manyStudents2);
		entityManager.persist(manyStudents3);
		entityManager.persist(manyStudents4);
		entityTransaction.commit();
		
		
		
	}
}
