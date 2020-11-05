package com.oyc.shardingsphere.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyc.shardingsphere.domain.User;

import java.util.List;

/**
 * @author oyc
 * @date 2020-11-03 23:21:52
 */
public interface UserService extends IService<User> {
    /**
     * 查询用户、地址
     * @return
     */
    List getUserAddressList();
}
