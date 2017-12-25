package org.ssm.test.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.test.dao.UserDao;
import org.ssm.test.service.UserService;
import org.ssm.test.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public User getUserById(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

}
