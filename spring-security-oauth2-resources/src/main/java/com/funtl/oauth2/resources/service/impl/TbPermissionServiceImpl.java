package com.funtl.oauth2.resources.service.impl;

import com.funtl.oauth2.resources.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.resources.mapper.TbPermissionMapper;
import com.funtl.oauth2.resources.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> getTbPermissionAll() {
        return tbPermissionMapper.selectAll();
    }
}
