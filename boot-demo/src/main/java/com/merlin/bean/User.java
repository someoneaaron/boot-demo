/**
 * Project Name:boot-demo
 * File Name:User.java
 * Package Name:com.merlin.bean
 * Date:2016年10月29日上午10:06:29
 * Copyright (c) 2016, 思建科技 All Rights Reserved.
 *
*/

package com.merlin.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2016年10月29日 上午10:06:29 <br/>
 * @author   Merlin
 * @version
 * @since    JDK 1.6
 */
@Entity
public class User implements Serializable
{
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -7545672957306898205L;
    @Id
    private Long id;
    private String userName;
    private String phone;
    private Date createTime;
    private Date updateTime;

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public Date getCreateTime()
    {
        return createTime;
    }
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    public Date getUpdateTime()
    {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

}

