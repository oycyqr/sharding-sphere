package com.oyc.shardingsphere.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oyc.shardingsphere.domain.User;
import com.oyc.shardingsphere.service.UserService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description 用户控制类
 * @Author oyc
 * @Date 2020/11/05 10:56
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
     * @return 用户信息列表
     * @throws
     * @Description: 获取用户列表-all
     */
    @RequestMapping
    public List<User> userList() {
        logger.info("********TestController userList()");
        List<User> users = userService.list();
        return users;
    }

    /**
     * @param user 用户信息
     * @return 用户信息
     * @throws
     * @Description: 新增用户
     */
    @PostMapping
    public User save(User user) {
        logger.info("********save User");
        // user.setUserId(SnowflakeId.getId())
        userService.save(user);
        return user;
    }

    /**
     * @param user 用户
     * @return 用户信息
     * @throws
     * @Description: 更新用户
     */
    @PutMapping
    public User update(User user) {
        logger.info("********update User");
        userService.saveOrUpdate(user);
        return user;
    }

    /**
     * @param user 用户
     * @return 查询列表
     * @throws
     * @Description: 查询用户-按条件查询
     */
    @GetMapping("list")
    public Object getUser(User user) {
        logger.info("********s查询用户");
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.setEntity(user);
        //queryWrapper.orderByAsc("user_id");
        return userService.list(queryWrapper);
    }

    /**
     * 查询用户-指定数据源
     *
     * @return
     */
    @GetMapping("ds")
    public Object user() {
        logger.info("********查询用户 强制路由");
        HintManager hintManager = HintManager.getInstance();
        hintManager.setMasterRouteOnly();
        List<User> userList = userService.list();
        hintManager.close();
        return userList;
    }

    /**
     * 查询用户-地址
     *
     * @return
     */
    @GetMapping("ua")
    public Object userAddress() {
        logger.info("********查询用户 用户-地址");
        List list = userService.getUserAddressList();
        return list;
    }
}
