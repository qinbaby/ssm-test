package org.ssm.test.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssm.test.service.UserService;
import org.ssm.test.vo.User;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(value="/getUser", method=RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public User getUser(String id){
		return userService.getUserById(Integer.parseInt(id));
	} 
}
