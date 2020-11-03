package com.oyc.shardingsphere.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oyc.shardingsphere.domain.User;
import com.oyc.shardingsphere.mapper.UserMapper;
import com.oyc.shardingsphere.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TestController
 * @Author oyc
 * @Date 2020/11/03 16:56
 * @Version
 */
@RestController
@RequestMapping("user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * user mapper
     */
    @Resource
    private UserService userService;

    /**
     * 用户列表
     *
     * @return
     */
    @RequestMapping
    public List<User> userList() {
        logger.info("********TestController userList()");
        List<User> users = userService.list();
        return users;
    }

    /**
     * 保存用户
     *
     * @return
     */
    @PostMapping
    public User save(User user) {
        logger.info("********save User");
        // user.setUserId(SnowflakeId.getId())
        userService.save(user);
        return user;
    }

    /**
     * 查询用户-条件
     *
     * @return
     */
    @GetMapping("list")
    public Object getUser(User user) {
        logger.info("********s查询用户");
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.setEntity(user);
        //queryWrapper.ge("user_id",1002)
        queryWrapper.orderByAsc("user_id");
        return userService.list(queryWrapper);
    }
}