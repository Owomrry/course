package com.course.server.service;

import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import com.course.server.domain.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> getTestList() {
        /** 单表的增删改查 生成的Example就行了不用写sql **/
        TestExample testExample = new TestExample();
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
        // 和mubatis-plus 用法挺像的
    }
}
