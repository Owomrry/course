package com.course.controller;

import com.course.server.domain.Test;
import com.course.server.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController  //返回json用restcontroller   返回页面用controller
@RequestMapping("/system")
public class TestController {

    @Resource
    private TestService testService;
    @RequestMapping("/test")
    public List<Test> pdd(){
       return testService.getTestList();
    }
}
