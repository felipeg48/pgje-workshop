package mx.gob.pgje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactosApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner process(ContactRepository repo) {
	// return args -> {
	// repo.save(new Contact("dan@example.com","Dan","1-800"));
	// repo.save(new Contact("mark@example.com","Mark","1-800"));
	// repo.save(new Contact("mike@example.com","Mike","1-800"));
	// repo.findByNameContains("a").forEach(System.out::println);
	// };
	// }
}
