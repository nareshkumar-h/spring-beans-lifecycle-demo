import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.beans.AwareBean;
import com.naresh.beans.UserBean;
import com.naresh.config.Config;

public class TestAwareBean {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		AwareBean awareBean = ctx.getBean("awareBean", AwareBean.class);
		awareBean.hello();
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
