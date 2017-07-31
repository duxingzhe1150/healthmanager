package com.gb.health.dao;


import com.gb.health.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
