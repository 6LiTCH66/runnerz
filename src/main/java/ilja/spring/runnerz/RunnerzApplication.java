package ilja.spring.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UserRestClient userRestClient) {
//		return args -> {
//			List<User> users = userRestClient.findAll();
//			System.out.println(users);
//
//			User user = userRestClient.findById(1);
//			System.out.println(user);
//
//		};
//	}

}
