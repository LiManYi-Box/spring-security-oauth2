package com.funtl.oauth2.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.mapper.TbRoleMapper;
import com.funtl.oauth2.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;


}
