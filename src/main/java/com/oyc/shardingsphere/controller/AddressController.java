package com.oyc.shardingsphere.controller;

import com.oyc.shardingsphere.mapper.AddressMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AddressController
 * @Description AddressController
 * @Author oyc
 * @Date 2020/11/05 16:56
 * @Version
 */
@RestController
@RequestMapping("address")
public class AddressController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private AddressMapper addressMapper;

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping
    public List List() {
        logger.info("********addressMapper list()");
        return addressMapper.selectList(null);
    }

}
