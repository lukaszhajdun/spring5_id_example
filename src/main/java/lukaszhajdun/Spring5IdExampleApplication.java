package lukaszhajdun;

import lukaszhajdun.controllers.ConstructorInjectedController;
import lukaszhajdun.controllers.GetterInjectedController;
import lukaszhajdun.controllers.MyController;
import lukaszhajdun.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5IdExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5IdExampleApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
