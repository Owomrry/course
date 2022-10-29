package com.course.service;

import com.course.domain.Test;
import com.course.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> getTestList() {
        return testMapper.list();
    }
}
