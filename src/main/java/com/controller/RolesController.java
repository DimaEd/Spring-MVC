package com.controller;

import com.service.impl.RolesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RolesController {
    @Autowired
    private RolesServiceImpl rolesService;
}
