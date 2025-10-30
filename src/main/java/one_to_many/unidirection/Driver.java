package one_to_many.unidirection;

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
	
	ManyStudents manyStudents=new ManyStudents();
	manyStudents.setId(1);
	manyStudents.setName("Praveen");
	manyStudents.setSkill("Java Full Stack");
	
	ManyStudents manyStudents1=new ManyStudents();
	manyStudents1.setId(2);
	manyStudents1.setName("Gagan");
	manyStudents1.setSkill("Java Full Stack");
	
	ManyStudents manyStudents3=new ManyStudents();
	manyStudents3.setId(3);
	manyStudents3.setName("Nagesh");
	manyStudents3.setSkill("Python Full Stack");
	
	ManyStudents manyStudents4=new ManyStudents();
	manyStudents4.setId(4);
	manyStudents4.setName("Nidish");
	manyStudents4.setSkill("Java Full Stack");
	
	OneTrainer oneTrainer=new OneTrainer();
	oneTrainer.setId(11);
	oneTrainer.setName("Kiran");
	oneTrainer.setSkill("Full stack");
	
	List<ManyStudents> list=new ArrayList<ManyStudents>();
	      list.add(manyStudents);
	      list.add(manyStudents1);
	      list.add(manyStudents3);
	      list.add(manyStudents4);
	      
	      //Mapping
	      oneTrainer.setLms(list);
	      
	      entityTransaction.begin();
	      entityManager.persist(oneTrainer);
	      entityManager.persist(manyStudents);
	      entityManager.persist(manyStudents1);
	      entityManager.persist(manyStudents3);
	      entityManager.persist(manyStudents4);
	      entityTransaction.commit();
	      
}
}
