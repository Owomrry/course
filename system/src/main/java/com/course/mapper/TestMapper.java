package com.course.mapper;

import com.course.domain.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestMapper {
  public List<Test> list();
}
