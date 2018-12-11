package alex.intercept;

import java.lang.reflect.Field;
import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import alex.PrototypeBean;

@Component
public class EventInterceptor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if( bean instanceof alex.PrototypeBean) {
			System.out.println("The value of x for bean " + beanName + " will be changed if it is odd!");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if( bean instanceof alex.PrototypeBean) {
			Random rand = new Random();
			PrototypeBean b = (PrototypeBean) bean;
			if((b.x & 1) == 1) {
				System.out.println("The value of x is odd: " + b.x);
				while((b.x & 1) == 1) {
					b.x = rand.nextInt();
				}
				System.out.println("changed to new value: " + b.x);
			}
		}
		return bean;
	}

}
