package com.funtl.oauth2.resources.contorller;

import com.funtl.oauth2.resources.domain.TbContent;
import com.funtl.oauth2.resources.dto.ResponseResult;
import com.funtl.oauth2.resources.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {
    @Autowired
    private TbContentService tbContentService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseResult<List<TbContent>> list(){
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),tbContentService.selectAll());
    }


}
