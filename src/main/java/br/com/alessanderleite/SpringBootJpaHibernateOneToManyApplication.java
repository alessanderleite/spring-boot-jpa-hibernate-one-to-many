package br.com.alessanderleite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootJpaHibernateOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHibernateOneToManyApplication.class, args);
	}

}
