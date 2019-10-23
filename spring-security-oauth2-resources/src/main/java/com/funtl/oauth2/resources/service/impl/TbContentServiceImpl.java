package com.funtl.oauth2.resources.service.impl;

import com.funtl.oauth2.resources.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.resources.mapper.TbContentMapper;
import com.funtl.oauth2.resources.service.TbContentService;

import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
