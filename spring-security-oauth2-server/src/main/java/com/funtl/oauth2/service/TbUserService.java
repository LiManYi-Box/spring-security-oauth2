package com.funtl.oauth2.service;

import com.funtl.oauth2.domain.TbUser;

public interface TbUserService{

    TbUser getByName(String username);

}
