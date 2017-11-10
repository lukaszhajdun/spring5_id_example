package lukaszhajdun;

import lukaszhajdun.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5IdExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5IdExampleApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();
	}
}
