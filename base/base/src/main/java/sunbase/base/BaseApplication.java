package sunbase.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sunbase.base.entity.Customer;
import sunbase.base.repository.CustomerRepository;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@SpringBootApplication
public class BaseApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}




}
