package alex;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("proto")
@Scope("prototype")
public class PrototypeBean {

	public int x = new Random().nextInt();
	
	@PostConstruct
	public void init() {
		System.out.println("[init] prototype x: " + x);
	}
}
