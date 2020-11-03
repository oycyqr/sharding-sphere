package com.oyc.shardingsphere.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.shardingsphere.domain.User;
import com.oyc.shardingsphere.mapper.UserMapper;
import com.oyc.shardingsphere.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List getUserAddressList() {
        return userMapper.getUserAddressList();
    }
}
