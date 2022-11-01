package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //返回json用restcontroller   返回页面用controller
public class ChapterController {

    @Resource
    private ChapterService ChapterService;
    @RequestMapping("/Chapter")
    public List<Chapter> course(){
       return ChapterService.getChapterList();
    }
}
