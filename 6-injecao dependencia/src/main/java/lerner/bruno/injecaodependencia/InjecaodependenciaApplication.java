package lerner.bruno.injecaodependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:10
 */
@SpringBootApplication
public class InjecaodependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(InjecaodependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}
}
