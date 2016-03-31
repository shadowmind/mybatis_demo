package org.shadow.mybatis_demo.service;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.shadow.mybatis_demo.dao.UserDao;
import org.shadow.mybatis_demo.entity.User;

public class UserService {

	private UserDao userDao;
	
	public UserService()
	{
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		
		userDao = session.getMapper(UserDao.class);
	}
	
	public User getUser(int id)
	{
		return userDao.getUser(id);
	}
	
	public List<User> getUserList()
	{
		return userDao.getUserList();
	}
	
	public int deleteUser(int id)
	{
		return userDao.deleteUser(id);
	}
	
	public int updateUser(int id, String lastTime)
	{
		return userDao.updateUser(id, lastTime);
	}
	
	public int insertUser(User user)
	{
		return userDao.insertUser(user);
	}
	
}
