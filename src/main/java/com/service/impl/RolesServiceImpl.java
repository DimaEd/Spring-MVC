package com.service.impl;

import com.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl {
    @Autowired
    private RolesRepository rolesRepository;

}
