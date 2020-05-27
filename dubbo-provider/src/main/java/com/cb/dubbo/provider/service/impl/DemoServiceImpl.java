package com.cb.dubbo.provider.service.impl;

import com.cb.clouds.dubboapi.service.DemoService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenbin
 * @Description:
 * @date 2018-03-01 14:30
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        return name;
    }
}
