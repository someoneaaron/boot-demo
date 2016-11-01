/**
 * Project Name:boot-demo
 * File Name:UserRepository.java
 * Package Name:com.merlin.dao
 * Date:2016年10月29日下午1:34:11
 * Copyright (c) 2016, 思建科技 All Rights Reserved.
 *
*/

package com.merlin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlin.bean.User;

/**
 * ClassName:UserRepository <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2016年10月29日 下午1:34:11 <br/>
 * @author   Merlin
 * @version
 * @since    JDK 1.8
 */
public interface UserRepository extends JpaRepository<User, Long>
{

}

