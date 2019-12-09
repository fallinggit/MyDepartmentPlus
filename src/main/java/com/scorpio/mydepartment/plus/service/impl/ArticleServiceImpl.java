package com.scorpio.mydepartment.plus.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.scorpio.mydepartment.plus.mapper.ArticleMapper;
import com.scorpio.mydepartment.plus.service.ArticleService;
/**
  *
  * @ClassName ArticleServiceImpl
  * @Description TODO
  * @Author Scorpio
  * @Date 2019/12/9 20:56
  */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Resource
    private ArticleMapper articleMapper;

}
