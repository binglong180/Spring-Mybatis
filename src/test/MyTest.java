package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.User;
import com.spring.service.UserService;

public class MyTest {
	ApplicationContext act=new ClassPathXmlApplicationContext("application-mybatis.xml");
	@Test
	public void test(){
		UserService userService=(UserService) act.getBean("userService");
		User user=new User();
		user.setUserName("赵");
		user.setUserRole(3);
		List<User> userList = userService.getAllUserList(user);
		System.out.println(userList);
	}
}
