import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.beans.UserBean;
import com.naresh.config.Config;

public class TestUserBean {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserBean userBean = ctx.getBean("userBean", UserBean.class);
		userBean.hello();
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
