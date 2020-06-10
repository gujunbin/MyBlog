package com.gujunbin.service;

import com.gujunbin.dao.UserRepository;
import com.gujunbin.po.User;
import com.gujunbin.util.MD5Utils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
