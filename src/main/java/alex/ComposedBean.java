package alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComposedBean {
	
	@Autowired
	private SingletonBean singletonBean;
	
	@Autowired
	@Qualifier("proto")
	private PrototypeBean prototypeBean;
	
	public int getProtoX() {
		return prototypeBean.x;
	}
	
	public int getSingleX() {
		return singletonBean.x;
	}

}
