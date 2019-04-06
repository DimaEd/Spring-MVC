package com.service;

import com.shema.User;

public interface UserService {
    User addUser(User user);
    void delete(long id);
    User getUser();
}
