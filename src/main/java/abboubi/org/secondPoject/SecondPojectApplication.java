package abboubi.org.secondPoject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*
@EnableJpaRepositories to scan the specified package for repositories
@EntityScan to pick up our JPA entities
*/
@EnableJpaRepositories
@EntityScan("abboubi.org.secondPoject")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SecondPojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondPojectApplication.class, args);
	}

}
