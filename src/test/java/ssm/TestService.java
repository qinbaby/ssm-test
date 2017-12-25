package ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.test.service.UserService;
import org.ssm.test.vo.User;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class TestService {
	@Autowired
    public UserService userService;
    
    @Test
    public void getUserByIdTest(){
     
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }
}
