/**
 * Project Name:boot-demo
 * File Name:HelloController.java
 * Package Name:com.merlin
 * Date:2016年10月28日下午1:39:36
 * Copyright (c) 2016, 思建科技 All Rights Reserved.
 *
*/

package com.merlin.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merlin.bean.User;
import com.merlin.dao.UserRepository;

/**
 * ClassName:UserController <br/>
 * Date:     2016年10月28日 下午1:39:36 <br/>
 * @author   Merlin
 * @since    JDK 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Resource
    private UserRepository userDao;

    @RequestMapping(method = RequestMethod.GET, value= "/{userId}")
    User getOne(@PathVariable("userId") Long userId)
    {
        return userDao.findOne(userId);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<User> getAll()
    {
        return userDao.findAll();
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH}, consumes = "application/json")
    User save(@RequestBody User user)
    {
        return userDao.save(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    boolean delete(Long userId)
    {
        userDao.delete(userId);
        return true;
    }
}
