package com.service.impl;

import com.config.AppConfig;
import com.repository.UserRepository;
import com.service.UserService;
import com.shema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    AnnotationConfigApplicationContext annotatedClassApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    UserServiceImpl userService = annotatedClassApplicationContext.getBean("userService", UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return user;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public User getUser(String name) {
        Optional<User> one = userService.getUserRepository().findById(Long );
        one.ifPresent(System.out::println);
        return null;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
