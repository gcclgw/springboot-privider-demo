package com.jk.mapper.login;

import com.jk.model.user.User;

public interface LoginMapper {
    //User loginUserName(String userName);

    User login(User user);
}
