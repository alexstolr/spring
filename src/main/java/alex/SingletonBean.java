package alex;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") done by default
public class SingletonBean {
	
	public int x = new Random().nextInt();

	@PostConstruct
	public void init() {
		System.out.println("singleton x: " + x);
	}
	
}
