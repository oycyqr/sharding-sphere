package com.oyc.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Description: (User)实体类
 * @Author oyc
 * @Date 2020/11/05 10:36
 * @Version 1.0
 */
@Data
//@TableName("user_ms")
public class User implements Serializable {

    private static final long serialVersionUID = 358157380505039579L;

//    @TableId
    private Long userId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 原始密码
     */
    private String password;

    /**
     * md5加密后的密码
     */
    private String md5Password;

    /**
     * 原始密码
     */
    private String password1;

    /**
     * aes加密后的密码
     */
    private String aesPassword;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
