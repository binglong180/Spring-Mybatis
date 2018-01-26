package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.User;
import com.spring.service.UserService;

public class MyTest {
	ApplicationContext act = new ClassPathXmlApplicationContext(
			"application-mybatis.xml");
	UserService userService = (UserService) act.getBean("userService");
	User user = new User();
	@Test
	public void test() {
		user.setUserCode("111");
		user.setUserName("测试名");
		user.setUserPassword("1111111");
		user.setAddress("测试地址");

		try {
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd")
					.parse("1992-10-10"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		user.setGender(12);
		user.setPhone("1111111111");
		user.setUserRole(1);
		user.setCreationDate(new Date());
		user.setCreatedBy(1);
		List<User> list=new ArrayList<User>();
		list.add(user);
		list.add(user);
		userService.addUserList(list);
	}
	@Test
	public void test1(){
		user.setUserName("赵");
		user.setUserRole(3);
		System.out.println(userService.getAllUserList(user));
	}
}
