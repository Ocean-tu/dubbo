package com.tu.dubbo.service.impl;

import com.tu.dubbo.service.UserService;

/**
 * 服务提供者接口实现
 * @author tx
 * 2019年1月3日17:35:29
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getName(String userId) {
        return "tx"+userId;
    }
}
