package ssm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ssm.test.service.UserService;
import org.ssm.test.vo.User;

public class TestService2 {

	@Test
	public void testGetUserById(){
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService uService = (UserService) application.getBean("userService");
        User user = uService.getUserById(1);
        System.out.println(user.getUserName());
	}
}
