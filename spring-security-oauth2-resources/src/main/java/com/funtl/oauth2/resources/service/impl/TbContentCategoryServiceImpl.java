package com.funtl.oauth2.resources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.resources.mapper.TbContentCategoryMapper;
import com.funtl.oauth2.resources.service.TbContentCategoryService;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
