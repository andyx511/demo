package com.alex.demo;

import com.alex.demo.entity.AmsAddress;
import com.alex.demo.service.AmsAddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2020/5/21 14:07
 * @Author ALexNi
 */
@SpringBootTest
public class MyTest {

    @Autowired
    private AmsAddressService service;

    @Test
    public void la(){
        AmsAddress amsAddress = service.queryById(9);
        System.out.println(amsAddress.toString());
    }

}
