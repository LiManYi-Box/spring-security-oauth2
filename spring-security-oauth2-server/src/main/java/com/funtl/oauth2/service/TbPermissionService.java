package com.funtl.oauth2.service;

import com.funtl.oauth2.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> selectByUserId(Long userId);

}
