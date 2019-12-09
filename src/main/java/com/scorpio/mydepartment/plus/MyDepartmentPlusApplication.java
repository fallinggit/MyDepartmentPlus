package com.scorpio.mydepartment.plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName MyDepartmentPlusApplication
 * @Description TODO
 * @Author Scorpio
 * @Date 2019/12/9 8:20
 */
@SpringBootApplication
@MapperScan(basePackages = "com.scorpio.mydepartment.plus.mapper")
public class MyDepartmentPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDepartmentPlusApplication.class,args);
    }
}
