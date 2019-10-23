package com.funtl.oauth2.service.impl;

import com.funtl.oauth2.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.mapper.TbUserMapper;
import com.funtl.oauth2.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByName(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }

}
