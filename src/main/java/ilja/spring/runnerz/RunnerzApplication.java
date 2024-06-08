package ilja.spring.runnerz;

import ilja.spring.runnerz.user.User;
import ilja.spring.runnerz.user.UserRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
