package alex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="alex")
public class AlexApplication {
	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AlexApplication.class);
		PrototypeBean b1 = ctx.getBean("proto",PrototypeBean.class);
		PrototypeBean b2 = ctx.getBean("proto",PrototypeBean.class);
		SingletonBean b3 = ctx.getBean(SingletonBean.class);
		SingletonBean b4 = ctx.getBean(SingletonBean.class);
		PrototypeBean proto6 = ctx.getBean("proto6", PrototypeBean.class);
		
		//System.out.println("proto6 x " + proto6.x);
	 }
}
