package com.course.server.service;

import com.course.server.Dto.ChapterDto;
import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.ChapterMapper;
import com.course.server.mapper.TestMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {
    @Resource
    private ChapterMapper chapterMapper;
    public List<ChapterDto> getChapterList() {
        /** 单表的增删改查 生成的Example就行了不用写sql **/
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        // 和mubatis-plus 用法挺像的
        // 新new一个chapter赋值给数据传输chapterDto
        ArrayList<ChapterDto> chapterDaoList = new ArrayList<>();
        for (int i = 0; i < chapters.size(); i++) {
            Chapter chapter = chapters.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDaoList.add(chapterDto);
        }
        return chapterDaoList;

    }
}
