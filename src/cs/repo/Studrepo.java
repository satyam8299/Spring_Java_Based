package cs.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cs.bean.Stud;

@Configuration
public class Studrepo {
	@Bean
	public Stud s1() {
		Stud s = new Stud();
		s.setId(123);
		s.setName("Satyam Singh");
		s.setMobno("98399XXXXX");
		return s;
		
	}

}
