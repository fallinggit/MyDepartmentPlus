package com.scorpio.mydepartment.plus;
import java.util.Date;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scorpio.mydepartment.plus.domain.Article;
import com.scorpio.mydepartment.plus.mapper.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName MyDepartmentPlusApplicationTests
 * @Description TODO
 * @Author Scorpio
 * @Date 2019/12/9 9:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class MyDepartmentPlusApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testSelectAll() {
        List<Article> articles = articleMapper.selectAll();
        articles.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        Article article = new Article();
        article.setArticleTag("思想建设");
        article.setArticleTitle("观影活动");
        article.setArticleType("纯文本");
        article.setCreateTime(new Date());
        article.setFileUrl("1");
        article.setImgUrl("1");
        article.setUpdateTime(new Date());

        articleMapper.insert(article);
    }

    @Test
    public void testUpdate() {
        Article article = articleMapper.selectByPrimaryKey(2);
        article.setArticleTitle("党风建设");

        articleMapper.updateByPrimaryKey(article);
    }

    @Test
    public void testDelete() {
            articleMapper.deleteByPrimaryKey(46);

    }

    @Test
    public void testPage() {
        PageHelper.startPage(1,5);
        PageInfo<Article> pageInfo = new PageInfo<>(articleMapper.selectAll());
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        pageInfo.getList().forEach(System.out::println);
    }
}
