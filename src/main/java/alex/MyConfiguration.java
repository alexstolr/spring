package alex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean//("proto6") Done be default
	public PrototypeBean proto6() {
		System.out.println("[Configuration] ceating bean...");
		PrototypeBean b = new PrototypeBean();
		b.x = 6;
		return b;
	}
	
}
