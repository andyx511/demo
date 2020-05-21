package com.alex.demo.controller;

import com.alex.demo.entity.AmsAddress;
import com.alex.demo.service.AmsAddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsAddress)表控制层
 *
 * @author makejava
 * @since 2020-05-15 14:35:06
 */
@RestController
@RequestMapping("amsAddress")
public class AmsAddressController {
    /**
     * 服务对象
     */
    @Resource
    private AmsAddressService amsAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AmsAddress selectOne(Integer id) {
        return this.amsAddressService.queryById(id);
    }

}