package pers.hhqiwei.gradle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"pers.hhqiwei.gradle.controller", "pers.hhqiwei.gradle.service"})
@MapperScan(basePackages= {"pers.hhqiwei.gradle.entity.mapper"})
public class SpringbootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGradleApplication.class, args);
    }

}
