package org.shadow.mybatis_demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.shadow.mybatis_demo.entity.User;

public interface UserDao {
	public User getUser(@Param("id") int id);
	
	public List<User> getUserList();
	
	public int deleteUser(@Param("id") int id);
	
	public int updateUser(@Param("id") int id, @Param("lastTime") String lastTime);
	
	public int insertUser(User user);
}
