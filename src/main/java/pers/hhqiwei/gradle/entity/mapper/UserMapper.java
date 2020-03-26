package pers.hhqiwei.gradle.entity.mapper;

import org.springframework.stereotype.Component;
import pers.hhqiwei.gradle.entity.User;

import java.util.List;

@Component
public interface UserMapper {
    List<User> getUserList();
}
