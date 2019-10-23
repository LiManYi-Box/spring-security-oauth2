package com.funtl.oauth2.resources.config;

import com.funtl.oauth2.resources.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true,jsr250Enabled = true,securedEnabled = true)
public class ResourcesServerConfiguration extends ResourceServerConfigurerAdapter {

    @Autowired
    TbPermissionService tbPermissionService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/")
                .hasAnyAuthority("SystemContent")
                .antMatchers("/view/**")
                .hasAnyAuthority("SystemContentView")
        ;
    }
}
