package org.shadow.mybatis_demo;

import java.util.List;

import org.shadow.mybatis_demo.entity.User;
import org.shadow.mybatis_demo.service.UserService;

public class App {
	public static void main(String[] args) {
		UserService service = new UserService();

		User user = new User();
		user.setId(6);
		user.setName("guest");
		user.setPassword("guest");
		user.setEmail("email@gmail.com");
		user.setCreateTime("2016-3-31 12:42:11");
		user.setLastTime("2016-3-31 12:42:11");
		
		System.out.println(service.insertUser(user));
		//System.out.println(service.deleteUser(2));
		System.out.println(service.updateUser(3, "2016-3-31 15:42:11"));
		
		System.out.println(service.getUser(4));
		
		List<User> list = service.getUserList();
		for(User u : list)
		{
			System.out.println(u);
		}
		
		
	}
}
