package com.course.server.mapper;


import com.course.server.domain.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestMapper {
  public List<Test> list();
}
