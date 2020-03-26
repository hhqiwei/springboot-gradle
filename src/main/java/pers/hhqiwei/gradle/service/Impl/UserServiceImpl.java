package pers.hhqiwei.gradle.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.hhqiwei.gradle.entity.User;
import pers.hhqiwei.gradle.entity.mapper.UserMapper;
import pers.hhqiwei.gradle.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> list =userMapper.getUserList();
        return list;
    }
}
