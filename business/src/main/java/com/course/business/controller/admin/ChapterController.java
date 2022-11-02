package com.course.business.controller.admin;

import com.course.server.Dto.ChapterDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //返回json用restcontroller   返回页面用controller
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService ChapterService;
    @RequestMapping("/Chapter")
    public List<ChapterDto> course(){
       return ChapterService.getChapterList();
    }
}
