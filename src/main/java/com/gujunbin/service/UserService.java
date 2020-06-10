package com.gujunbin.service;

import com.gujunbin.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
