package com.scorpio.mydepartment.plus.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 * @ClassName Article
 * @Description TODO
 * @Author Scorpio
 * @Date 2019/12/9 20:56
 */
@Data
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "article_tag")
    private String articleTag;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_type")
    private String articleType;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}