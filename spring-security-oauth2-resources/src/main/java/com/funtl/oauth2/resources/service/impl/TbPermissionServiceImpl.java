package com.funtl.oauth2.resources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.resources.mapper.TbPermissionMapper;
import com.funtl.oauth2.resources.service.TbPermissionService;
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

}
