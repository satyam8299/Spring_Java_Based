package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cs.bean.Stud;
import cs.repo.Studrepo;

public class SpringJava {
	 public static void main(String[] args) {
		 ApplicationContext a = new AnnotationConfigApplicationContext(Studrepo.class);
		 Stud s = (Stud) a.getBean("s1");
		 s.display();
	 }

}
