package com.oyc.shardingsphere.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oyc.shardingsphere.domain.User;

import java.util.List;

/**
 * User)表数据库访问层
 *
 * @author oyc
 * @Date 2020-11-03 23:21:52
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 用户-地址
     * @return
     */
    List getUserAddressList();

}
